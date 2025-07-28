package model.enums;

/**
 * Enum representing age groups for pets.
 * Each type of pet uses different numbers for the same group.
 */
public enum AgeGroup {
    KITTEN, PUPPY, YOUNG, ADULT, SENIOR;

    /**
     * Assigns group based on age value of a dog.
     * @param age age of the dog
     * @return age group
     */
    public static AgeGroup fromDogAge(int age) {
        if (age < 1) return PUPPY;           // puppy
        else if (age <= 3) return YOUNG;
        else if (age <= 8) return ADULT;
        else return SENIOR;
    }

    /**
     * Assigns group based on age value of a cat.
     * @param age age of the cat
     * @return enum group
     */
    public static AgeGroup fromCatAge(int age) {
        if (age < 1) return KITTEN;           // kitten
        else if (age <= 2) return YOUNG;
        else if (age <= 10) return ADULT;
        else return SENIOR;
    }

    /**
     * Method to transform enum into String.
     * @return capitalized enum value
     */
    public String toDisplayString() {
    return switch (this) {
        case KITTEN -> "Kitten";
        case PUPPY -> "Puppy";
        case YOUNG -> "Young";
        case ADULT -> "Adult";
        case SENIOR -> "Senior";
    };
}
}


