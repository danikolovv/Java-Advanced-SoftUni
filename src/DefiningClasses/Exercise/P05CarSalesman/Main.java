package DefiningClasses.Exercise.P05CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Engine> engines = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] engineData = scanner.nextLine().split("\\s+");
            String model = engineData[0];
            int power = Integer.parseInt(engineData[1]);
            int displacement = 0;
            String efficiency = "n/a";

            if (engineData.length == 4) {
                displacement = Integer.parseInt(engineData[2]);
                efficiency = engineData[3];
            } else if (engineData.length == 3) {
                boolean isDisplacement = Character.isDigit(engineData[2].charAt(0));
                if (isDisplacement) {
                    displacement = Integer.parseInt(engineData[2]);
                } else {
                    efficiency = engineData[2];
                }
            }

            Engine engine = new Engine(model, power, displacement, efficiency);
            engines.put(model, engine);
        }

        int m = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String[] carData = scanner.nextLine().split("\\s+");
            String model = carData[0];
            String engineModel = carData[1];
            Engine engine = engines.get(engineModel);
            int weight = 0;
            String color = null;

            if (carData.length == 4) {
                weight = Integer.parseInt(carData[2]);
                color = carData[3];
            } else if (carData.length == 3) {
                boolean isWeight = Character.isDigit(carData[2].charAt(0));
                if (isWeight) {
                    weight = Integer.parseInt(carData[2]);
                } else {
                    color = carData[2];
                }
            }

            Car car = new Car(model, engine, weight, color);
            cars.add(car);
        }

        for (Car car : cars) {
            System.out.print(car.toString());
        }

        scanner.close();
    }
}
