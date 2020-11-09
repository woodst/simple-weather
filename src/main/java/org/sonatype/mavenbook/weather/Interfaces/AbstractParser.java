package org.sonatype.mavenbook.weather.Interfaces;

import org.sonatype.mavenbook.OpenWeather.OpenWeatherObject;

import java.io.InputStream;

/**
 * Abstract Parser
 *
 * @author Tom Woods
 * @version 0.01
 * @since 2020-11-07
 */
public class AbstractParser implements IParsable {


    @Override
    public OpenWeatherObject parse(InputStream inputStream) throws Exception {
        return null;
    }
}
