package org.sonatype.mavenbook.weather.Factories;

import org.sonatype.mavenbook.OpenWeather.OpenWeatherRetriever;
import org.sonatype.mavenbook.weather.Interfaces.AbstractRetriever;

/**
 *  RetrieverFactory
 *
 * @author Tom Woods
 * @version 0.01
 * @since 2020-11-07
 */
public class RetrieverFactory {

    public RetrieverFactory() {};

    public AbstractRetriever getRetriever(String retrieverObjectName ) {

        switch( retrieverObjectName ) {
            case "OpenWeatherRetriever":
                return new OpenWeatherRetriever();
            default:
                return null;
        }
    }

}
