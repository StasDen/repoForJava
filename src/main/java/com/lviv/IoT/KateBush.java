package com.lviv.IoT;

public class KateBush extends BrokerManager {

    // Necessary variable for csv table
    private static String professionalRewards = "Best broker manager in 2021";

    public final String getProfessionalRewards() {

        return professionalRewards;
    }

    @Override
    public final String getHeaders() {

        return super.getHeaders() + ", " + "Professional rewards";
    }

    @Override
    public final String toCSV() {

        return super.toCSV() + ", " + getProfessionalRewards();
    }

}
