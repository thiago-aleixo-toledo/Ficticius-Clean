package com.fictiusclean.src.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(tags = "Car Repository")
@RepositoryRestResource(collectionResourceRel = "cars", path = "cars")
public interface CarRepository extends PagingAndSortingRepository<Car,Long> {

    @ApiOperation("Lista o veículo através do nome")
    List<Car> findByNameCar(@Param("name") @ApiParam(value="Nome do veículo") String name);
}