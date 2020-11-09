package org.sonatype.mavenbook.weather.Interfaces;

import org.sonatype.mavenbook.OpenWeather.OpenWeatherObject;

import java.io.InputStream;

/**
 *  IParsable
 *
 * @author Tom Woods
 * @version 0.01
 * @since 2020-11-07
 */
public interface IParsable {

    public OpenWeatherObject parse(InputStream inputStream )  throws Exception;

}
