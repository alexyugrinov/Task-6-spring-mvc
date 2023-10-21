package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getNewList (List<Car> vehicles, Integer count);
}
