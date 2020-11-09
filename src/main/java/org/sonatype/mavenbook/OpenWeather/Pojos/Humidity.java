package org.sonatype.mavenbook.OpenWeather.Pojos;

/**
 *  OpenWeather Humidity information
 *
 * @author Tom Woods
 * @version 0.01
 * @since 2020-11-07
 */
public class Humidity {

    private double value;
    private String unit;    // "%"

    public Humidity() {
        this.value = 0.0;
        this.unit = "unspecified";
    }

    public Humidity(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
