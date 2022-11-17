package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String carsPrint(ModelMap model, @RequestParam int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(555, "model1", 300000));
        cars.add(new Car(666, "model2", 1000000));
        cars.add(new Car(777, "model3", 600000));
        cars.add(new Car(888, "model4", 100000));
        cars.add(new Car(999, "model5", 200000));
        if (count > cars.size()) {
            model.addAttribute("cars", cars);
        } else {
            model.addAttribute("cars", cars.stream().limit(count).collect(Collectors.toList()));
        }
        return "cars";
    }
}
