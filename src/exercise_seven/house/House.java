package exercise_seven.house;

import java.util.ArrayList;

public class House {
    private Adress adress;
    private ArrayList<LivingRoom> livingRooms = new ArrayList<LivingRoom>();
    private Kitchen kitchen;
    private ArrayList<BedRoom> bedRooms = new ArrayList<BedRoom>();
    private ArrayList<BathRoom> bathRooms = new ArrayList<BathRoom>();
    private Garage garage;

    public House() {}

    public void setAdress(String street, Integer houseNumber, String city, String state) {
        this.adress = new Adress(street, houseNumber, city, state);
    }

    public Adress getAdress() {
        return adress;
    }

    public void buildGarage(Double length, Double width) {
        System.out.println("Building your garage");
        this.garage = new Garage(length,width);
        System.out.println("Garage built");
    }

    public Garage getGarage() {
        return garage;
    }

    public void buildKitchen(Integer numberOfOvens, Integer numberOfRefrigerators, Integer numberOfSinks) {
        System.out.println("Building your kitchen");
        this.kitchen = new Kitchen(numberOfOvens,numberOfRefrigerators,numberOfSinks);
        System.out.println("Kitchen built");
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void buildingLivingroom(Integer numberOfTVs, Integer numberOfSofas, Integer numberOfTables, Integer numberOfChairs) {
        System.out.println("Building a living room");
        livingRooms.add(new LivingRoom(numberOfTVs,numberOfSofas,numberOfTables,numberOfChairs));
        System.out.println("Living room built");
    }

    public void buildingBedroom(Integer numberOfBeds, Integer numberOfClosets, Integer numberOfTVs, Integer numberOfMirrors) {
        System.out.println("Building a bedroom");
        bedRooms.add(new BedRoom(numberOfBeds, numberOfClosets, numberOfTVs, numberOfMirrors));
        System.out.println("Bedroom built");
    }

    public void buildingBathroom(Integer numberOfToilets, Integer numberOfBathroomCabinets, Integer numberOfBaths, Integer numberOfShowerCubicles) {
        System.out.println("Building a living room");
        bathRooms.add(new BathRoom(numberOfToilets, numberOfBathroomCabinets, numberOfBaths, numberOfShowerCubicles));
        System.out.println("Living room built");
    }

    public void destroyHouse() {
        adress = null;
        livingRooms = null;
        kitchen = null;
        bedRooms = null;
        bathRooms = null;
        garage = null;
        System.out.println("House completely destroyed");
    }
}
