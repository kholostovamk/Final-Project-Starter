package model;

/**
 * Abstract base class representing a general pet with common attributes.
 */
public abstract class AbstractPet {
    private final String id;
    private final String name;
    private final int age;
    private final String breed;
    private final double weight;
    private final char gender;
    
    /**
     * Constructs an AbstractPet with the specified attributes.
     *
     * @param id     the unique identifier of the pet
     * @param name   the name of the pet
     * @param age    the age of the pet in years
     * @param breed  the breed of the pet
     * @param weight the weight of the pet in pounds
     * @param gender the gender of the pet ('M' or 'F')
     */
    public AbstractPet(String id, String name, int age, String breed, double weight, char gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
        this.gender = gender;
    }

    /**
     * Gets the unique identifier of the pet.
     *
     * @return the pet's ID
     */
    public String getId() {
        return id;
    }

    /**
     * Gets the name of the pet.
     *
     * @return the pet's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the age of the pet.
     *
     * @return the pet's age
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets the breed of the pet.
     *
     * @return the pet's breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Gets the weight of the pet.
     *
     * @return the pet's weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Gets the gender of the pet.
     *
     * @return the pet's gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * Abstract method that returns special info specific to the pet type.
     *
     * @return a string with special information about the pet
     */
    public abstract String getSpecialInfo();

    /**
     * Abstract method that returns the weight category for the pet.
     *
     * @return a string representing the pet's weight category (e.g., Small, Medium)
     */
    public abstract String getWeightCategory();

    /**
     * Returns a string representation of the pet including its basic attributes.
     *
     * @return a string describing the pet
     */
    @Override
    public String toString() {
        return "Pet [id=" + id + ", name=" + name + ", age=" + age + ", breed=" + breed + ", weight=" + weight
                + ", gender=" + gender + "]";
    }
}
