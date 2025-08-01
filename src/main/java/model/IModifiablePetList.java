package model;

/**
 * Simple interface for classes that let user add/remove pets.
 */
public interface IModifiablePetList {
    void addPet(AbstractPet pet);
    void removePet(AbstractPet pet);
}
