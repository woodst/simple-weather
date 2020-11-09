package org.sonatype.mavenbook.OpenWeather.Pojos;

/**
 *  OpenWeather Visibility information
 *
 * @author Tom Woods
 * @version 0.01
 * @since 2020-11-07
 */
public class Visibility {

    private int value;

    public Visibility() {
        this.value = 0;
    }

    public Visibility(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
