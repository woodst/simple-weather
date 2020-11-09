package org.sonatype.mavenbook.OpenWeather;

import org.sonatype.mavenbook.OpenWeather.Pojos.*;
import org.sonatype.mavenbook.weather.Interfaces.AbstractParser;
import org.sonatype.mavenbook.weather.Interfaces.AbstractWeather;

/**
 *  OpenWeather API - Main OpenWeather object
 *
 * @author Tom Woods
 * @version 0.01
 * @since 2020-11-07
 */
public class OpenWeatherObject extends AbstractWeather {

    private City city;
    private Clouds clouds;
    private FeelsLike feelsLike;
    private Humidity humidity;
    private LastUpdate lastUpdate;
    private Precipitation precipitation;
    private Pressure pressure;
    private Temperature temperature;
    private Visibility visibility;
    private Weather weather;
    private Wind wind;

    public OpenWeatherObject() {
        this.city = new City();
        this.clouds = new Clouds();
        this.feelsLike = new FeelsLike();
        this.humidity = new Humidity();
        this.lastUpdate = new LastUpdate();
        this.precipitation = new Precipitation();
        this.pressure = new Pressure();
        this.temperature = new Temperature();
        this.visibility = new Visibility();
        this.weather = new Weather();
        this.wind = new Wind();
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public FeelsLike getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(FeelsLike feelsLike) {
        this.feelsLike = feelsLike;
    }

    public Humidity getHumidity() {
        return humidity;
    }

    public void setHumidity(Humidity humidity) {
        this.humidity = humidity;
    }

    public LastUpdate getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LastUpdate lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Precipitation getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(Precipitation precipitation) {
        this.precipitation = precipitation;
    }

    public Pressure getPressure() {
        return pressure;
    }

    public void setPressure(Pressure pressure) {
        this.pressure = pressure;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }
}
