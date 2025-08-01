package model;

import java.util.ArrayList;
import java.util.List;

import model.enums.AgeGroup;
import model.enums.WeightCategory;

/**
 * Represents an inventory of pets available in the system.
 * Implements read-only operations defined in IReadOnlyPetList.
 */
public class Inventory implements IReadOnlyPetList {

    private final List<AbstractPet> pets;

    /**
     * Constructs an empty inventory of pets.
     */
    public Inventory() {
        this.pets = new ArrayList<>();
    }

    /**
     * Constructs inventory from an initial list.
     * @param initialPets list of pets to populate inventory
     */
    public Inventory(List<AbstractPet> initialPets) {
        this.pets = new ArrayList<>(initialPets);
    }

    /**
     * Returns a copy of all pets in the inventory.
     * @return list of all pets
     */
    @Override
    public List<AbstractPet> getAllPets() {
        return new ArrayList<>(pets); // return copy, maintain immutability
    }

    /**
     * Searches pets by name, case-insensitively.
     * @param name the name to search
     * @return list of pets with matching name
     */
    @Override
    public List<AbstractPet> searchByName(String name) {
        return PetListUtils.searchByName(pets, name);
    }

    /**
     * Filters pets by age group. Uses different logic for Dogs and Cats.
     * @param group the age group to filter
     * @return list of pets in the specified age group
     */
    @Override
    public List<AbstractPet> filterByAgeGroup(AgeGroup group) {
        return PetListUtils.filterByAgeGroup(pets, group);
    }

    /**
     * Filters pets by weight category. Uses different logic for Dogs and Cats.
     * @param category the weight category to filter
     * @return list of pets in the specified weight category
     */
    @Override
    public List<AbstractPet> filterByWeightCategory(WeightCategory category) {
        return PetListUtils.filterByWeightCategory(pets, category);
    }

    /**
     * Filters pets by gender.
     * @param gender the gender to filter (e.g., 'M' or 'F')
     * @return list of pets with the specified gender
     */
    @Override
    public List<AbstractPet> filterByGender(char gender) {
        return PetListUtils.filterByGender(pets, gender);
    }

    /**
     * Filters pets by breed, case-insensitively.
     * @param breed the breed to filter
     * @return list of pets of the specified breed
     */
    @Override
    public List<AbstractPet> filterByBreed(String breed) {
        return PetListUtils.filterByBreed(pets, breed);
    }

    /**
     * Returns pets sorted by name.
     * @return list of pets sorted by name
     */
    @Override
    public List<AbstractPet> getPetsSortedByName() {
        return PetListUtils.getPetsSortedByName(pets);
    }

    /**
     * Returns pets sorted by age.
     * @return list of pets sorted by age
     */
    @Override
    public List<AbstractPet> getPetsSortedByAge() {
        return PetListUtils.getPetsSortedByAge(pets);
    }

    /**
     * Returns pets sorted by weight.
     * @return list of pets sorted by weight
     */
    @Override
    public List<AbstractPet> getPetsSortedByWeight() {
        return PetListUtils.getPetsSortedByWeight(pets);
    }
}
