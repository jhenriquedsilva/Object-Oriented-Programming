package exercise_seven.house;

public class Kitchen {

    Integer numberOfOvens;
    Integer numberOfRefrigerators;
    Integer numberOfSinks;

    public Kitchen(Integer numberOfOvens, Integer numberOfRefrigerators, Integer numberOfSinks) {
        this.numberOfOvens = numberOfOvens;
        this.numberOfRefrigerators = numberOfRefrigerators;
        this.numberOfSinks = numberOfSinks;
    }

    public Integer getNumberOfOvens() {
        return numberOfOvens;
    }

    public void setNumberOfOvens(Integer numberOfOvens) {
        this.numberOfOvens = numberOfOvens;
    }

    public Integer getNumberOfRefrigerators() {
        return numberOfRefrigerators;
    }

    public void setNumberOfRefrigerators(Integer numberOfRefrigerators) {
        this.numberOfRefrigerators = numberOfRefrigerators;
    }

    public Integer getNumberOfSinks() {
        return numberOfSinks;
    }

    public void setNumberOfSinks(Integer numberOfSinks) {
        this.numberOfSinks = numberOfSinks;
    }

}
