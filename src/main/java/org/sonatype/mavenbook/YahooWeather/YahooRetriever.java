package org.sonatype.mavenbook.YahooWeather;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import org.apache.log4j.Logger;

public class YahooRetriever {

    private static Logger log = Logger.getLogger( YahooRetriever.class );

    // todo: Don't use zip code.  Use the Sunnyvale default name in order to get data
    public InputStream retrieve( String zipcode ) throws Exception {
        log.info( "Retrieving Weather Data" );

        //ToDo: Again, needs top be updated to work with Oauth
        String url = "https://weather-ydn-yql.media.yahoo.com/forecastrss?=" + zipcode;
        URLConnection conn = new URL(url).openConnection();
        return conn.getInputStream();
    }

}
