package hu.uni.miskolc.iit.service;
import hu.uni.miskolc.iit.dao.CarService;
import hu.uni.miskolc.iit.dao.exceptions.CarErrorException;
import hu.uni.miskolc.iit.dao.exceptions.ListNotFoundException;
import hu.uni.miskolc.iit.dao.model.Car;

import java.util.Collection;


public class CarServiceImpl implements CarService {

    @Override
    public boolean carCreation(String courseName, String description, int teacherID) throws CarErrorException {
        return false;
    }

    @Override
    public Collection<Car> carList() throws ListNotFoundException {
        return null;
    }

    @Override
    public boolean carModification(String courseName, String description, int teacherID) throws CarErrorException {
        return false;
    }

    @Override
    public boolean carDelete(int carId) throws CarErrorException {
        return false;
    }
}
