Got it! Here’s the revised version of your FUNCTIONALITY.md with a smoother, more natural style and less of the “word: something” pattern:

⸻

FUNCTIONALITY.md

Project Name

Pet Inventory System

Overview

This application manages a collection of pets. Users can view available pets, inspect individual pet details, sort and filter the pet list, and potentially add new pets to the inventory. The system follows the MVC (Model-View-Controller) design pattern and is implemented in Java.

⸻

✅ Implemented Functionalities

1. Pet Classes

The AbstractPet class provides common attributes shared by all pets, including ID, name, age, breed, weight, and gender. It also defines two abstract methods: one for returning pet-specific info (getSpecialInfo) and another for determining weight category (getWeightCategory).

The Dog class extends AbstractPet by including a boolean to indicate whether the dog is trained. It defines custom logic for weight classification: small (up to 20 lbs), medium (up to 40 lbs), large (up to 70 lbs), and giant (above 70 lbs).

The Cat class also inherits from AbstractPet, adding a flag to indicate if the cat is indoor-only. Its weight categories are slightly different: small (up to 8 lbs), medium (up to 12 lbs), large (up to 16 lbs), and giant (above 16 lbs).

2. Enums

The application uses enums to keep categories consistent across the system.
AgeGroup represents different age ranges such as puppy/kitten, adult, and senior.
WeightCategory defines standardized labels for pet sizes like small, medium, large, and giant, making filtering and classification easier.

⸻

🧩 Planned Functionalities

(Will be updated as more features are added)
	•	View all available pets
	•	View pet details
	•	Add a new pet
	•	Sort pets by name, age, breed, or weight
	•	Filter by gender, age group, breed, or weight category
	•	Search by name
	•	Save the pet inventory
	•	GUI for user interaction

