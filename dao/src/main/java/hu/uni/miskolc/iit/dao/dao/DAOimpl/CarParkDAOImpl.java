package hu.uni.miskolc.iit.dao.dao.DAOimpl;

import hu.uni.miskolc.iit.dao.CarParkDAO;
import hu.uni.miskolc.iit.dao.model.CarPark;
import hu.uni.miskolc.iit.dao.exceptions.CarParkErrorException;
import hu.uni.miskolc.iit.dao.exceptions.EntryNotFoundException;
import hu.uni.miskolc.iit.dao.exceptions.ListNotFoundException;

import java.util.Collection;

public class CarParkDAOImpl implements CarParkDAO {

    @Override
    public void createCarPark(CarPark carPark) throws CarParkErrorException {

    }

    @Override
    public Collection<CarPark> listCarParks() throws ListNotFoundException {
        return null;
    }

    @Override
    public void updateCarPark(CarPark carPark) throws EntryNotFoundException {

    }

    @Override
    public void deleteCarPark(CarPark carPark) throws EntryNotFoundException {

    }
}
