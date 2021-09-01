package exercise_seven.house;

public class LivingRoom {

    private Integer numberOfTVs;
    private Integer numberOfSofas;
    private Integer numberOfChairs;
    private Integer numberOfTables;

    public LivingRoom(Integer numberOfTVs, Integer numberOfSofas, Integer numberOfTables, Integer numberOfChairs) {
        this.numberOfTVs = numberOfTVs;
        this.numberOfSofas = numberOfSofas;
        this.numberOfTables = numberOfTables;
        this.numberOfChairs = numberOfChairs;
    }

    public Integer getNumberOfTVs() {
        return numberOfTVs;
    }

    public void setNumberOfTVs(Integer numberOfTVs) {
        this.numberOfTVs = numberOfTVs;
    }

    public Integer getNumberOfSofas() {
        return numberOfSofas;
    }

    public void setNumberOfSofas(Integer numberOfSofas) {
        this.numberOfSofas = numberOfSofas;
    }

    public Integer getNumberOfChairs() {
        return numberOfChairs;
    }

    public void setNumberOfChairs(Integer numberOfChairs) {
        this.numberOfChairs = numberOfChairs;
    }

    public Integer getNumberOfTables() {
        return numberOfTables;
    }

    public void setNumberOfTables(Integer numberOfTables) {
        this.numberOfTables = numberOfTables;
    }

}
