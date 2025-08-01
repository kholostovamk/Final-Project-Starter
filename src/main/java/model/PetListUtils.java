package model;
import model.enums.AgeGroup;
import model.enums.WeightCategory;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PetListUtils {

    // Searching

     public static List<AbstractPet> searchByName(List<AbstractPet> pets, String name) {
        return pets.stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }


    // Filtering
   
   

    public static List<AbstractPet> filterByGender(List<AbstractPet> pets, char gender) {
        return pets.stream()
                .filter(p -> p.getGender() == gender)
                .collect(Collectors.toList());
    }

    public static List<AbstractPet> filterByBreed(List<AbstractPet> pets, String breed) {
        return pets.stream()
                .filter(p -> p.getBreed().equalsIgnoreCase(breed))
                .collect(Collectors.toList());
    }

    public static List<AbstractPet> filterByAgeGroup(List<AbstractPet> pets, AgeGroup group) {
        return pets.stream()
                .filter(p -> {
                    if (p instanceof Dog d) return AgeGroup.fromDogAge(d.getAge()) == group;
                    else if (p instanceof Cat c) return AgeGroup.fromCatAge(c.getAge()) == group;
                    else return false;
                })
                .collect(Collectors.toList());
    }

    public static List<AbstractPet> filterByWeightCategory(List<AbstractPet> pets, WeightCategory category) {
        return pets.stream()
                .filter(p -> {
                    if (p instanceof Dog d) return WeightCategory.fromDogWeight(d.getWeight()) == category;
                    else if (p instanceof Cat c) return WeightCategory.fromCatWeight(c.getWeight()) == category;
                    else return false;
                })
                .collect(Collectors.toList());
    }


    // Sorting

     public static List<AbstractPet> getPetsSortedByName(List<AbstractPet> pets) {
        return pets.stream()
                .sorted(Comparator.comparing(AbstractPet::getName))
                .collect(Collectors.toList());
    }

    public static List<AbstractPet> getPetsSortedByAge(List<AbstractPet> pets) {
        return pets.stream()
                .sorted(Comparator.comparing(AbstractPet::getAge))
                .collect(Collectors.toList());
    }

    public static List<AbstractPet> getPetsSortedByWeight(List<AbstractPet> pets) {
        return pets.stream()
                .sorted(Comparator.comparing(AbstractPet::getWeight))
                .collect(Collectors.toList());
    }

}