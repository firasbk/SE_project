package hu.uni.miskolc.iit.dao.dao.DAOimpl;
import hu.uni.miskolc.iit.dao.exceptions.CarErrorException;
import hu.uni.miskolc.iit.dao.model.Car;
import hu.uni.miskolc.iit.dao.CarDAO;
import hu.uni.miskolc.iit.dao.exceptions.EntryNotFoundException;

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
