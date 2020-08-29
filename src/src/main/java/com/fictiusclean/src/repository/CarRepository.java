package com.fictiusclean.src.repository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "cars", path = "car")
public interface CarRepository extends PagingAndSortingRepository<Car,Long> {

}