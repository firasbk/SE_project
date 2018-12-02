package hu.uni.miskolc.iit.dao;

import hu.uni.miskolc.iit.dao.exceptions.CarParkErrorException;
import hu.uni.miskolc.iit.dao.model.CarPark;
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
public interface CarParkDAO {

    void createCarPark(CarPark carPark) throws CarParkErrorException;

    Collection<CarPark> listCarParks() throws ListNotFoundException;

    void updateCarPark(CarPark carPark) throws EntryNotFoundException;
    void deleteCarPark(CarPark carPark) throws EntryNotFoundException;
}