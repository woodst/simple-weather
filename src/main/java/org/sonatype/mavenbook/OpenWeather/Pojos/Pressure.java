package org.sonatype.mavenbook.OpenWeather.Pojos;

/**
 *  OpenWeather Pressure information
 *
 * @author Tom Woods
 * @version 0.01
 * @since 2020-11-07
 */
public class Pressure {

    private double value;
    private String units;

    public Pressure() {
        this.value = 0.0;
        this.units = "unspecified";
    }

    public Pressure(double value, String units) {
        this.value = value;
        this.units = units;
    }

    public double getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }
}
