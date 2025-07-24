# Pet Inventory Project Proposal

## What are you building?
We are building a **Pet Inventory** application using Java and the MVC design pattern. The application allows users to view a collection of pets, search, filter, and sort them, as well as save and load pet data. Users can also create a list of their desired pets.

---

## What are the initial features for the application?
- See all available pets
- View pet details
- Save filtered list of pets as CSV or JSON (decide on one format)
- Graphical User Interface

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
- `SortFilter` - sorting logic


### View:
- `MainFrame` (main window)
- `PetListPanel`, `FilterPanel`, `SearchPanel`, `PetDetailPanel`

### Controller (lightweight):
- `PetInventoryApp` (main entry point, sets up app)
- `FileHandler` (loads/saves pets from/to JSON)
- `SearchFilter` (logic for searching and filtering)

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

### Wen – **Controller Developer**

	•	Build the FileHandler class to handle saving/loading pets to/from JSON formats
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

## 📅 Detailed Timeline by Role

| **Week**   | **GUI (Person A)**                                                                                                                                       | **Model (Person B)**                                                                                                                                                                 | **Data/File (Person C)**                                                                                                                                                    |
|------------|----------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Week 1** | ✅ Set up `ui-design` branch <br> ✅ Help finalize UML for GUI-related classes <br> ✅ Review planned panel components (PetList, Filter, Search, Detail) | ✅ Set up `inventory-model` branch <br> ✅ Finalize class structure for `Pet`, `Dog`, `Cat`, `Inventory`, `DesiredPetList` in UML <br> ✅ Plan how to generate and manage unique IDs | ✅ Set up `file-search` branch <br> ✅ Outline method signatures for `FileHandler` and `SearchFilter` <br> ✅ Review JSON/CSV format needed for file I/O                     |
| **Week 2** | 🔧 Create layout for `MainFrame` using placeholder panels <br> 🔧 Build `PetListPanel`, `FilterPanel`, `SearchPanel`, `PetDetailPanel` with dummy labels <br> 🧪 Load and display mock pet list in UI | 🧱 Implement base classes: `Pet`, `Dog`, `Cat` with sample attributes and methods <br> 🧱 Build `Inventory` and `DesiredPetList` with `add`, `remove`, `getAll` <br> 🧪 Fill with mock pets | 🧪 Create initial version of `SearchFilter` with methods for filtering by age, breed, gender, weight <br> 🧱 Start `FileHandler` with stub methods for load/save in CSV and JSON |
| **Week 3** | 🔌 Connect UI buttons to logic: search, filter, add to desired list <br> 🔍 Implement pet detail view (click → display info) <br> 💾 Add Save/Load button placeholders | 🔄 Add sorting methods in `Inventory` (by name, age, breed, weight) <br> 🧹 Implement `removeById()` in both lists <br> 🧪 Handle edge cases (empty list, invalid ID) | 💾 Complete file save/load methods in `FileHandler` for both lists <br> 🔍 Implement `searchByName` method <br> 🧪 Test search + filters with real model data                 |
| **Week 4** | 🧼 Finalize button interactions: Add/Remove from desired list, Save/Load pets <br> 🎨 Clean up panel layout and improve spacing/labels <br> 🧪 Manual UI testing | ✅ Write JUnit tests for `Inventory`, `DesiredPetList`, `Pet` subclasses <br> 🛡️ Add validation: no negative age/weight, unique ID checks <br> 📚 Add JavaDoc for all model classes | ⚠️ Handle file errors (e.g., invalid file format, missing fields) using try/catch <br> ✅ Add unit tests for `FileHandler` and `SearchFilter` <br> 📚 JavaDoc for utility classes |
| **Week 5** | 🎥 Help prepare and record demo (walk through UI flow) <br> 🧪 Final UI polish and responsiveness checks <br> 📦 Submit final version | 🔀 Merge model code to `main` with all tests passing <br> 🧾 Help complete final README, manual, and model documentation <br> 🧠 Write individual retrospective | ✅ Final test run for all features <br> 📄 Contribute to README and user guide <br> 🧠 Submit individual reflection with insights on filtering/file-handling logic             |

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

