package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VetTest {
    public static void main(String[] args) {
        Employee drDoolittle = new Employee(1, "John", "Doolittle", 'M');

        List<String> socVacs = new ArrayList();
        socVacs.add("rabies");
        socVacs.add("parvo");
        socVacs.add("bordatella");

        Pet soc = new Pet(1, "Shitzhu", "Soc", new Date(), socVacs, drDoolittle);

        List<Pet> dolittlesPatients = new ArrayList<>();
        dolittlesPatients.add(soc);

        drDoolittle.setPatients(dolittlesPatients);

        System.out.println(drDoolittle.getPatients());

        System.out.println("Soc's Vaccines Include: ");
        for(String vaccine : soc.getVaccinations()){
            System.out.println(vaccine);
        }

        System.out.println("Dr.Dolittles Patients Vaccinations: ");
        for(Pet pet : drDoolittle.getPatients()) {
            System.out.println(pet.getName());
            for(String vaccine : pet.getVaccinations()) {
                System.out.println(vaccine);
            }
        }
    }
}
