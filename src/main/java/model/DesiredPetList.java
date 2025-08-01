package model;

import java.util.List;

import model.enums.AgeGroup;
import model.enums.WeightCategory;

public class DesiredPetList implements IReadOnlyPetList, IModifiablePetList{

    @Override
    public void addPet(AbstractPet pet) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addPet'");
    }

    @Override
    public void removePet(AbstractPet pet) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removePet'");
    }

    @Override
    public List<AbstractPet> getAllPets() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllPets'");
    }

    @Override
    public List<AbstractPet> searchByName(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchByName'");
    }

    @Override
    public List<AbstractPet> filterByAgeGroup(AgeGroup group) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'filterByAgeGroup'");
    }

    @Override
    public List<AbstractPet> filterByGender(char gender) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'filterByGender'");
    }

    @Override
    public List<AbstractPet> filterByWeightCategory(WeightCategory category) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'filterByWeightCategory'");
    }

    @Override
    public List<AbstractPet> filterByBreed(String breed) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'filterByBreed'");
    }

    @Override
    public List<AbstractPet> getPetsSortedByName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPetsSortedByName'");
    }

    @Override
    public List<AbstractPet> getPetsSortedByAge() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPetsSortedByAge'");
    }

    @Override
    public List<AbstractPet> getPetsSortedByWeight() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPetsSortedByWeight'");
    }
    
}
