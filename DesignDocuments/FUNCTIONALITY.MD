Project Name: Pet Inventory System

Overview

This application manages a collection of pets. Users can view available pets, inspect individual pet details, sort and filter the pet list, and potentially add new pets to the inventory. The system follows the MVC (Model-View-Controller) design pattern and is implemented in Java.

⸻

Implemented Functionalities

1. Pet Classes (AbstractPet, Dog, Cat)
	•	AbstractPet: Common superclass for all pets. Stores attributes like id, name, age, breed, weight, and gender. Defines abstract methods for getSpecialInfo() and getWeightCategory().
	•	Dog: Subclass of AbstractPet. Adds trained boolean and defines behavior for getSpecialInfo() and getWeightCategory().
	•	Cat: Subclass of AbstractPet. Adds indoorOnly boolean and defines behavior for getSpecialInfo() and getWeightCategory().

⸻

Planned Functionalities

(Will update as you add them)
	•	View all available pets
	•	View pet details
	•	Add a new pet
	•	Sort pets by name, age, breed, weight
	•	Filter pets by gender, age, breed, weight
	•	Search pets by name
	•	Save pet inventory
	•	GUI to display and interact with pets