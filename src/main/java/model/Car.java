package model;


public class Car {
    String make;
    String model;
    String gen;

    public Car(String make, String model, String gen) {
        this.make = make;
        this.model = model;
        this.gen = gen;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    @Override
    public String toString() {
        return make + " " + model + " (" + gen + ")";
    }
}
