package org.sonatype.mavenbook.OpenWeather;

import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.io.SAXReader;
import org.sonatype.mavenbook.OpenWeather.Pojos.*;
import org.sonatype.mavenbook.YahooWeather.YahooWeather;
import org.sonatype.mavenbook.weather.Interfaces.AbstractParser;

import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *  OpenWeather Return Object Parser.
 *  Populates an OpenWeather Object with data returned from the OpenWeather API.
 *
 * @author Tom Woods
 * @version 0.01
 * @since 2020-11-07
 */
public class OpenWeatherParser extends AbstractParser {

    public OpenWeatherParser() { }

    @Override
    public OpenWeatherObject parse(InputStream inputStream) throws Exception {

        OpenWeatherObject weather = new OpenWeatherObject();

        //log.info( "Creating XML Reader" );
        //SAXReader xmlReader = createXmlReader();

        SAXReader xmlReader = new SAXReader();
        Document doc = xmlReader.read( inputStream );

        // Parse the return stream and populate the the OpenWeather
        weather.setCity(
                new City(
                    doc.valueOf("current/city/@id")
                    ,doc.valueOf("current/city/@name")
                    ,new Coordinate( Double.parseDouble( doc.valueOf( "current/city/coord/@lon" ) )
                                    ,Double.parseDouble( doc.valueOf("current/city/coord/@lat") )
                    )
                    ,doc.valueOf("current/city/country")
                    ,new Sun( doc.valueOf( "/current/city/sun/@rise" )
                              ,doc.valueOf("/current/city/sun/@set")
                    )
                )
        );

        weather.setTemperature(
                new Temperature(
                        Double.parseDouble( doc.valueOf("/current/temperature/@value") )
                        ,Double.parseDouble( doc.valueOf("/current/temperature/@min") )
                        ,Double.parseDouble( doc.valueOf("/current/temperature/@max") )
                        ,doc.valueOf("/current/temperature/@unit")
                )
        );

        weather.setWeather(
                new Weather(
                        Integer.parseInt( doc.valueOf("/current/weather/@number") )
                        ,doc.valueOf("/current/weather/@value")
                        ,doc.valueOf("/current/weather/@icon")
                )
        );
        weather.setWind(
                new Wind(
                        new WindSpeed(
                                Double.parseDouble( doc.valueOf("/current/wind/speed/@value") )
                                ,doc.valueOf("/current/wind/speed/@unit")
                                ,doc.valueOf("/current/wind/speed/@name")
                        )
                        ,new WindDirection(
                        Integer.parseInt( doc.valueOf("/current/wind/direction/@value") )
                        ,doc.valueOf("/current/wind/direction/@code")
                        ,doc.valueOf("/current/wind/direction/@name")
                )
                )
        );

        // Other information
        weather.setClouds( new Clouds( doc.valueOf("/current/clouds/@value"), doc.valueOf("/current/clouds/@name") ) );
        weather.setFeelsLike( new FeelsLike( Double.parseDouble( doc.valueOf("/current/feels_like/@value") ), doc.valueOf("/current/feels_like/@unit") ) );
        weather.setHumidity( new Humidity( Double.parseDouble( doc.valueOf("/current/humidity/@value") ), doc.valueOf("/current/humidity/@unit") ) );
        weather.setLastUpdate( new LastUpdate( doc.valueOf( "/current/lastupdate/@value" ) ) );
        weather.setPrecipitation( new Precipitation( Double.parseDouble( doc.valueOf("/current/precipitation/@value") ), doc.valueOf("/current/precipitation/@mode" ) ) );
        weather.setPressure( new Pressure( Double.parseDouble( doc.valueOf("/current/pressure/@value") ), doc.valueOf("/current/pressure/@unit") ) );
        weather.setVisibility( new Visibility(  Integer.parseInt( doc.valueOf( "/current/visibility/@value" ) )) );


        System.out.println();
        //log.info( "Parsing XML Response" );


        return weather;

    }

    private SAXReader createXmlReader() {
        Map<String, String> uris = new HashMap<String, String>();

        //uris.put("y", "https://weather-ydn-yql.media.yahoo.com/forecastrss");

        DocumentFactory factory = new DocumentFactory();
        //factory.setXPathNamespaceURIs( uris );

        SAXReader xmlReader = new SAXReader();
        createXmlReader().setDocumentFactory( factory );
        return xmlReader;
    }
}
