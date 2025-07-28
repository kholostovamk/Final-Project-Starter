package model;
public abstract class Pet {
    private final String id;
    private final String name;
    private final int age;
    private final String breed;
    private final double weight;
    private final char gender;
    
    
    public Pet(String id, String name, int age, String breed, double weight, char gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
        this.gender = gender;
    }

    //Getters

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public double getWeight() {
        return weight;
    }

     public char getGender() {
        return gender;
    }

    
    // Abstract method to be implemented by subclasses
    public abstract String getSpecialInfo();
    
      @Override
    public String toString() {
        return "Pet [id=" + id + ", name=" + name + ", age=" + age + ", breed=" + breed + ", weight=" + weight
                + ", gender=" + gender + "]";
    }
}
