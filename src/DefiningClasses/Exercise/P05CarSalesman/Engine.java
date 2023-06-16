package DefiningClasses.Exercise.P05CarSalesman;

class Engine {
    private String model;
    private int power;
    private int displacement;
    private String efficiency;

    public Engine(String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public int getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(model).append(":").append(System.lineSeparator());
        sb.append("Power: ").append(power).append(System.lineSeparator());
        sb.append("Displacement: ");
        if (displacement == 0) {
            sb.append("n/a");
        } else {
            sb.append(displacement);
        }
        sb.append(System.lineSeparator());
        sb.append("Efficiency: ").append(efficiency).append(System.lineSeparator());
        return sb.toString();
    }
}