package org.sonatype.mavenbook.OpenWeather;

import org.sonatype.mavenbook.weather.Interfaces.AbstractRetriever;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 *  OpenWeather Retriever
 *  Calls the OpenWeather API and retrieves data for the passed-in city.
 *
 * @author Tom Woods
 * @version 0.01
 * @since 2020-11-07
 */
public class OpenWeatherRetriever extends AbstractRetriever {

    public OpenWeatherRetriever() { }

    @Override
    public InputStream retrieve( String zipCode, String apiKey ) throws Exception {

        String url = "https://api.openweathermap.org/data/2.5/weather?zip=" + zipCode + ",us&appid=" + apiKey + "&mode=xml";
        URLConnection conn = new URL(url).openConnection();
        return conn.getInputStream();
    }

}
