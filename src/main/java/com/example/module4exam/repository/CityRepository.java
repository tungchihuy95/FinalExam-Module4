package com.example.module4exam.repository;


import com.example.module4exam.model.City;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CityRepository extends PagingAndSortingRepository<City, Long> {

}
