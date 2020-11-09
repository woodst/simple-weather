package org.sonatype.mavenbook.OpenWeather.Pojos;

/**
 *  OpenWeather Weather information
 *
 * @author Tom Woods
 * @version 0.01
 * @since 2020-11-07
 */
public class Weather {

    private int number;
    private String value;
    private String icon;

    public Weather() {
        this.number = 0;
        this.value = "unspecified";
        this.icon = "unspecified";
    }

    public Weather(int number, String value, String icon) {
        this.number = number;
        this.value = value;
        this.icon = icon;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
