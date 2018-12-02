package hu.uni.miskolc.iit.service;
import hu.uni.miskolc.iit.dao.CarService;
import hu.uni.miskolc.iit.dao.exceptions.CarErrorException;
import hu.uni.miskolc.iit.dao.exceptions.ListNotFoundException;
import hu.uni.miskolc.iit.dao.model.Car;
import hu.uni.miskolc.iit.dao.CarDAO;

import java.util.Collection;

public class CarServiceImpl implements CarService {

    private CarDAO cardao;

    public CarServiceImpl(CarDAO cardao) {
        this.cardao = cardao;
    }

    @Override
    public void carCreation(Car car) throws CarErrorException {
        try {
            cardao.createCar(car);
        } catch (CarErrorException e) {
            throw new CarErrorException;
        }
    }

    @Override
    public Collection<Car> carList() throws ListNotFoundException {
        try {
            return cardao.listCars();
        } catch (ListNotFoundException e) {
            throw new ListNotFoundException(e);
        }
    }

    @Override
    public void carModification(Car car) throws EntryNotFoundException {
        try {
            return cardao.updateCar(car);
        } catch (EntryNotFoundException e) {
            throw new EntryNotFoundException(e);
        }
    }

    @Override
    public void carDelete(int carId) throws EntryNotFoundException {
        try {
            return cardao.deleteCar(car);
        } catch (EntryNotFoundException e) {
            throw new EntryNotFoundException(e);
        }
    }
}
