package com.marvinslib;
import java.util.UUID;

public class Geraet {
    private UUID SpielplatzID;
    private String Bezeichnung;
    private GeraeteStatus GeraeteStatus;
    private String Beschreibung;

    public GeraeteStatus GetGeraeteStatus() {
        return GeraeteStatus;
    }

    public void SetGeraeteStatus(GeraeteStatus geraeteStatus) {
        GeraeteStatus = geraeteStatus;
    }

    public UUID GetSpielplatzID() {
        return SpielplatzID;
    }

    public void SetSpielplatzID(UUID spielplatzID) {
        SpielplatzID = spielplatzID;
    }

    public String GetBezeichnung() {
        return Bezeichnung;
    }

    public void SetBezeichnung(String bezeichnung) {
        Bezeichnung = bezeichnung;
    }

    public String GetBeschreibung() {
        return Beschreibung;
    }

    public void SetBeschreibung(String beschreibung) {
        Beschreibung = beschreibung;
    }
}
