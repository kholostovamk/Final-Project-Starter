# Pet Inventory Project Proposal

## What are you building?
We are building a **Pet Inventory** application using Java and the MVC design pattern. The application allows users to view a collection of pets, search, filter, and sort them, as well as save and load pet data. Users can also create a list of their desired pets.

---

## What are the initial features for the application?
- See all available pets
- View pet details
- Save filtered list of pets as CSV or JSON
- Graphical user interface

---

## What are the minimum additional features you plan to implement?
- Sort pets by name, age, breed, and weight
- Filter pets by gender, age, breed, and weight
- Search pets by name

---

## What are your stretch goals (features beyond the minimum)?
- Add new pets to the inventory
- Add pets to a list of desired pets
- Save/load the desired pet list
- Search within filtered pets

---

## Initial Design

We will use the **MVC architecture**:

### 🔷 Model:
- `Pet` (abstract), `Dog`, `Cat`
- `Inventory` (manages all pets)
- `DesiredPetList` (manages selected pets)
- `SearchFilter` (logic for searching and filtering)
- `FileHandler` (loads/saves pets from/to JSON or CSV)

### 🎨 View:
- `MainFrame` (main window)
- `PetListPanel`, `FilterPanel`, `SearchPanel`, `PetDetailPanel`

### 🎮 Controller (lightweight):
- `PetInventoryApp` (main entry point, sets up app)

---

## UML Diagram

We created a detailed UML diagram stored at [UML.md](../DesignDocuments/UML.md) that reflects the complete class structure, fields, and methods. It includes all planned functionality and follows the MVC structure.

---

## How do you plan to break up the work?

We have 3 team members. Each person is assigned one area of responsibility to ensure clear ownership and parallel development.

### 👤 Person A – **View/UI Designer**
- Build GUI using Java Swing: `MainFrame`, `PetListPanel`, `FilterPanel`, `SearchPanel`, `PetDetailPanel`
- Display pet list and pet details
- Wire UI to logic and make it user-friendly

### 👤 Person B – **Model Developer**
- Implement `Pet`, `Dog`, `Cat`, and `Inventory`
- Provide pet data, sorting, adding, and removing logic
- Add support for unique IDs

### 👤 Person C – **Data & Features Developer**
- Build `FileHandler` (load/save as CSV/JSON)
- Implement `SearchFilter` (all filtering/search logic)
- Implement saving/loading desired list

**Shared tasks:**
- UML diagrams (initial + final)
- Documentation (manual, Javadoc, README)
- JUnit tests for each component
- Demo presentation

---

## Timeline and Checkpoints

| Week | Tasks |
|------|-------|
| Week 1 | Finalize idea, UML, and responsibilities. Set up GitHub project and folder structure. |
| Week 2 | Begin coding separately (each person in their own branch). Build classes with mock data. |
| Week 3 | Integrate features, connect GUI to logic. Begin real testing. Finish any stretch goals. |
| Week 4 | Final testing, documentation, and manual. Prepare live demonstration. |
| Week 5 | Submit final version. Complete individual retrospective. |

---

## Git Collaboration Plan

- Everyone works on their own branch:
  - `ui-design` (Person A)
  - `inventory-model` (Person B)
  - `file-search` (Person C)
- Create pull requests to `main` after completing a feature
- Review and approve pull requests before merging
- Keep local branches up-to-date by pulling from `main`

