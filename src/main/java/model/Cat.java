package model;
public class Cat extends AbstractPet {

    public Cat(String id, String name, int age, String breed, double weight, char gender) {
        super(id, name, age, breed, weight, gender);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getSpecialInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSpecialInfo'");
    }

    @Override
    public String getWeightCategory() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getWeightCategory'");
    }
    
}
