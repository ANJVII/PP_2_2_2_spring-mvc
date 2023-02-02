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
public class CarsController {

    private static final List<Car> cars = Car.getFiveCars();

    @GetMapping(value = "/cars")
    public String printCarsCount(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        if (count == null) {
            count = 5;
        }
        model.addAttribute("Cars", CarService.getCars(count));
        return "cars";
    }
}