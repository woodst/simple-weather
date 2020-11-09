package org.sonatype.mavenbook.weather.Factories;

import org.sonatype.mavenbook.OpenWeather.OpenWeatherObject;
import org.sonatype.mavenbook.weather.Interfaces.AbstractWeather;

/**
 *  Creates a composite weather object of the correct type
 *
 * @author Tom Woods
 * @version 0.01
 * @since 2020-11-07
 */
public class WeatherFactory {

    public WeatherFactory( ) { }

    AbstractWeather getWeather( String weatherObjectName ) {
        switch( weatherObjectName ) {
            case "OpenWeather":
                return new OpenWeatherObject();
            default:
                return null;
        }
    }
}
