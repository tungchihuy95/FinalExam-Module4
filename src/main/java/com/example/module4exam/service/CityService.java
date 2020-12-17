package com.example.module4exam.service;

import com.example.module4exam.model.City;

import java.util.Optional;

public interface CityService {
    Iterable<City> findAll();

    Optional<City> findById(Long id);

    void save(City city);

    void remove(City city);
}
