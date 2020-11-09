package org.sonatype.mavenbook.OpenWeather.Pojos;

/**
 *  OpenWeather Wind information
 *
 * @author Tom Woods
 * @version 0.01
 * @since 2020-11-07
 */
public class Wind {

    private WindSpeed windSpeed;
    private WindDirection windDirection;

    public Wind() {
        this.windSpeed = new WindSpeed();
        this.windDirection = new WindDirection();
    }

    public Wind(WindSpeed windSpeed, WindDirection windDirection) {
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
    }

    public WindSpeed getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(WindSpeed windSpeed) {
        this.windSpeed = windSpeed;
    }

    public WindDirection getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(WindDirection windDirection) {
        this.windDirection = windDirection;
    }
}
