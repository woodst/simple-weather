package org.sonatype.mavenbook.OpenWeather.Pojos;

/**
 *  OpenWeather Temperature information
 *
 * @author Tom Woods
 * @version 0.01
 * @since 2020-11-07
 */
public class Temperature {

    private double value;
    private double min;
    private double max;
    private String unit;

    public Temperature() {
        this.value = 0.0;
        this.min = 0.0;
        this.max = 0.0;
        this.unit = "unspecified";
    }

    public Temperature(double value, double min, double max, String unit) {
        this.value = value;
        this.min = min;
        this.max = max;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public double getMin() {
        return min;
    }

    public void setMin(Float min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(Float max) {
        this.max = max;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
