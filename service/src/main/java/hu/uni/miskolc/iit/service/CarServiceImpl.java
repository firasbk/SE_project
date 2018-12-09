package hu.uni.miskolc.iit.service;
import hu.uni.miskolc.iit.model.Car;
import hu.uni.miskolc.iit.dao.CarDAO;
import hu.uni.miskolc.iit.exceptions.*;

import java.util.Collection;

public class CarServiceImpl implements CarService {

    private CarDAO cardao;

    public CarServiceImpl() { this.cardao = new CarDAO(); }
    
    public CarServiceImpl(CarDAO cardao) {
        this.cardao = cardao;
    }


    @Override
    public Car carCreation(Car car) throws CarErrorException {
        try {
            return cardao.createCar(car);
        } catch (CarErrorException e) {
            throw new CarErrorException();
        }
    }

    @Override
    public Collection<Car> carList() throws ListNotFoundException {
        try {
            return cardao.listCars();
        } catch (ListNotFoundException e) {
            throw new ListNotFoundException();
        }
    }

    @Override
    public Car carModification(Car car) throws CarErrorException {
        try {
            return cardao.updateCar(car);
        } catch (EntryNotFoundException e) {
            throw new CarErrorException();
        }
    }

    @Override
    public boolean carDelete(Car car) throws CarErrorException {
        try {
            return cardao.deleteCar(car);
        } catch (EntryNotFoundException e) {
            throw new CarErrorException();
        }
    }
}
