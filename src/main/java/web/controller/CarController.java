package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import java.util.Optional;

@Controller
public class CarController {
	private CarService carService;

	@Autowired
	public CarController(CarService carService) {
		this.carService = carService;
	}

	@GetMapping(value = "/cars")
	public String printCarsCounts(@RequestParam Optional<Integer> count, ModelMap model) {
		model.addAttribute("vehicles", carService.getNewList(count.orElseGet(() -> 5)));

		return "cars";
	}
}