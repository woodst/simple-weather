package org.sonatype.mavenbook.weather;

import java.io.InputStream;
import org.apache.log4j.PropertyConfigurator;
import org.sonatype.mavenbook.YahooWeather.YahooParser;
import org.sonatype.mavenbook.YahooWeather.YahooRetriever;
import org.sonatype.mavenbook.YahooWeather.YahooWeather;

public class Main {

    public static void main( String[] args ) throws Exception {

        // config log4j
        PropertyConfigurator.configure( Main.class.getClassLoader().getResource( "log4j.properties"  ));

        // Read zip from shell
        String zipcode = "99163";
        try {
            zipcode = args[0];

        } catch( Exception e ) {}

        // Start the program
        new Main(zipcode).start();
    }

    private String zip;

    public Main( String zip ) {
        this.zip = zip;
    }

    public void start() throws Exception {
        // Retrieve Data
        InputStream dataIn = new YahooRetriever().retrieve( zip );

        // Parse Data
        YahooWeather weather = new YahooParser().parse( dataIn );

        // Format (print) Data
        System.out.print( new WeatherFormatter().format( weather ) );

    }
}
