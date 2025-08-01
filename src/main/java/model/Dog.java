package model;

import model.enums.AgeGroup;
import model.enums.WeightCategory;

/**
 * Class for Dogs. Extends abstract class of Pet with addition of information about being trained.
 */
public class Dog extends AbstractPet{

    /**
     * Indicates whether the dog is trained.
     */
    private final boolean isTrained;

    /**
     * Constructs a Dog instance with the provided attributes.
     * @param id unique identifier for the pet
     * @param name name of the dog
     * @param age numerical age (used to determine puppy, young, adult, senior group)
     * @param breed breed of the dog
     * @param weight weight in pounds (used for size categorization)
     * @param gender 'F' or 'M'
     * @param isTrained true if the dog is trained, false otherwise
     */
    public Dog(String id, String name, int age, String breed, double weight, 
    char gender, boolean isTrained) {
        super(id, name, age, breed, weight, gender);
        this.isTrained = isTrained;
    }

    /**
     * Returns training status for the dog.
     * @return true if it's trained, false if it is not
     */
    public boolean isTrained() {
        return isTrained;
    }

     /**
     * Returns a string representing the dog's train status for display.
     * 
     * @return "Trained" if true, otherwise "Not Trained"
     */
    @Override
    public String getSpecialInfo() {
    return isTrained ? "Trained" : "Not trained";
    }

    /**
     * Determines the dog's weight category based on weight in pounds.
     * 
     * @return "SMALL", "MEDIUM", "LARGE", or GIANT" based on the weight
     */
    @Override
    public WeightCategory getWeightCategory() {
        return WeightCategory.fromDogWeight(this.getWeight());
    }

    /**
     * Determines the dog's age category based on age value.
     * 
     * @return "PUPPY", "YOUNG", "ADULT", "SENIOR"
     */
    @Override
    public AgeGroup getAgeGroup() {
        return AgeGroup.fromDogAge(this.getAge());
    }
    
}
