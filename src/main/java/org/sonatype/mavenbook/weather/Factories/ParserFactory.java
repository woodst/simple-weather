package org.sonatype.mavenbook.weather.Factories;

import org.sonatype.mavenbook.OpenWeather.OpenWeatherParser;
import org.sonatype.mavenbook.weather.Interfaces.AbstractParser;

/**
 * OpenWeather Parser
 *
 * @author Tom Woods
 * @version 0.01
 * @since 2020-11-07
 */
public class ParserFactory {

    public ParserFactory() { }

    public AbstractParser getOpenWeatherParser(String weatherParserObjectName ) {

        switch( weatherParserObjectName ) {
            case "OpenWeatherParser":
                return new OpenWeatherParser();
            default:
                return null;
        }
    }
}
