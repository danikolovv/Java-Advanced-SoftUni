package DefiningClasses.Exercise.P04RawData;

import java.util.ArrayList;
import java.util.List;

class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tire> tires;

    public Car(String model, int engineSpeed, int enginePower, int cargoWeight, String cargoType,
               double tire1Pressure, int tire1Age, double tire2Pressure, int tire2Age, double tire3Pressure,
               int tire3Age, double tire4Pressure, int tire4Age) {
        this.model = model;
        this.engine = new Engine(engineSpeed, enginePower);
        this.cargo = new Cargo(cargoWeight, cargoType);
        this.tires = new ArrayList<>();

        this.tires.add(new Tire(tire1Pressure, tire1Age));
        this.tires.add(new Tire(tire2Pressure, tire2Age));
        this.tires.add(new Tire(tire3Pressure, tire3Age));
        this.tires.add(new Tire(tire4Pressure, tire4Age));
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public List<Tire> getTires() {
        return tires;
    }
}
