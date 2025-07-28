package model;
public class Dog extends AbstractPet{

    private boolean isTrained;

    public Dog(String id, String name, int age, String breed, double weight, char gender, boolean isTrained) {
        super(id, name, age, breed, weight, gender);
        this.isTrained = isTrained;
    }

    public boolean isTrained() {
        return isTrained;
    }

    @Override
    public String getSpecialInfo() {
    return isTrained ? "Trained" : "Not trained";
    }

    @Override
    public String getWeightCategory() {
        double weight = this.getWeight();
        if (weight <= 25) return "Small";
        else if (weight <= 50) return "Medium";
        else if (weight <= 100) return "Large";
        else return "Giant";
    }
    
}
