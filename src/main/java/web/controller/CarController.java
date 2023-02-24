package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {
    Car car1 = new Car("Toyota", "Camry", "XV40");
    Car car2 = new Car("BMW", "5-series", "F10");
    Car car3 = new Car("Audi", "TT", "8S");
    Car car4 = new Car("Honda", "Civic", "VIII");
    Car car5 = new Car("Dodge", "Challenger", "III");

    List<Car> carList = Arrays.asList(car1, car2, car3, car4, car5);


    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", defaultValue = "5") String count, ModelMap modelMap) {
        int intCount = Integer.parseInt(count);
        if (intCount > 5) { intCount = 5;}
        modelMap.addAttribute("carList", carList.subList(0, intCount));
        return "cars";
    }

}
