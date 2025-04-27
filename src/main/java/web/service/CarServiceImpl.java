package web.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
@Service
public class CarServiceImpl implements CarService {


    public List<Car> getNewList (Integer count) {
        List<Car> newListOfCars = new ArrayList<>();
        List<Car> vehicles = new ArrayList<>();

        vehicles.add(new Car(1L, "model1", 101));
        vehicles.add(new Car(2L, "model2", 102));
        vehicles.add(new Car(3L, "model3", 103));
        vehicles.add(new Car(4L, "model4", 104));
        vehicles.add(new Car(5L, "model5", 105));

        vehicles.stream().limit(count).forEach(newListOfCars::add);

        return newListOfCars;
    }
}
