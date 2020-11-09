package org.sonatype.mavenbook.weather.Interfaces;

import org.apache.log4j.Logger;

import java.io.InputStream;

/**
 *  Retrieves a weather object from it's corresponding web service
 *
 * @author Tom Woods
 * @version 0.01
 * @since 2020-11-07
 */
public abstract class AbstractRetriever implements IRetrievable {

    private static Logger log = Logger.getLogger( AbstractRetriever.class );

    @Override
    public InputStream retrieve(String zipCode, String apiKey ) throws Exception{
        return null;
    }
}
