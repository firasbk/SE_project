package hu.uni.miskolc.iit.service;

import hu.uni.miskolc.iit.exceptions.CarErrorException;
import hu.uni.miskolc.iit.exceptions.ListNotFoundException;
import hu.uni.miskolc.iit.model.Car;

import java.util.Collection;

public interface CarService {
    /**
     *
     * @param car
     * @return
     */

    public Car carCreation(Car car) throws CarErrorException;

    /**
     *
     * @return
     */
    public Collection<Car> carList() throws ListNotFoundException;

    /**
     *
     * @param car
     * @return
     */
    public Car carModification(Car car) throws EntryNotFoundException;

    /**
     * @param car
     * @return
     */
    public boolean carDelete(Car car) throws EntryNotFoundException;

}
