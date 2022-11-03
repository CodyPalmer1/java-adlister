package models;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Pet implements Serializable {

    private long id;
    private String breed;
    private String name;
    private Date birthDate;
    private List<String> vaccinations;
    private Employee veterinarian;

    private Pet(){}

    public Pet(long id, String breed, String name, Date birthDate, List<String> vaccinations, Employee veterinarian){
        this.id = id;
        this.breed = breed;
        this.name = name;
        this.birthDate = birthDate;
        this.vaccinations = vaccinations;
        this.veterinarian = veterinarian;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(List<String> vaccinations) {
        this.vaccinations = vaccinations;
    }

    public Employee getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(Employee veterinarian) {
        this.veterinarian = veterinarian;
    }

}

