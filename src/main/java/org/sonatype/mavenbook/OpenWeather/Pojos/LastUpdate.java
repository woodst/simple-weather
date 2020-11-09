package org.sonatype.mavenbook.OpenWeather.Pojos;

import java.util.Date;

/**
 *  OpenWeather Last update information
 *
 * @author Tom Woods
 * @version 0.01
 * @since 2020-11-07
 */
public class LastUpdate {

    private String value;

    public LastUpdate() {
        this.value = "1900-01-01";
    }

    public LastUpdate(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
