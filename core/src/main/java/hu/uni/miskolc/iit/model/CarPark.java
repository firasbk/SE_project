package hu.uni.miskolc.iit.model;

public class CarPark {

    private int id;
    private String address;
    private String email;
    private String name;
    private String website;
    private int capacity;
    private int manegerId;

    public CarPark(int id, String address, String email, String name, String website, int capacity, int manegerId) {
        this.id = id;
        this.address = address;
        this.email = email;
        this.name = name;
        this.website = website;
        this.capacity = capacity;
        this.manegerId = manegerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getManegerId() {
        return manegerId;
    }

    public void setManegerId(int manegerId) {
        this.manegerId = manegerId;
    }

    @Override
    public String toString() {
        return "CarPark{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", website='" + website + '\'' +
                ", capacity=" + capacity +
                ", manegerId=" + manegerId +
                '}';
    }
}
