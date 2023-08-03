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
        CarService carService = new CarService();

        model.addAttribute("cars", carService.getCars((count == null || Integer.parseInt(count) < 1?
                carService.getListSize() : Integer.parseInt(count))));
        return "cars";
    }
}
