package DefiningClasses.Exercise.P04RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] carData = scanner.nextLine().split("\\s+");
            String model = carData[0];
            int engineSpeed = Integer.parseInt(carData[1]);
            int enginePower = Integer.parseInt(carData[2]);
            int cargoWeight = Integer.parseInt(carData[3]);
            String cargoType = carData[4];
            double tire1Pressure = Double.parseDouble(carData[5]);
            int tire1Age = Integer.parseInt(carData[6]);
            double tire2Pressure = Double.parseDouble(carData[7]);
            int tire2Age = Integer.parseInt(carData[8]);
            double tire3Pressure = Double.parseDouble(carData[9]);
            int tire3Age = Integer.parseInt(carData[10]);
            double tire4Pressure = Double.parseDouble(carData[11]);
            int tire4Age = Integer.parseInt(carData[12]);

            Car car = new Car(model, engineSpeed, enginePower, cargoWeight, cargoType, tire1Pressure, tire1Age,
                    tire2Pressure, tire2Age, tire3Pressure, tire3Age, tire4Pressure, tire4Age);

            cars.add(car);
        }

        String command = scanner.nextLine();

        if (command.equals("fragile")) {
            cars.stream()
                    .filter(car -> car.getCargo().getType().equals("fragile"))
                    .filter(car -> car.getTires().stream().anyMatch(tire -> tire.getPressure() < 1))
                    .forEach(car -> System.out.println(car.getModel()));
        } else if (command.equals("flamable")) {
            cars.stream()
                    .filter(car -> car.getCargo().getType().equals("flamable"))
                    .filter(car -> car.getEngine().getPower() > 250)
                    .forEach(car -> System.out.println(car.getModel()));
        }

        scanner.close();
    }
}