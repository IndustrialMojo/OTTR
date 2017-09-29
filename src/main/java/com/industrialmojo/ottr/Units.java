package com.industrialmojo.ottr;

public enum Units {

    A("YD", "Yards"),
    B("M", "Meters");

    private String shortDescription;
    private String longDescription;

    Units(String shortDescription, String longDescription) {
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