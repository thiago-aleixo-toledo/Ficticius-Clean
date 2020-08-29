package com.fictiusclean.src.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Initializer implements ApplicationRunner {

	private CarRepository carRepository;

	@Autowired
	public Initializer(CarRepository carRepository) {
		this.carRepository = carRepository;
	}


	@Override
	public void run(ApplicationArguments args) throws Exception {
		Car carDefault = new Car();
		carDefault.setNameCar("Tom");
		carRepository.save(carDefault);
	}
}