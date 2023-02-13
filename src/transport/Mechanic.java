package transport;
public class Mechanic {

    private String nameOfMechanic;
    private String lastNameOfMechanic;
    private String company;

    public Mechanic(String nameOfMechanic, String lastNameOfMechanic, String company) {
        this.nameOfMechanic = nameOfMechanic;
        this.lastNameOfMechanic = lastNameOfMechanic;
        this.company = company;
    }

    @Override
    public String toString() {
        return nameOfMechanic + " " +  lastNameOfMechanic +
                ", компания: " + company ;
    }

    public String getNameOfMechanic() {
        return nameOfMechanic;
    }

    public void setNameOfMechanic(String nameOfMechanic) {
        this.nameOfMechanic = nameOfMechanic;
    }

    public String getLastNameOfMechanic() {
        return lastNameOfMechanic;
    }

    public void setLastNameOfMechanic(String lastNameOfMechanic) {
        this.lastNameOfMechanic = lastNameOfMechanic;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public <T extends Transport> void carryOutMaintenance(T t) {
        System.out.println(t.getBrand() + " " + t.getModel() + " обслуживается у механика " + this);
    }

    public <T extends Transport> void repairTheCar(T t){
        System.out.println("Механик " + this + " ремонтирует " + t.getBrand() + " " + t.getModel());
    }
}
