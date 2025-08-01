import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import java.util.Locale;

public class SearchFilter extends RowFilter <DefaultTableModel, Integer> {
    private final String nameQuery;
    private final String gender;
    private final String animal;
    private final String breed;
    private final String ageRange;
    private final String weightRange;


    public SearchFilter(String nameQuery, String gender, String animal,
                        String breed, String ageRange, String weightRange) {
        this.nameQuery = nameQuery == null ? "" : nameQuery.trim().toLowerCase(Locale.ROOT);
        this.gender = gender;
        this.animal = animal;
        this.breed = breed;
        this.ageRange = ageRange;
        this.weightRange = weightRange;
    }

    
    @Override
    public boolean include(Entry<? extends DefaultTableModel, ? extends Integer> entry) {
        // Columns in the table
        String emojiAnimal = entry.getStringValue(0); // 🐶 or 🐱
        String name = entry.getStringValue(1);        // Pet name
        String genderVal = entry.getStringValue(3);   // Gender
        String breedVal = entry.getStringValue(4);    // Breed
        String ageVal = entry.getStringValue(5);      // Age as string
        String weightVal = entry.getStringValue(6);   // Weight as string

        // Match search query in name or breed
        boolean matchesName = name.toLowerCase(Locale.ROOT).contains(nameQuery);
        boolean matchesBreedText = breedVal.toLowerCase(Locale.ROOT).contains(nameQuery);
        if (!nameQuery.isEmpty() && !(matchesName || matchesBreedText)) return false;

        // Gender
        if (!gender.equals("All") && !gender.equalsIgnoreCase(genderVal)) return false;

        // Animal (based on emoji)
        if (!animal.equals("All")) {
            if (animal.equals("Dog") && !emojiAnimal.contains("🐶")) return false;
            if (animal.equals("Cat") && !emojiAnimal.contains("🐱")) return false;
        }

        // Breed
        if (!breed.equals("All") && !breed.equalsIgnoreCase(breedVal)) return false;

        // Age
        if (!ageRange.equals("All")) {
            try {
                int ageInt = Integer.parseInt(ageVal);
                if (age.equals("Puppy/Kitten 0-1") && ageInt > 1) return false;
                else if (age.equals("Young 1-3") && (ageInt < 1 || ageInt > 3)) return false;
                else if (age.equals("Adult 4-7") && (ageInt < 4 || ageInt > 7)) return false;
                else if (age.equals("Senior 8+") && ageInt < 8) return false;
            } catch (NumberFormatException e) {
                return false;
            }
        }

        // Weight
        if (!weightRange.equals("All")) {
            try {
                int weightInt = Integer.parseInt(weightVal);
                if (weight.equals("Small 0-25") && weightInt > 25) return false;
                else if (weight.equals("Medium 26-50") && (weightInt < 26 || weightInt > 50)) return false;
                else if (weight.equals("Large 51-100") && (weightInt < 51 || weightInt > 100)) return false;
                else if (weight.equals("XL 100+") && weightInt < 101) return false;
            } catch (NumberFormatException e) {
                return false;
            }
        }

        return true;
    }
}

