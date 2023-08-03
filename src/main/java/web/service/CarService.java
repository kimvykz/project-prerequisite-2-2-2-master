package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarService {
    private List<Car> carList ;

    public CarService(){
        carList = Arrays.asList(new Car("Toyota", "Camry", 180),
                new Car("Lada", "Granta", 140),
                new Car("Lamborghini", "Aventodor", 400),
                new Car("BMW", "530", 230),
                new Car("Tesla", "Model S", 250));
    };
    public CarService(List<Car> carsList){
        this.carList = carsList;
    }

    public List<Car> getCars(int count){

        return carList.subList(0, Math.min(count , carList.size()));
    }

    public int getListSize(){
        return this.carList.size();
    }
}
