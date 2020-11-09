package org.sonatype.mavenbook.weather.Factories;

import org.sonatype.mavenbook.OpenWeather.OpenWeatherFormatter;
import org.sonatype.mavenbook.weather.Interfaces.AbstractFormatter;

/**
 *  Formatter Factory
 *
 * @author Tom Woods
 * @version 0.01
 * @since 2020-11-07
 */
public class FormatterFactory {

    public FormatterFactory() { }

    public AbstractFormatter getWeatherFormatter( String weatherFormatterObjectName ) {

        switch( weatherFormatterObjectName ) {
            case "OpenWeatherFormatter":
                return new OpenWeatherFormatter();
            default:
                return null;
        }
    }
}
