package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    public static List<Car> getCarListAfterRequest(List<Car> cars, int countCars) {
        return cars.stream().limit(countCars).collect(Collectors.toList());
    }
}
