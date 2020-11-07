package org.sonatype.mavenbook.weather;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import org.apache.log4j.Logger;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.sonatype.mavenbook.YahooWeather.YahooWeather;

public class WeatherFormatter {

    private static Logger log = Logger.getLogger(WeatherFormatter.class);

        public String format(YahooWeather weather) throws Exception {
        log.info( "Formatting and Weather Data" );

        Reader reader = new InputStreamReader( getClass().getClassLoader().getResourceAsStream( "output.vm" ) );
        VelocityContext context = new VelocityContext();
        context.put( "weather", weather );
        StringWriter writer = new StringWriter();
        Velocity.evaluate( context, writer, "", reader );

        return writer.toString();

    }
}
