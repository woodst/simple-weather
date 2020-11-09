package org.sonatype.mavenbook.OpenWeather.Pojos;

/**
 *  OpenWeather Precipitation information
 *
 * @author Tom Woods
 * @version 0.01
 * @since 2020-11-07
 */
public class Precipitation {

    private double value;
    private String mode;

    public Precipitation() {
        this.value = 0.0;
        this.mode = "unspecified";
    }

    public Precipitation(double value, String mode) {
        this.value = value;
        this.mode = mode;
    }

    public double getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
