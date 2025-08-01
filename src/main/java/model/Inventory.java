package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import java.util.Comparator;
import model.enums.AgeGroup;
import model.enums.WeightCategory;

public class Inventory implements IReadOnlyPetList{

    private final List<AbstractPet> pets;

    public Inventory() {
        this.pets = new ArrayList<>();
    }

    //methods different from interface

    public void addPet(AbstractPet pet) {
        pets.add(pet);
    }

    public void removePet(AbstractPet pet) {
        pets.remove(pet);
    }
    
    // interface implemented methods
    @Override
    public List<AbstractPet> getAllPets() {
       return new ArrayList<>(pets); //return copy, maintain immutability
    }

    // Searching
    @Override
    public List<AbstractPet> searchByName(String name) {
       return pets.stream().filter(p -> p.getName().equalsIgnoreCase(name))
       .collect(Collectors.toList());
    }


    // Filtering 
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

    @Override
    public List<AbstractPet> filterByGender(char gender) {
        return pets.stream().filter(p->p.getGender() == gender)
        .collect(Collectors.toList());
    }

   

    @Override
    public List<AbstractPet> filterByBreed(String breed) {
        return pets.stream().filter(p->p.getBreed().equalsIgnoreCase(breed)).
        collect(Collectors.toList());
    }


    // Sorting 

    @Override
    public List<AbstractPet> getPetsSortedByName() {
        return pets.stream()
                    .sorted(Comparator.comparing(AbstractPet::getName))
                    .collect(Collectors.toList());
    }

    @Override
    public List<AbstractPet> getPetsSortedByAge() {
        return pets.stream()
                    .sorted(Comparator.comparing(AbstractPet::getAge))
                    .collect(Collectors.toList());
    }

    @Override
    public List<AbstractPet> getPetsSortedByWeight() {
        return pets.stream()
                    .sorted(Comparator.comparing(AbstractPet::getWeight))
                    .collect(Collectors.toList());
    }
    
}
