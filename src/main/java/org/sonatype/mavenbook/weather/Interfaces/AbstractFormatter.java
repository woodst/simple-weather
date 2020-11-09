package org.sonatype.mavenbook.weather.Interfaces;

import org.apache.log4j.Logger;

/**
 *  Abstract Formatter
 *
 * @author Tom Woods
 * @version 0.01
 * @since 2020-11-07
 */
public class AbstractFormatter implements IFormattable {

    private static Logger log = Logger.getLogger( AbstractFormatter.class );

    @Override
    public String format() throws Exception {
        return null;
    }
}
