package flight.reservation;

import flight.reservation.flight.Flight;

import java.util.List;

public class Airport {

    private final String name;
    private final String code;
    private final String location;
    private List<Flight> flights;
    private String[] allowedAircraft;

    public Airport(String name, String code, String location) {
        this.name = name;
        this.code = code;
        this.location = location;
        this.allowedAircraft = new String[]{"A380", "A350", "Embraer 190", "Antonov AN2", "H1", "H2", "HypaHype"};
    }

    public Airport(String name, String code, String location, String[] allowedAircraft) {
        this.name = name;
        this.code = code;
        this.location = location;
        this.allowedAircraft = allowedAircraft;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getLocation() {
        return location;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public String[] getAllowedAircraft() {
        return allowedAircraft;
    }
}
