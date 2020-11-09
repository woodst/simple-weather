package org.sonatype.mavenbook.OpenWeather.Pojos;

/**
 *  OpenWeather Cloud information
 *
 * @author Tom Woods
 * @version 0.01
 * @since 2020-11-07
 */
public class Clouds {

    private String value;
    private String name;

    public Clouds() {
        this.value = "unspecified";
        this.name = "unspecified";
    }

    public Clouds(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
