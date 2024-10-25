package com.ps;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {

        this.name = name;
        this.address = address;
        this.phone = phone;

        this.inventory = new ArrayList<>();


    }
    public List<Vehicle> getVehiclesByPrice(double min, double max){return null;} // List<Vehicle>
    public List<Vehicle> getVehiclesByMakeModel(String make, String model){return null;} // List<Vehicle>
    public List<Vehicle> getVehiclesByYear(int min, int max){return null;} // List<Vehicle>
    public List<Vehicle> getVehiclesByColor(String color){return null;} //List<Vehicle>
    public List<Vehicle> getVehiclesByMileage(int min, int max){return null;} // List <Vehicle>
    public List<Vehicle> getVehiclesByType(String vehicleType){return null;} // List<Vehicle>
    public List<Vehicle> getAllVehicles(){
        return this.inventory;
    } // List<Vehicle>

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

     public void addVehicle(Vehicle vehicle){
        this.inventory.add(vehicle);
     } //expects a vehicle object


     public  void removeVehicle(Vehicle vehicle){
        this.inventory.remove(vehicle);
     } // removes vehicle

    @Override
    public String toString() {
        return "Dealership{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", inventory=" + inventory +
                '}';
    }
}
