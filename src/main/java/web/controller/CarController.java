package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class CarController {
	@GetMapping(value = "/cars")
	public String printCarsCounts(@RequestParam Optional<Integer> count, ModelMap model) {
		CarService carService = new CarServiceImpl();

		List<Car> vehicles = new ArrayList<>();

		vehicles.add(new Car(1L, "model1", 101));
		vehicles.add(new Car(2L, "model2", 102));
		vehicles.add(new Car(3L, "model3", 103));
		vehicles.add(new Car(4L, "model4", 104));
		vehicles.add(new Car(5L, "model5", 105));

		model.addAttribute("vehicles", carService.getNewList(vehicles, count.orElseGet(() -> 5)));

		return "cars";
	}
}