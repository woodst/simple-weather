package org.sonatype.mavenbook.OpenWeather.Pojos;

/**
 *  OpenWeather Wind direction information
 *
 * @author Tom Woods
 * @version 0.01
 * @since 2020-11-07
 */
public class WindDirection {

    private int value;
    private String code;
    private String name;

    public WindDirection() {
        this.value = 0;
        this.code = "unspecified";
        this.name = "unspecified";
    }

    public WindDirection(int value, String code, String name) {
        this.value = value;
        this.code = code;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
