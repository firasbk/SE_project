package hu.uni.miskolc.iit.dao.DAOimpl;

import hu.uni.miskolc.iit.dao.CarParkDAO;
import hu.uni.miskolc.iit.model.CarPark;
import hu.uni.miskolc.iit.exceptions.CarParkErrorException;
import hu.uni.miskolc.iit.exceptions.EntryNotFoundException;
import hu.uni.miskolc.iit.exceptions.ListNotFoundException;

import java.util.Collection;

import java.util.ArrayList;

public class CarParkDAOImpl implements CarParkDAO {

    @Override
    public CarPark createCarPark(CarPark carPark) throws CarParkErrorException {
        return carPark;
    }

    @Override
    public Collection<CarPark> listCarParks() throws ListNotFoundException {
        return new ArrayList<CarPark>();
    }

    @Override
    public CarPark updateCarPark(CarPark carPark) throws EntryNotFoundException {
        return carPark;
    }

    @Override
    public boolean deleteCarPark(CarPark carPark) throws EntryNotFoundException {
        return false;
    }
}
