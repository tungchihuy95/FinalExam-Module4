package com.example.module4exam.model;

import javax.persistence.*;

@Entity
@Table(name = "cities")
public class City {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String cityName;
    private String country;
    private Long totalArea;
    private Long population;
    private Long gdp;
    private String desc;


    public City() {
    }

    public City(Long id, String cityName, String country, Long totalArea, Long population, Long gdp, String desc) {
        this.id = id;
        this.cityName = cityName;
        this.country = country;
        this.totalArea = totalArea;
        this.population = population;
        this.gdp = gdp;
        this.desc = desc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(Long totalArea) {
        this.totalArea = totalArea;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public Long getGdp() {
        return gdp;
    }

    public void setGdp(Long gdp) {
        this.gdp = gdp;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
