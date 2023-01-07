package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarsController {

	@GetMapping(value = "/cars")
	public String printCars(@RequestParam(defaultValue = "5") String count, ModelMap model) {
		CarServiceImpl carService = new CarServiceImpl();
		model.addAttribute("cars", carService.carList(Integer.parseInt(count)));
		return "cars";
	}
}