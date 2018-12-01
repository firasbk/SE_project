package hu.uni.miskolc.iit;

import java.util.Collection;

import hu.uni.miskolc.iit.model.Car;
import hu.uni.miskolc.iit.exceptions.CarErrorException;
import hu.uni.miskolc.iit.exceptions.EntryNotFoundException;

/**
 * Data Access Object
 * CREATE
 * READ
 * UPDATE
 * DELETE
 */
public interface CarDAO {

    void createCar(Car car) throws CarErrorException;

    Collection<Car> listCars();

    void updateCar(Car car) throws EntryNotFoundException;
    void deleteCar(Car car) throws EntryNotFoundException;
}