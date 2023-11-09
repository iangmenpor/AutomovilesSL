import java.util.ArrayList;

public class Client {
    private String name;
    private String surname;
    private String dni;
    private String address;


    public ArrayList<Purchase> purchases;

    public ArrayList<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(ArrayList<Purchase> purchases) {
        this.purchases = purchases;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
