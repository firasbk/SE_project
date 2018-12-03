package hu.uni.miskolc.iit.dao;

import hu.uni.miskolc.iit.model.CarRent;
import hu.uni.miskolc.iit.exceptions.CarRentErrorException;
import hu.uni.miskolc.iit.exceptions.EntryNotFoundException;
import hu.uni.miskolc.iit.exceptions.ListNotFoundException;

import java.util.Collection;

/**
 * Data Access Object
 * CREATE
 * READ
 * UPDATE
 * DELETE
 */
public interface CarRentDAO {

    CarRent createCarRent(CarRent carRent) throws CarRentErrorException;

    Collection<CarRent> listCarRents() throws ListNotFoundException;

    CarRent updateCarRent(CarRent carRent) throws EntryNotFoundException;
    boolean deleteCarRent(CarRent carRent) throws EntryNotFoundException;
}