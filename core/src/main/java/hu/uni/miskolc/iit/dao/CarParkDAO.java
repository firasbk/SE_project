package hu.uni.miskolc.iit.dao;

import hu.uni.miskolc.iit.exceptions.CarParkErrorException;
import hu.uni.miskolc.iit.model.CarPark;
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
public interface CarParkDAO {

    CarPark createCarPark(CarPark carPark) throws CarParkErrorException;

    Collection<CarPark> listCarParks() throws ListNotFoundException;

    CarPark updateCarPark(CarPark carPark) throws EntryNotFoundException;
    boolean deleteCarPark(CarPark carPark) throws EntryNotFoundException;
}