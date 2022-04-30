package com.lviv.IoT;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Our chain of constructors is used
        InsuranceBroker jamesGrey = new InsuranceBroker();
        jamesGrey.printInfoAboutInsuranceBroker(jamesGrey);

        // Using collections
        // Write it only in the methods
        Map<String, List<AllOfInsurances>> typeToNameOfInsurance = new HashMap<>();

        // Creating lists
        // Without 'healthList'(there aren't any different insurances in type 'health')
        List<AllOfInsurances> vehicleList = new ArrayList<>();

        // Adding some elements
        vehicleList.add(new AllOfInsurances("property coverage"));
        vehicleList.add(new AllOfInsurances("liability coverage"));
        vehicleList.add(new AllOfInsurances("medical coverage"));

        List<AllOfInsurances> casualtyList = new ArrayList<>();
        casualtyList.add(new AllOfInsurances("crime insurance"));
        casualtyList.add(new AllOfInsurances("terrorism coverage"));
        casualtyList.add(new AllOfInsurances("kidnap and ransom coverage"));
        casualtyList.add(new AllOfInsurances("political risk coverage"));

        // Putting them in our map
        typeToNameOfInsurance.put("vehicle", vehicleList);
        typeToNameOfInsurance.put("casualty", casualtyList);

        // Checking our map
        System.out.println("Our map: " + typeToNameOfInsurance);

        BrokerManager brokerManager = new BrokerManager();
        brokerManager.printSomeInfoAboutInsurances();

        InsuranceManager insuranceManager = new InsuranceManager();
        insuranceManager.printTypesOfInsurancesOnSaleInSummer(insuranceManager.findTypesOfInsurancesOnSaleInSummer());

        insuranceManager.sortTypesOfInsurancesInAscendingOrderAndShowIt(InsuranceManager.advancedTypesOfInsurances
                .values());
        insuranceManager.sortTypesOfInsurancesInDescendingOrderAndShowIt(InsuranceManager.advancedTypesOfInsurances
                .values());

        insuranceManager.sortInsurancesInAscendingOrderAndShowIt(casualtyList);
        insuranceManager.sortInsurancesInDescendingOrderAndShowIt(casualtyList);
    }

}
