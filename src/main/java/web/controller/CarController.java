package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCarsTableWithCount(
            ModelMap model,
            @RequestParam(value = "count", required = false) Integer count
    ) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 3, 190));
        cars.add(new Car("Mercedes", 222, 350));
        cars.add(new Car("Toyota LandCruiser", 200, 280));
        cars.add(new Car("Lada", 2107, 75));
        cars.add(new Car("Peugeot", 407, 220));

        if (count != null && count < 5) {
            cars = CarService.getCarListAfterRequest(cars, count);
        }

        model.addAttribute("cars", cars);
        return "cars";
    }
}
