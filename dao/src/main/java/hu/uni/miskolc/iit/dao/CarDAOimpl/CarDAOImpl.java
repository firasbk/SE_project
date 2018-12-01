package hu.uni.miskolc.iit.dao.CarDAOimpl;
import hu.uni.miskolc.iit.exceptions.CarErrorException;
import hu.uni.miskolc.iit.model.Car;
import hu.uni.miskolc.iit.CarDAO;
import hu.uni.miskolc.iit.exceptions.UserErrorException;
import hu.uni.miskolc.iit.exceptions.EntryNotFoundException;

import java.util.Collection;

public class CarDAOImpl implements CarDAO {
    @Override
    public void createCar(Car car) throws CarErrorException {

    }

    @Override
    public Collection<Car> listCars() {
        return null;
    }

    @Override
    public void updateCar(Car car) throws EntryNotFoundException {

    }

    @Override
    public void deleteCar(Car car) throws EntryNotFoundException {

    }
}
