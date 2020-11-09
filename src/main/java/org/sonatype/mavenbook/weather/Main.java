package org.sonatype.mavenbook.weather;

import org.sonatype.mavenbook.OpenWeather.OpenWeatherObject;
import org.sonatype.mavenbook.weather.Factories.ParserFactory;
import org.sonatype.mavenbook.weather.Factories.RetrieverFactory;

import java.io.InputStream;

public class Main {

    public static void main( String[] args ) throws Exception {

        // config log4j
        //PropertyConfigurator.configure( Main.class.getClassLoader().getResource( "log4j.properties"  ));

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

        InputStream dataIn = ( new RetrieverFactory().getRetriever( "OpenWeatherRetriever" ).retrieve( "99163", "b344da26542bfa3b2a72d5bd06b91100" ));
        OpenWeatherObject weather = (new ParserFactory().getOpenWeatherParser( "OpenWeatherParser" )).parse( dataIn );

        System.out.println();

//        // Retrieve Data
//        InputStream dataIn = new YahooRetriever().retrieve( zip );
//
//        // Parse Data
//        YahooWeather weather = new YahooParser().parse( dataIn );
//
//        // Format (print) Data
//        System.out.print( new WeatherFormatter().format( weather ) );

    }

}
