package hu.uni.miskolc.iit.dao;

import hu.uni.miskolc.iit.dao.model.Car;
import hu.uni.miskolc.iit.dao.exceptions.CarErrorException;
import hu.uni.miskolc.iit.dao.exceptions.EntryNotFoundException;

import java.util.Collection;

/**
 * Data Access Object
 * CREATE
 * READ
 * UPDATE
 * DELETE
 */
public interface CarRentDAO {

    void createCar(Car car) throws CarErrorException;

    Collection<Car> listCars();

    void updateCar(Car car) throws EntryNotFoundException;
    void deleteCar(Car car) throws EntryNotFoundException;
}