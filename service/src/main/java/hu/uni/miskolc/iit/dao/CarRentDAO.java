package hu.uni.miskolc.iit.dao;

import hu.uni.miskolc.iit.dao.model.CarRent;
import hu.uni.miskolc.iit.dao.exceptions.CarRentErrorException;
import hu.uni.miskolc.iit.dao.exceptions.EntryNotFoundException;
import hu.uni.miskolc.iit.dao.exceptions.ListNotFoundException;

import java.util.Collection;

/**
 * Data Access Object
 * CREATE
 * READ
 * UPDATE
 * DELETE
 */
public interface CarRentDAO {

    void createCarRent(Car car) throws CarRentErrorException;

    Collection<CarRent> listCarRents() throws ListNotFoundException;

    void updateCarRent(CarRent carRent) throws EntryNotFoundException;
    void deleteCarRent(Car carRent) throws EntryNotFoundException;
}