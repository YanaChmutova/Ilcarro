package model;

import java.util.Objects;

public class SearchingCar {

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    @Override
    public String toString() {
        return "SearchingCar{" +
                "city='" + city + '\'' +
                ", dates='" + dates + '\'' +
                '}';
    }

    public SearchingCar() {}


    private String city;
    private String dates;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SearchingCar that)) return false;
        return Objects.equals(getCity(), that.getCity()) && Objects.equals(getDates(), that.getDates());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCity(), getDates());
    }

    public SearchingCar(String city, String dates) {
        this.city = city;
        this.dates = dates;
    }

}