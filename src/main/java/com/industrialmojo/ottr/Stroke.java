package com.industrialmojo.ottr;

public enum Stroke {

    A("BK", "Backstroke"),
    B("BR", "Breaststroke"),
    C("FL", "Butterfly"),
    D("FR", "Freestyle"),
    E("IM", "Individual Medley"),
    F("MR", "Medley Relay"),
    G("RF", "Free Relay");

    private String shortDescription;
    private String longDescription;

    Stroke(String shortDescription, String longDescription) {
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}	

    public String getShortDescription() {
        return shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }
}