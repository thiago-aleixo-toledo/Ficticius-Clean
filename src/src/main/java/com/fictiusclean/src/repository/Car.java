package com.fictiusclean.src.repository;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel("Veículo")
public class Car {
    @ApiModelProperty(hidden = true)
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ApiModelProperty(value = "Nome do veículo")
    @Column
    private String nameCar;

    @ApiModelProperty(value = "Placa")
    @Column
    private String plate;

    @ApiModelProperty(value = "Marca")
    @Column
    private String brand;

    @ApiModelProperty(value = "Modelo")
    @Column
    private String model;

    @ApiModelProperty(value = "Data de fabricação")
    @Column
    private Date factoryDate;

    @ApiModelProperty(value = "Consumo Médio de combustível dentro de cidade (Km/L)")
    @Column
    private double averageCity;

    @ApiModelProperty(value = "Consumo Médio de combustível em rodovias (Km/L)")
    @Column
    private double averageHighWay;

    public Long getIdCar() { return this.id; }

    public void setNameCar(String nameCar) { this.nameCar = nameCar; }
    public String getNameCar() { return this.nameCar; }

    public void setPlate(String plate) { this.plate = plate; }
    public String getPlate() { return this.plate; }

    public void setBrand(String brand) { this.brand = brand; }
    public String getBrand() { return this.brand; }

    public void setModel(String model) { this.model = model; }
    public String getModel() { return this.model; }

    public void setFactoryDate(Date factoryDate) { this.factoryDate = factoryDate; }
    public Date getFactoryDate() { return this.factoryDate; }

    public void setAverageCity(Double averageCity) { this.averageCity = averageCity; }
    public Double getAverageCity() { return this.averageCity; }

    public void setAverageHighWay(Double averageHighWay) { this.averageHighWay = averageHighWay; }
    public Double getAverageHighWay() { return this.averageHighWay; }
}