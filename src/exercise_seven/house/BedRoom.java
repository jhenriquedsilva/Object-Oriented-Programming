package exercise_seven.house;

public class BedRoom {

    private Integer numberOfBeds;
    private Integer numberOfClosets;
    private Integer numberOfTVs;
    private Integer numberOfMirrors;

    public BedRoom(Integer numberOfBeds, Integer numberOfClosets, Integer numberOfTVs, Integer numberOfMirrors) {
        this.numberOfTVs = numberOfTVs;
        this.numberOfBeds = numberOfBeds;
        this.numberOfClosets = numberOfClosets;
        this.numberOfMirrors = numberOfMirrors;
    }

    public Integer getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(Integer numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public Integer getNumberOfClosets() {
        return numberOfClosets;
    }

    public void setNumberOfClosets(Integer numberOfClosets) {
        this.numberOfClosets = numberOfClosets;
    }

    public Integer getNumberOfTVs() {
        return numberOfTVs;
    }

    public void setNumberOfTVs(Integer numberOfTVs) {
        this.numberOfTVs = numberOfTVs;
    }

    public Integer getNumberOfMirrors() {
        return numberOfMirrors;
    }

    public void setNumberOfMirrors(Integer numberOfMirrors) {
        this.numberOfMirrors = numberOfMirrors;
    }
}
