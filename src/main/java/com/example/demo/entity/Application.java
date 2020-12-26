package com.example.demo.entity;

import javax.persistence.*;


@Entity
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="app_id")
    private Integer id;

    @Column(name="app_name", nullable = false)
    private String name;

    @Column(length = 2000)
    private String description;

    private String owner;

    public void Application() {}

    public void Application(Integer id, String name, String description, String owner) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.owner = owner;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
