package hu.uni.miskolc.iit.dao;

import hu.uni.miskolc.iit.dao.exceptions.CarErrorException;
import hu.uni.miskolc.iit.dao.exceptions.ListNotFoundException;
import hu.uni.miskolc.iit.dao.model.Car;

import java.util.Collection;

public interface CarService {
    /**
     *
     * @param courseName
     * @param description
     * @param teacherID
     * @return
     */

    public boolean carCreation(String courseName, String description, int teacherID) throws CarErrorException;

    /**
     *
     * @return
     */
    public Collection<Car> carList() throws ListNotFoundException;

    /**
     *
     * @param courseName
     * @param description
     * @param teacherID
     * @return
     */
    public boolean carModification(String courseName, String description, int teacherID) throws CarErrorException;

    /**
     * @param carId
     * @return
     */
    public boolean carDelete(int carId) throws CarErrorException;

}
