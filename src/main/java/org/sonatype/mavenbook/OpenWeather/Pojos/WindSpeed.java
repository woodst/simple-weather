package org.sonatype.mavenbook.OpenWeather.Pojos;

/**
 *  OpenWeather Wind speed information
 *
 * @author Tom Woods
 * @version 0.01
 * @since 2020-11-07
 */
public class WindSpeed {

    private Float value;
    private String unit;
    private String name;

    public WindSpeed() { }

    public Float getValue() {
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
