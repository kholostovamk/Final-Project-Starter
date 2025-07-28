package model.enums;

/**
 * Enum representing weight categories for pets.
 */
public enum WeightCategory {
    SMALL,     // Light pets (e.g., < 25 lbs dogs, < 8 lbs cats)
    MEDIUM,    // Moderate weight
    LARGE,     // Heavy but not oversized
    GIANT;      // Very large pets

    /**
     * Assigns theweight category for the dog.
     * @param weight weight of the dog
     * @return weight group for the dog
     */
    public static WeightCategory fromDogWeight(double weight) {
        if (weight <= 25) return SMALL;
        else if (weight <= 50) return MEDIUM;
        else if (weight <= 100) return LARGE;
        else return GIANT;
}

    /**
     * Assigns the weighy category for the cat.
     * @param weight weight of the cat
     * @return weight group for the cat
     */
    public static WeightCategory fromCatWeight(double weight) {
        if (weight <= 8) return SMALL;
        else if (weight <= 12) return MEDIUM;
        else if (weight <= 16) return LARGE;
        else return GIANT;
    }
}