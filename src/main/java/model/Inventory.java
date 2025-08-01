package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Comparator;
import model.enums.AgeGroup;
import model.enums.WeightCategory;

/**
 * Represents an inventory of pets available in the system.
 * Allows adding, removing, viewing, searching, filtering, and sorting pets.
 * Implements read-only operations defined in IReadOnlyPetList.
 */
public class Inventory implements IReadOnlyPetList{

    private final List<AbstractPet> pets;

    /**
     * Constructs an empty inventory of pets.
     */
    public Inventory() {
        this.pets = new ArrayList<>();
    }

    //methods different from interface

    /**
     * Adds a pet to the inventory.
     * @param pet the pet to be added
     */
    public void addPet(AbstractPet pet) {
        pets.add(pet);
    }

    /**
     * Removes a pet from the inventory.
     * @param pet the pet to be removed
     */
    public void removePet(AbstractPet pet) {
        pets.remove(pet);
    }
    
    // interface implemented methods

    /**
     * Returns a copy of all pets in the inventory.
     * @return list of all pets
     */
    @Override
    public List<AbstractPet> getAllPets() {
       return new ArrayList<>(pets); //return copy, maintain immutability
    }

    // Searching

    /**
     * Searches pets by name, case-insensitively.
     * @param name the name to search
     * @return list of pets with matching name
     */
    @Override
    public List<AbstractPet> searchByName(String name) {
       return pets.stream().filter(p -> p.getName().equalsIgnoreCase(name))
       .collect(Collectors.toList());
    }


    // Filtering 

    /**
     * Filters pets by age group. Uses different logic for Dogs and Cats.
     * @param group the age group to filter
     * @return list of pets in the specified age group
     */
    @Override
    public List<AbstractPet> filterByAgeGroup(AgeGroup group) {
       return pets.stream()
              .filter(p -> {
                if (p instanceof Dog d ) return AgeGroup.fromDogAge(d.getAge()) == group;
                else if (p instanceof Cat c) return AgeGroup.fromCatAge(c.getAge()) == group;
                else return false;
              })
              .collect(Collectors.toList());
    }

    /**
     * Filters pets by weight category. Uses different logic for Dogs and Cats.
     * @param category the weight category to filter
     * @return list of pets in the specified weight category
     */
    @Override
    public List<AbstractPet> filterByWeightCategory(WeightCategory category) {
        return pets.stream()
               .filter(p -> {
                if (p instanceof Dog d) return WeightCategory.fromDogWeight(d.getWeight()) 
                == category;
                else if (p instanceof Cat c) return WeightCategory.fromCatWeight(c.getWeight())
                == category;
                else return false;
               })
               .collect(Collectors.toList());
    }

    /**
     * Filters pets by gender.
     * @param gender the gender to filter (e.g., 'M' or 'F')
     * @return list of pets with the specified gender
     */
    @Override
    public List<AbstractPet> filterByGender(char gender) {
        return pets.stream().filter(p->p.getGender() == gender)
        .collect(Collectors.toList());
    }

    /**
     * Filters pets by breed, case-insensitively.
     * @param breed the breed to filter
     * @return list of pets of the specified breed
     */
    @Override
    public List<AbstractPet> filterByBreed(String breed) {
        return pets.stream().filter(p->p.getBreed().equalsIgnoreCase(breed)).
        collect(Collectors.toList());
    }


    // Sorting 

    /**
     * Returns pets sorted by name.
     * @return list of pets sorted by name
     */
    @Override
    public List<AbstractPet> getPetsSortedByName() {
        return pets.stream()
                    .sorted(Comparator.comparing(AbstractPet::getName))
                    .collect(Collectors.toList());
    }

    /**
     * Returns pets sorted by age.
     * @return list of pets sorted by age
     */
    @Override
    public List<AbstractPet> getPetsSortedByAge() {
        return pets.stream()
                    .sorted(Comparator.comparing(AbstractPet::getAge))
                    .collect(Collectors.toList());
    }

    /**
     * Returns pets sorted by weight.
     * @return list of pets sorted by weight
     */
    @Override
    public List<AbstractPet> getPetsSortedByWeight() {
        return pets.stream()
                    .sorted(Comparator.comparing(AbstractPet::getWeight))
                    .collect(Collectors.toList());
    }
    
}
