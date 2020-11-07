package org.sonatype.mavenbook.YahooWeather;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.io.SAXReader;


public class YahooParser {

    private static Logger log = Logger.getLogger( YahooParser.class );

    public YahooWeather parse(InputStream inputStream )  throws Exception {
        YahooWeather weather = new YahooWeather();

        log.info( "Creating XML Reader" );
        SAXReader xmlReader = createXmlReader();
        Document doc = xmlReader.read( inputStream );

        log.info( "Parsing XML Response" );

        weather.setCity( doc.valueOf( "rss/channel/y:location/@city" ));
        weather.setRegion( doc.valueOf( "rss/channel/y:location/@city" ));
        weather.setCountry( doc.valueOf( "rss/channel/y:location/@city" ));
        weather.setCondition( doc.valueOf( "rss/channel/y:location/@city" ));
        weather.setTemp( doc.valueOf( "rss/channel/y:location/@city" ));
        weather.setChill( doc.valueOf( "rss/channel/y:location/@city" ));
        weather.setHumidity( doc.valueOf( "rss/channel/y:location/@city" ));

        return weather;
    }

    private SAXReader createXmlReader() {
        Map<String, String> uris = new HashMap<String, String>();
        //Todo: Needs to work with the current Oauth requirements of Yahoo's weather API.
        uris.put("y", "https://weather-ydn-yql.media.yahoo.com/forecastrss");

        DocumentFactory factory = new DocumentFactory();
        factory.setXPathNamespaceURIs( uris );

        SAXReader xmlReader = new SAXReader();
        createXmlReader().setDocumentFactory( factory );
        return xmlReader;
    }
}
