package hu.uni.miskolc.iit.dao;

import java.util.Collection;

import hu.uni.miskolc.iit.dao.exceptions.CarErrorException;
import hu.uni.miskolc.iit.dao.exceptions.EntryNotFoundException;
import hu.uni.miskolc.iit.dao.exceptions.ListNotFoundException;
import hu.uni.miskolc.iit.dao.model.Car;

/**
 * Data Access Object
 * CREATE
 * READ
 * UPDATE
 * DELETE
 */
public interface CarDAO {

    void createCar(Car car) throws CarErrorException;

    Collection<Car> listCars() throws ListNotFoundException;

    void updateCar(Car car) throws EntryNotFoundException;
    void deleteCar(Car car) throws EntryNotFoundException;
}