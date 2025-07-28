package model;
public class Dog extends Pet{

    public Dog(String id, String name, int age, String breed, double weight, char gender) {
        super(id, name, age, breed, weight, gender);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String getSpecialInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSpecialInfo'");
    }
    
}
