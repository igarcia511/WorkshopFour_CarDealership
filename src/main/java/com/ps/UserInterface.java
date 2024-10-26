package com.ps;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private static Dealership dealership;
    static Scanner commandScanner = new Scanner(System.in);
    static Scanner inputScanner = new Scanner(System.in);

    public UserInterface() {
    }


    private static void init() {
        System.out.println("init method");
        dealership = DealershipFileManager.getDealership();

        // Loading Dealership  and inventory from a file
    }

    public static void display() {
        init();

        // Load the menu
        // Create menu command int mainMenuCommand;
        System.out.println("Welcome to " + dealership.getName());
        int mainMenuCommand;
        do {
            System.out.println("1) to get vehicles by price");
            System.out.println("2) to get vehicle by make and model");
            System.out.println("3) to get vehicle by year");
            System.out.println("4) to get vehicle by color");
            System.out.println("5) to get vehicle by mileage");
            System.out.println("6) to get vehicles by type(suv, truck, sedan)");
            System.out.println("7) to get all vehicles");
            System.out.println("8) to add a vehicle");
            System.out.println("9) to remove a vehicle");

            System.out.println("Command: ");
            mainMenuCommand = commandScanner.nextInt();

            switch (mainMenuCommand) {
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehicleTypeRequest();
                case 7:
                    processGetAllVehiclesRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                case 0:
                    System.out.println("Exiting the program. . . ");
                    break;
                default:
                    System.out.println("Invalid command, try again. . .");

            }


        } while (mainMenuCommand != 0);

    }
   public static void processGetByPriceRequest(){}
   public static void  processGetByMakeModelRequest(){}
    public static void processGetByYearRequest(){}
    public static void processGetByColorRequest(){
        System.out.print("Enter the color you are looking for:");
        String userColorChoice = inputScanner.nextLine();
        List<Vehicle> vehicles = dealership.getVehiclesByColor(userColorChoice);
       for(Vehicle vehicle: vehicles){
           displayVehicles(vehicle);
       }


    }
    public static void  processGetByMileageRequest(){}
    public static void processGetByVehicleTypeRequest(){}
    public static void processGetAllVehiclesRequest(){
        System.out.println("Displaying all vehicles");
       List<Vehicle> vehicles = dealership.getAllVehicles();
       for(Vehicle vehicle: vehicles){
           displayVehicles(vehicle);
       }

    }
    public static void processAddVehicleRequest(){}
    public static void processRemoveVehicleRequest(){
        int index = 1;
        List<Vehicle> vehicles = dealership.getAllVehicles();
            for(Vehicle vehicle: vehicles){
                System.out.println(index + " " + vehicle);
                index++;
            }
        System.out.println("Select the vehicle to remove by its number:");
            int vehicleNumber = inputScanner.nextInt();

            if(vehicleNumber < 1 || vehicleNumber > vehicles.size()){
                System.out.println("Invalid vehicle selection. . .");
            } else {
                Vehicle vehicleToRemove = vehicles.get(vehicleNumber - 1);
                dealership.removeVehicle(vehicleToRemove);
            }



    }

private static void displayVehicles(Vehicle vehicle){
    //Vehicle(int vin, int year, String make, String model, String vehicleType, String color, int odometer, double price
    System.out.printf("%d|%d|%s|%s|%s|%s|%d|%.2f\n",
            vehicle.getVin(),
            vehicle.getYear(),
            vehicle.getMake(),
            vehicle.getModel(),
            vehicle.getVehicleType(),
            vehicle.getColor(),
            vehicle.getOdometer(),
            vehicle.getPrice());



}

}
