package com.bpi.hello;


public class Day4Activity2 {
    public static void main(String[] args) {
        
        Car car1 = new Car();  // default values
        
        car1.setMake("Toyota");
        car1.setModel("Yaris Cross");
        car1.setYear(2025);
        car1.setColor("Torquiose Blue");
        car1.setMileage(25000);

        
        Car car2 = new Car("Toyota", "Fortuner", 2022, "Metallic Grey", 66000);

        
        System.out.println("=== Car 1 Details ===");
        System.out.println(car1.describe());    
        car1.drive(45);                         
        System.out.println("After driving: " + car1.describe());

        System.out.println("\n=== Car 2 Details ===");
        System.out.println(car2.describe());    
        car2.drive(120);                        
        System.out.println("After driving: " + car2.describe());
    }
}


class Car {
    
    private String make;
    private String model;
    private int year;
    private String color;
    private int mileage;


    public Car() {
        
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.color = "Unpainted";
        this.mileage = 0;
    }


    public Car(String make, String model, int year, String color, int mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.mileage = mileage;
    }


    public String describe() {
        return String.format("%s %s (%d) - %s | %,d km",
                make, model, year, color, mileage);
    }


    public void drive(int kilometers) {
        if (kilometers <= 0) {
            System.out.println("Distance must be positive.");
            return;
        }
        mileage += kilometers;
        System.out.printf("Driven %d km. New mileage: %,d km%n", kilometers, mileage);
    }


    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getMileage() { return mileage; }
    public void setMileage(int mileage) { this.mileage = mileage; }
}
