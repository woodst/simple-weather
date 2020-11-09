package org.sonatype.mavenbook.OpenWeather.Pojos;

/**
 *  OpenWeather Wind speed information
 *
 * @author Tom Woods
 * @version 0.01
 * @since 2020-11-07
 */
public class WindSpeed {

    private double value;
    private String unit;
    private String name;

    public WindSpeed() {
        this.value = 0.0;
        this.unit = "unspecified";
        this.name = "unspecified";
    }

    public WindSpeed(double value, String unit, String name) {
        this.value = value;
        this.unit = unit;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
