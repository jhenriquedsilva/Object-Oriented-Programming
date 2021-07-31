package exercise_three;

public class Elevator {

    private final int buildingTotalFloors,capacity;
    private int currentNumberOfPassengers, currentFloor;

    public int getBuildingTotalFloors() {
        return buildingTotalFloors;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentNumberOfPassengers() {
        return currentNumberOfPassengers;
    }

    public void setCurrentNumberOfPassengers(int currentNumberOfPassengers) {
        this.currentNumberOfPassengers = currentNumberOfPassengers;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    // Inicializa
    public Elevator(int capacity, int buildingTotalFloors) {
        this.capacity = capacity;
        this.buildingTotalFloors = buildingTotalFloors;
        this.currentFloor = 0;
        this.currentNumberOfPassengers = 0;
    }

    // Entra
    public void getIn() {
        if (currentNumberOfPassengers < capacity) {
            System.out.println("A peron got in");
            currentNumberOfPassengers += 1;
        } else {
            System.out.println("Sorry! I can't carry another person. I'm already full!");
        }
    }

    // Sai
    public void getOut() {
        if (currentNumberOfPassengers > 0) {
            System.out.println("A peron got out");
            currentNumberOfPassengers -= 1;
        } else {
            System.out.println("Sorry! It's impossible to get out. There's no one here");
        }
    }

    // Sobe
    public void goUp() {
        if (currentFloor > buildingTotalFloors) {
            System.out.println("Going up");
            currentFloor += 1;
        } else {
            System.out.println("Sorry! I can't go up. I'm at the highest floor.");
        }
    }

    // Desce
    public void goDown() {
        if (currentFloor > 0) {
            System.out.println("Going down");
            currentFloor -= 1;
        } else {
            System.out.println("Sorry! I can't go down. I'm at the lowest floor.");
        }
    }
}
