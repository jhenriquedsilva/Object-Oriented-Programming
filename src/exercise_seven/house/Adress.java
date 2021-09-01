package exercise_seven.house;

public class Adress {

    String street;
    Integer houseNumber;
    String city;
    String state;

    public Adress(String street, Integer houseNumber, String city, String state) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(Integer houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return String.format("Street: %s | N°: %s | City: %s | State: %s",state,houseNumber,city,state);
    }
}
