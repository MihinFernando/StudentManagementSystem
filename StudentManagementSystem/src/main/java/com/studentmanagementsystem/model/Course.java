/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studentmanagementsystem.model;

/**
 *
 * @author mihin
 */
public class Course {
    private int id;
    private String name;
    private String duration;
    private double fee;

    public Course(int id, String name, String duration, double fee) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.fee = fee;
    }

    public Course(String name, String duration, double fee) {
        this.name = name;
        this.duration = duration;
        this.fee = fee;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public String getDuration() { return duration; }
    public double getFee() { return fee; }

    public void setName(String name) { this.name = name; }
    public void setDuration(String duration) { this.duration = duration; }
    public void setFee(double fee) { this.fee = fee; }
}
