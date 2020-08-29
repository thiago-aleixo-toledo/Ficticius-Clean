package com.fictiusclean.src.repository;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Car {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nameCar;
    private String plate;
    private String brand;
    private String model;
    private double averageCity;
    private double averageHighWay;
}