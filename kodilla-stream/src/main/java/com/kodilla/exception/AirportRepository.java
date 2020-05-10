package com.kodilla.exception;

import java.util.HashMap;
import java.util.Map;

public class AirportRepository {
    private Map<String,Boolean> getListofAirports(){
        Map<String,Boolean> airports = new HashMap<>();
        airports.put("Miami",true);
        airports.put("Malta",true);
        airports.put("LasPalmas",false);
        airports.put("Warsaw",true);
        return airports;
    }
    public boolean isAirportInUse(String airport) throws AirportNotFoundException {
        if (getListofAirports().containsKey(airport))
            return getListofAirports().get(airport);
        throw new AirportNotFoundException();
    }
}
