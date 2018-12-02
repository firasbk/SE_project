package hu.uni.miskolc.iit.dao.model;

public class Car {

    private int id;
    private String model;
    private String color;
    private String brand;
    private String plateNumber;
    private int productYear;
    private int carParkId;

    public Car(int id, String model, String color, String brand, String plateNumber, int productYear, int carParkId){
        this.id = id;
        this.model = model;
        this.color = color;
        this.brand = brand;
        this.plateNumber = plateNumber;
        this.productYear = productYear;
        this.carParkId = carParkId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getProductYear() {
        return productYear;
    }

    public void setProductYear(int productYear) {
        this.productYear = productYear;
    }

    public int getCarParkId() {
        return carParkId;
    }

    public void setCarParkId(int carParkId) {
        this.carParkId = carParkId;
    }

}
