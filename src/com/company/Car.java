package com.company;

public class Car implements Comparable<Car> {
    private String model;
    private int year;
    private double volume;

    public Car(String model, int year, double volume) {
        this.model = model;
        this.year = year;
        this.volume = volume;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public int compareTo(Car car) {
        if (this.year < car.getYear()) {
            return -1;
        } else if (this.year > car.getYear()) {
            return 1;
        } else {
            return 0;
        }
    }
}
