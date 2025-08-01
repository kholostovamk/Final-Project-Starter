---
title: Pet Inventory Application UML (Final)
---

classDiagram
    direction LR

    Pet <|-- Dog
    Pet <|-- Cat

    PetInventoryApp --> MainFrame: creates
    MainFrame --> PetListPanel: uses
    MainFrame --> FilterPanel: uses
    MainFrame --> SearchPanel: uses
    MainFrame --> PetDetailPanel: uses
    MainFrame --> Inventory: uses
    MainFrame --> DesiredPetList: uses

    PetListPanel --> Inventory: reads
    PetListPanel --> PetDetailPanel: opens
    FilterPanel --> SearchFilter: uses
    SearchPanel --> SearchFilter: uses

    Inventory --> Pet: contains
    SearchFilter --> Pet: filters
    FileHandler --> Pet: loads/saves
    FileHandler --> DesiredPetList: saves/loads
    DesiredPetList --> Pet: contains

    class Pet {
        -id: String
        -name: String
        -age: int
        -breed: String
        -weight: double
        -gender: String
        +getId(): String
        +getName(): String
        +getAge(): int
        +getBreed(): String
        +getWeight(): double
        +getGender(): String
        +getSpecialInfo(): String*
    }

    class Dog {
        -isTrained: boolean
        +getTrainingStatus(): String
        +getSpecialInfo(): String
    }

    class Cat {
        -indoorOnly: boolean
        +getLivingPreference(): String
        +getSpecialInfo(): String
    }

    class Inventory {
        -pets: List<Pet>
        +addPet(p: Pet): void
        +removePetById(id: String): void
        +getAllPets(): List<Pet>
        +sortPetsBy(field: String): List<Pet>
        +saveToCSV(filename: String): void
        +saveToJSON(filename: String): void
        +loadFromCSV(filename: String): void
        +loadFromJSON(filename: String): void
    }

    class DesiredPetList {
        -selectedPets: List<Pet>
        +add(Pet): void
        +removeById(id: String): void
        +getList(): List<Pet>
        +clear(): void
    }

    class SearchFilter {
        +filterByAge(pets: List<Pet>, min: int, max: int): List<Pet>
        +filterByBreed(pets: List<Pet>, breed: String): List<Pet>
        +filterByGender(pets: List<Pet>, gender: String): List<Pet>
        +filterByWeight(pets: List<Pet>, min: double, max: double): List<Pet>
        +searchByName(pets: List<Pet>, name: String): List<Pet>
    }

    class FileHandler {
        +saveInventoryToJSON(pets: List<Pet>, filename: String): void
        +loadInventoryFromJSON(filename: String): List<Pet>
        +saveDesiredList(DesiredPetList, filename: String): void
        +loadDesiredList(filename: String): DesiredPetList
    }

    class PetInventoryApp {
        +main(args: String[]): void
    }

    class MainFrame {
        -petListPanel: PetListPanel
        -filterPanel: FilterPanel
        -searchPanel: SearchPanel
        -petDetailPanel: PetDetailPanel
        -desiredPetList: DesiredPetList
        +initUI(): void
    }

    class PetListPanel {
        +displayPets(pets: List<Pet>): void
    }

    class PetDetailPanel {
        +showDetails(p: Pet): void
    }

    class FilterPanel {
        +getFilterOptions(): Map<String, Object>
    }

    class SearchPanel {
        +getSearchQuery(): String
    }

    class Add{
        + ADD()
    }