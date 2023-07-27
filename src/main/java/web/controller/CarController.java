package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {


    @GetMapping(value = "/cars")
    public String printCars(Model model, @RequestParam(required = false) String count){
        CarService carService = new CarService(Arrays.asList(new Car("Toyota", "Camry", 180),
                new Car("Lada", "Granta", 140),
                new Car("Lamborghini", "Aventodor", 400),
                new Car("BMW", "530", 230),
                new Car("Tesla", "Model S", 250)
                )
        );

        model.addAttribute("cars", carService.getCars((count == null ?
                carService.getListSize() : Integer.parseInt(count))));
        return "cars";
    }
}
