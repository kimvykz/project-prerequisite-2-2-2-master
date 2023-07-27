package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarService {
    private List<Car> carList;

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
