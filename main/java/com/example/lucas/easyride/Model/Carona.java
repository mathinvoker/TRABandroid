package com.example.lucas.easyride.Model;

/**
 * Created by Lucas on 30/04/2015.
 */
public class Carona {

    private String departureCity;
    private String departureAddress;
    private String destinationCity;
    private String destinationAddress;
    private String departureDate;
    private String departureTime;
    private String seatsAvailable;

    public Carona(String departureCity, String destinationCity, String departureDate, String departureTime, String seatsAvailable) {
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.seatsAvailable = seatsAvailable;
    }

    public Carona(String departureCity, String departureAddress, String destinationCity, String destinationAddress, String departureDate, String departureTime, String seatsAvailable) {
        this.departureCity = departureCity;
        this.departureAddress = departureAddress;
        this.destinationCity = destinationCity;
        this.destinationAddress = destinationAddress;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.seatsAvailable = seatsAvailable;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getDepartureAddress() {
        return departureAddress;
    }

    public void setDepartureAddress(String departureAddress) {
        this.departureAddress = departureAddress;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(String seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }
}