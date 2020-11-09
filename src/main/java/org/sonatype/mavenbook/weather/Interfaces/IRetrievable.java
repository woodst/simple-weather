package org.sonatype.mavenbook.weather.Interfaces;

import java.io.InputStream;

/**
 *  IRetrievable
 *
 * @author Tom Woods
 * @version 0.01
 * @since 2020-11-07
 */
public interface IRetrievable {

    public InputStream retrieve( String zipCode, String apiKey ) throws Exception;

}
