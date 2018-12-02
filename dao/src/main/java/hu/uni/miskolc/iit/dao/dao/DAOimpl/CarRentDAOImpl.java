package hu.uni.miskolc.iit.dao.dao.DAOimpl;

import hu.uni.miskolc.iit.dao.CarRentDAO;
import hu.uni.miskolc.iit.dao.model.CarRent;
import hu.uni.miskolc.iit.dao.exceptions.CarRentErrorException;
import hu.uni.miskolc.iit.dao.exceptions.EntryNotFoundException;
import hu.uni.miskolc.iit.dao.exceptions.ListNotFoundException;

import java.util.Collection;

public class CarRentDAOImpl implements CarRentDAO {

    @Override
    public void createCarRent(CarRent carRent) throws CarRentErrorException {

    }

    @Override
    public Collection<CarRent> listCarRents() throws ListNotFoundException {
        return null;
    }

    @Override
    public void updateCarRent(CarRent carRent) throws EntryNotFoundException {

    }

    @Override
    public void deleteCarRent(CarRent carRent) throws EntryNotFoundException {

    }
}
