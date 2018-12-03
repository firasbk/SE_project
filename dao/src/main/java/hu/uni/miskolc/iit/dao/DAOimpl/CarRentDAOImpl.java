package hu.uni.miskolc.iit.dao.DAOimpl;

import hu.uni.miskolc.iit.dao.CarRentDAO;
import hu.uni.miskolc.iit.model.CarRent;
import hu.uni.miskolc.iit.exceptions.CarRentErrorException;
import hu.uni.miskolc.iit.exceptions.EntryNotFoundException;
import hu.uni.miskolc.iit.exceptions.ListNotFoundException;

import java.util.Collection;

import java.util.ArrayList;

public class CarRentDAOImpl implements CarRentDAO {

    @Override
    public CarRent createCarRent(CarRent carRent) throws CarRentErrorException {
        return carRent;
    }

    @Override
    public Collection<CarRent> listCarRents() throws ListNotFoundException {
        return new ArrayList<CarRent>();
    }

    @Override
    public CarRent updateCarRent(CarRent carRent) throws EntryNotFoundException {
        return carRent;
    }

    @Override
    public boolean deleteCarRent(CarRent carRent) throws EntryNotFoundException {
        return false;
    }
}
