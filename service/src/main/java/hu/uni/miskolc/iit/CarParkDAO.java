package hu.uni.miskolc.iit;

import hu.uni.miskolc.iit.exceptions.CarErrorException;
import hu.uni.miskolc.iit.exceptions.EntryNotFoundException;
import hu.uni.miskolc.iit.model.Car;

import java.util.Collection;

/**
 * Data Access Object
 * CREATE
 * READ
 * UPDATE
 * DELETE
 */
public interface CarParkDAO {

    void createCar(Car car) throws CarErrorException;

    Collection<Car> listCars();

    void updateCar(Car car) throws EntryNotFoundException;
    void deleteCar(Car car) throws EntryNotFoundException;
}