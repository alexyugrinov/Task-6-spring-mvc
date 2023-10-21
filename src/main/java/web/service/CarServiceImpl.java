package web.service;

import org.springframework.ui.ModelMap;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class CarServiceImpl implements CarService {

    public List<Car> getNewList (List<Car> vehicles, Integer count) {
        List<Car> newListOfCars = new ArrayList<>();

        vehicles.stream().limit(count).forEach(newListOfCars::add);

        return newListOfCars;
    }
}
