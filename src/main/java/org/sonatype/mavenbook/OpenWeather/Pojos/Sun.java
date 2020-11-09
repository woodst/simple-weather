package org.sonatype.mavenbook.OpenWeather.Pojos;

import java.util.Date;

/**
 *  OpenWeather Sun information
 *
 * @author Tom Woods
 * @version 0.01
 * @since 2020-11-07
 */
public class Sun {

    private String rise;
    private String set;

    public Sun() {
        this.rise = "1900-01-01";
        this.set = "1900-01-01";
    }

    public Sun(String rise, String set) {
        this.rise = rise;
        this.set = set;
    }

    public String getRise() {
        return rise;
    }

    public void setRise(String rise) {
        this.rise = rise;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }
}
