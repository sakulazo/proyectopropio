package com.example.proyectopropio.entities;

import javax.persistence.*;

@Entity
@Table(name = "laptops")
public class Laptop {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String trademark;
    private Double price;
    private Boolean available;

    //constructores
    public Laptop() {
    }

    public Laptop(Long id, String name, String trademark, Double price, Boolean available) {
        this.id = id;
        this.name = name;
        this.trademark = trademark;
        this.price = price;
        this.available = available;
    }

    //métodos getter y setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
