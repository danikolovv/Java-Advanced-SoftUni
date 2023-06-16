package DefiningClasses.Exercise.P05CarSalesman;

class Car {
    private String model;
    private Engine engine;
    private int weight;
    private String color;

    public Car(String model, Engine engine, int weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(model).append(":").append(System.lineSeparator());
        sb.append(engine.toString());
        sb.append("Weight: ");
        if (weight == 0) {
            sb.append("n/a");
        } else {
            sb.append(weight);
        }
        sb.append(System.lineSeparator());
        sb.append("Color: ");
        if (color == null) {
            sb.append("n/a");
        } else {
            sb.append(color);
        }
        sb.append(System.lineSeparator());
        return sb.toString();
    }
}
