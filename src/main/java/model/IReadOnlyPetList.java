package model;

import java.util.List;

import model.enums.AgeGroup;
import model.enums.WeightCategory;

/**
 * Interface exposing only read operations for a pet list.
 */
public interface IReadOnlyPetList {

    /**
     * Get all pets in the list (e.g., for display).
     * @return list of all pets
     */
    List<AbstractPet> getAllPets();

    /**
     * Search for pets by name.
     * @param name name to search (case-insensitive)
     * @return list of matching pets
     */
    List<AbstractPet> searchByName(String name);

    /**
     * Filter pets by age group.
     * @param group desired AgeGroup
     * @return list of matching pets
     */
    List<AbstractPet> filterByAgeGroup(AgeGroup group);

    /**
    * Filter pets by gender.
    * @param gender 'M' or 'F'
    * @return list of matching pets
    */
    List<AbstractPet> filterByGender(char gender);

    /**
     * Filter pets by weight category.
     * @param category desired weight category
     * @return list of matching pets
     */
    List<AbstractPet> filterByWeightCategory(WeightCategory category);

    /**
     * Filter pets by breed.
     * @param breed breed string (exact or partial match)
     * @return list of matching pets
     */
    List<AbstractPet> filterByBreed(String breed);

    /**
     * Sort pets by name (alphabetical).
     * @return list of pets sorted by name
     */
    List<AbstractPet> getPetsSortedByName();

    /**
     * Sort pets by age.
     * @return list of pets sorted by age
     */
    List<AbstractPet> getPetsSortedByAge();

    /**
     * Sort pets by weight.
     * @return list of pets sorted by weight
     */
    List<AbstractPet> getPetsSortedByWeight();


}
