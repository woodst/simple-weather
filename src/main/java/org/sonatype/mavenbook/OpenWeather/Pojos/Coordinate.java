package org.sonatype.mavenbook.OpenWeather.Pojos;

/**
 *  OpenWeather Coordinate information
 *
 * @author Tom Woods
 * @version 0.01
 * @since 2020-11-07
 */
public class Coordinate {

    private double lon;
    private double lat;

    public Coordinate() {
        this.lat = 0.0;
        this.lon = 0.0;
    }

    public Coordinate(double lon, double lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }
}
