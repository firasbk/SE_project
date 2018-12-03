package hu.uni.miskolc.iit.dao.DAOimpl;
import hu.uni.miskolc.iit.exceptions.CarErrorException;
import hu.uni.miskolc.iit.model.Car;
import hu.uni.miskolc.iit.dao.CarDAO;
import hu.uni.miskolc.iit.exceptions.EntryNotFoundException;
import hu.uni.miskolc.iit.exceptions.ListNotFoundException;

import java.util.ArrayList;
import java.util.Collection;

public class CarDAOImpl implements CarDAO {

    @Override
    public Car createCar(Car car) throws CarErrorException {
        return car;
    }

    @Override
    public Collection<Car> listCars() throws ListNotFoundException {
        return new ArrayList<Car>();
    }

    @Override
    public Car updateCar(Car car) throws EntryNotFoundException {
        return car;
    }

    @Override
    public boolean deleteCar(Car car) throws EntryNotFoundException {
        // delete tha car record from db
        return true;
    }
}
