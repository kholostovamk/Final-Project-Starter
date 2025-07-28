package model;

import model.enums.AgeGroup;
import model.enums.WeightCategory;

/**
 * Represents a Cat, extending the abstract pet class with an additional field 
 * indicating whether the cat is indoor-only.
 */
public class Cat extends AbstractPet {
    
    /**
     * Indicates whether the cat is indoor-only.
     */
    private final boolean indoorOnly;

    /**
     * Constructs a Cat instance with the provided attributes.
     * 
     * @param id unique identifier for the cat
     * @param name name of the cat
     * @param age numerical age (used to determine age group)
     * @param breed breed of the cat
     * @param weight weight in pounds (used for size categorization)
     * @param gender F/M
     * @param indoorOnly true if the cat is indoor-only, false if it may go outdoors
     */
    public Cat(String id, String name, int age, String breed, double weight, char gender, boolean indoorOnly) {
        super(id, name, age, breed, weight, gender);
        this.indoorOnly = indoorOnly;
    }

    /**
     * Returns whether the cat is indoor-only.
     * 
     * @return true if indoor-only, false otherwise
     */
    public boolean isIndoorOnly() {
        return indoorOnly;
    }

    /**
     * Returns a string representing the cat's living preference for display.
     * 
     * @return "Indoor only" if indoorOnly is true, otherwise "Indoor/Outdoor"
     */
    @Override
    public String getSpecialInfo() {
        return indoorOnly ? "Indoor only" : "Indoor/Outdoor";
    }

    /**
     * Determines the cat's weight category based on weight in pounds.
     * 
     * @return "Small", "Medium", "Large", or "Giant" based on the weight
     */
    @Override
    public WeightCategory getWeightCategory() {
        return WeightCategory.fromCatWeight(this.getWeight());
}

    @Override
    public AgeGroup getAgeGroup() {
        return AgeGroup.fromCatAge(this.getAge());
    }
}