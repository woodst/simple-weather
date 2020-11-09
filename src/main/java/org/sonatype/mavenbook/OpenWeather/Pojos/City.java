package org.sonatype.mavenbook.OpenWeather.Pojos;

/**
 *  OpenWeather City information
 *
 * @author Tom Woods
 * @version 0.01
 * @since 2020-11-07
 */
public class City {

    private String cityID;
    private String cityName;
    private Coordinate coordinate;
    private String country;
    private Sun sun;


    public City() {
        this.cityID = "unspecified";
        this.cityName = "unspecified";
        this.coordinate = new Coordinate();
        this.country = "unspecified";
        this.sun = new Sun();
    }

    public City(String cityID, String cityName, Coordinate coordinate, String country, Sun sun) {
        this.cityID = cityID;
        this.cityName = cityName;
        this.coordinate = coordinate;
        this.country = country;
        this.sun = sun;
    }

    public String getCityID() {
        return cityID;
    }

    public void setCityID(String cityID) {
        this.cityID = cityID;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Sun getSun() {
        return sun;
    }

    public void setSun(Sun sun) {
        this.sun = sun;
    }
}
