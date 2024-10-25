package com.ps;

public class UserInterface {
    private static Dealership dealership;

    public UserInterface() {
    }


    public static void init(){
        System.out.println("init method");
      dealership =  DealershipFileManager.getDealership();

        // Loading Dealership  and inventory from a file
    }
    public static void display(){
        init();
        DealershipFileManager.saveDealership(dealership);

        //Load the menu
    }


}
