package hu.uni.miskolc.iit.dao;

import java.util.Collection;

import hu.uni.miskolc.iit.exceptions.CarErrorException;
import hu.uni.miskolc.iit.exceptions.EntryNotFoundException;
import hu.uni.miskolc.iit.exceptions.ListNotFoundException;
import hu.uni.miskolc.iit.model.Car;

/**
 * Data Access Object
 * CREATE
 * READ
 * UPDATE
 * DELETE
 */
public interface CarDAO {

    Car createCar(Car car) throws CarErrorException;

    Collection<Car> listCars() throws ListNotFoundException;

    Car updateCar(Car car) throws EntryNotFoundException;
    boolean deleteCar(Car car) throws EntryNotFoundException;
}