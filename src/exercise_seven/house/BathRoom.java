package exercise_seven.house;

public class BathRoom {

    private Integer numberOfToilets;
    private Integer numberOfBathroomCabinets;
    private Integer numberOfBaths;
    private Integer numberOfShowerCubicles;

    public BathRoom(Integer numberOfToilets, Integer numberOfBathroomCabinets, Integer numberOfBaths, Integer numberOfShowerCubicles) {
        this.numberOfToilets = numberOfToilets;
        this.numberOfBathroomCabinets = numberOfBathroomCabinets;
        this.numberOfBaths = numberOfBaths;
        this.numberOfShowerCubicles = numberOfShowerCubicles;
    }

    public Integer getNumberOfToilets() {
        return numberOfToilets;
    }

    public void setNumberOfToilets(Integer numberOfToilets) {
        this.numberOfToilets = numberOfToilets;
    }

    public Integer getNumberOfBathroomCabinets() {
        return numberOfBathroomCabinets;
    }

    public void setNumberOfBathroomCabinets(Integer numberOfBathroomCabinets) {
        this.numberOfBathroomCabinets = numberOfBathroomCabinets;
    }

    public Integer getNumberOfBaths() {
        return numberOfBaths;
    }

    public void setNumberOfBaths(Integer numberOfBaths) {
        this.numberOfBaths = numberOfBaths;
    }

    public Integer getNumberOfShowerCubicles() {
        return numberOfShowerCubicles;
    }

    public void setNumberOfShowerCubicles(Integer numberOfShowerCubicles) {
        this.numberOfShowerCubicles = numberOfShowerCubicles;
    }
}
