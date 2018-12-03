package hu.uni.miskolc.iit.model;

import java.util.Date;

public class CarRent {

    public enum Status {
        CONFIRMED, PENDING, REJECTED
    }

    private int id;
    private int borrowerId;
    private int managerId;
    private int carId;
    private Date startDate;
    private Date endDate;
    private int price;
    private boolean returned;
    private Status status;
    private int carParkId;
    private String currency;

    public CarRent(int id, int borrowerId, int managerId, int carId, Date startDate, Date endDate, int price, boolean returned, Status status, int carParkId, String currency) {
        this.id = id;
        this.borrowerId = borrowerId;
        this.managerId = managerId;
        this.carId = carId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.returned = returned;
        this.status = status;
        this.carParkId = carParkId;
        this.currency = currency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(int borrowerId) {
        this.borrowerId = borrowerId;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getCarParkId() {
        return carParkId;
    }

    public void setCarParkId(int carParkId) {
        this.carParkId = carParkId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "CarRent{" +
                "id=" + id +
                ", borrowerId=" + borrowerId +
                ", managerId=" + managerId +
                ", carId=" + carId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", price=" + price +
                ", returned=" + returned +
                ", status=" + status +
                ", carParkId=" + carParkId +
                ", currency='" + currency + '\'' +
                '}';
    }
}
