package org.example;

public class EquatorialCoordinate {
    final long longitude;
    final long azimuth;


    public long getLongitude() {
        return longitude;
    }

    public long getAzimuth() {
        return azimuth;
    }

    public EquatorialCoordinate(long longitude, long azimuth) {
        this.longitude = longitude;
        this.azimuth = azimuth;
    }
}
