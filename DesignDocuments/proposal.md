# Pet Inventory Project Proposal

## What are you building?
We are building a **Pet Inventory** application using Java and the MVC design pattern. The application allows users to view a collection of pets, search, filter, and sort them, as well as save and load pet data. Users can also create a list of their desired pets.

---

## What are the initial features for the application?
- See all available pets
- View pet details
- Save filtered list of pets as CSV or JSON (decide on one format)

---

## What are the minimum additional features you plan to implement?
- Sort pets by name, age, breed, and weight
- Filter pets by gender, age, breed, and weight
- Search pets by name

---

## What are your stretch goals (features beyond the minimum)?
- Add new pets to the inventory
- Save/load the desired pet list
- Add/Delete pets from the desired list
- Search inventory within filtered pets (last to implement if it comes to it)
---

## Initial Design

We will use the **MVC architecture**:

### Model:
- `Pet` (abstract), `Dog`, `Cat`
- `Inventory` (manages all pets)
- `DesiredPetList` (manages selected pets)
- `SearchFilter` (logic for searching and filtering)
- `FileHandler` (loads/saves pets from/to JSON or CSV)

### View:
- `MainFrame` (main window)
- `PetListPanel`, `FilterPanel`, `SearchPanel`, `PetDetailPanel`

### Controller (lightweight):
- `PetInventoryApp` (main entry point, sets up app)

---

## UML Diagram

We created a detailed UML diagram stored at [UML.md](../DesignDocuments/UML.md) that reflects the complete class structure, fields, and methods. It includes all planned functionality and follows the MVC structure.

---

## How do you plan to break up the work?

We have 3 team members. Each person is assigned one area of responsibility to ensure clear ownership and parallel development.

### Yevgeniy – **View/UI Designer**

	•	Build the GUI using Java Swing: MainFrame, PetListPanel, FilterPanel, SearchPanel, PetDetailPanel
	•	Display the full pet inventory and detailed pet information
	•	Implement user interactions for filtering, searching, viewing details, and managing the desired list
	•	Design and wire buttons for actions such as “Add to Desired List”, “Remove from Desired List”, “Save”, and “Load”
	•	Ensure the UI updates appropriately when the pet list changes (e.g., after filtering or loading)
	•	Collaborate with the controller to trigger logic methods in response to UI events
	•	Make the application intuitive and user-friendly

### Margo – **Model Developer**

	•	Implement all pet-related classes: Pet (abstract), Dog, Cat, Inventory, and DesiredPetList
	•	Provide methods for adding, removing, and retrieving pets in both the full inventory and the desired list
	•	Implement sorting functionality by name, age, breed, and weight
	•	Manage unique identifiers (IDs) for all pets to ensure consistent referencing across modules
	•	Validate pet data before adding to lists (e.g., no negative ages or weights)
	•	Ensure the model is testable and functions independently of the UI

### Wen – **Data & Features Developer**

	•	Build the FileHandler class to handle saving/loading pets to/from CSV and JSON formats
	•	Ensure file operations support both the full inventory and the desired pet list
	•	Implement the SearchFilter class with filtering logic (by age, breed, gender, weight) and name-based searching
	•	Enable searching within filtered results as a stretch goal
	•	Handle malformed or missing file data gracefully (e.g., error handling and default values)
	•	Coordinate with Person B to ensure file I/O aligns with data structure expectations
	•	Provide unit tests for file and filtering logic

**Shared tasks:**
- UML diagrams (initial + final)
- Documentation (manual, Javadoc, README)
- JUnit tests for each component
- Demo presentation

---

## Timeline and Checkpoints

| Week     | Tasks                                                                                                                                                          |
|----------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Week 1** | Finalize project idea, responsibilities, and UML diagram. Set up GitHub repo with folders for `model`, `view`, `controller`, `docs`, and `tests`. Each team member creates their working branch. DONE|
| **Week 2** | Begin feature development in separate branches:  <br>• Model Developer: Implement `Pet`, `Dog`, `Cat`, `Inventory`, and `DesiredPetList` using mock data  <br>• Data & Features Developer: Build `SearchFilter` and begin `FileHandler` with dummy data  <br>• UI Designer: Create GUI structure with placeholder panels. WE ARE HERE|
| **Week 3** | Integrate model, logic, and GUI:  <br>• Wire up UI actions to logic (e.g., search, add/remove pets)  <br>• Connect file operations (save/load)  <br>• Perform unit tests for each module and resolve bugs  <br>• Stretch goals (e.g., delete from desired list, search in filtered view). |
| **Week 4** | Final testing and polish:  <br>• Complete error handling and edge cases  <br>• Finalize all documentation: user manual, Javadoc, README  <br>• Dry run of live demo and UI refinements. |
| **Week 5** | Submit final version of the project  <br>• Record or conduct live demo  <br>• Each member completes an individual retrospective and feedback report. |

---

## Git Collaboration Plan

- Each team member works in their own feature branch:
  - `GUI` – Yevgeniy(View/UI Designer)
  - `Inventory - Model` – Margo (Model Developer)
  - `filehandle` – Wen (Data & Features Developer)

- **Workflow:**
  - Commit regularly with clear, descriptive messages
  - Push branch to GitHub frequently

- **Pull Requests (PR):**
  - Open a PR to `main` when a feature is complete and tested
  - Assign at least one team member to review the PR
  - Merge only after approval and resolving any conflicts

- **Syncing with `main`:**
  - Regularly pull from `main` into working branch to stay up to date:
    ```
    git checkout your-branch
    git pull origin main
    ```

- **Best Practices:**
  - Avoid committing directly to `main`
  - Use `.gitignore` to avoid pushing system or IDE files
  - ASK FOR HELP

