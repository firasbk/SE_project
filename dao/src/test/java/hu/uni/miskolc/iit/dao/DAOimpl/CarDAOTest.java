package hu.uni.miskolc.iit.dao.DAOimpl;

import static org.junit.Assert.assertTrue;
import hu.uni.miskolc.iit.model.Car;
import hu.uni.miskolc.iit.exceptions.EntryNotFoundException;
import hu.uni.miskolc.iit.exceptions.ListNotFoundException;
import hu.uni.miskolc.iit.exceptions.CarErrorException;

import java.util.List;

import org.junit.Test;

/**
 * Unit test for CarDAO.
 */
public class CarDAOTest
{
    private CarDAO carDAO = new CarDAOImpl();

    @Test
    public void testCreateCar() throws CarErrorException, ListNotFoundException {
        Car car = new Car(1234, "A8", "Silver", "Audi", "ABC-123", 2017, 2);
        carDAO.createCar(car);

        List<Car> carList = (List<Car>) carDAO.listCars();

        assertTrue(carList.get(carList.size() - 1).equals(car));
    }

    @Test
    public void testlistCars() throws ListNotFoundException, CarErrorException {
        List<Car> localList = new List<Car>();

        Car car1 = new Car(1234, "A8", "Silver", "Audi", "ABC-123", 2017, 2);
        Car car2 = new Car(1235, "A8", "Black", "Audi", "ABC-124", 2017, 1);
        Car car3 = new Car(1236, "A8", "White", "Audi", "ABC-125", 2017, 2);
        Car car4 = new Car(1237, "A8", "Red", "Audi", "ABC-126", 2017, 1);
        Car car5 = new Car(1238, "A8", "Blue", "Audi", "ABC-127", 2017, 2);

        localList.add(car1);
        localList.add(car2);
        localList.add(car3);
        localList.add(car4);
        localList.add(car5);

        carDAO.createCar(car1);
        carDAO.createCar(car2);
        carDAO.createCar(car3);
        carDAO.createCar(car4);
        carDAO.createCar(car5);

        List<Car> carList = (List<Car>) carDAO.listCars();

        assertTrue(carList.equals(localList));
    }

    @Test
    public void testUpdateCar() throws EntryNotFoundException, CarErrorException, ListNotFoundException {
        Car car = new Car(1234, "A8", "Silver", "Audi", "ABC-123", 2017, 2);
        carDAO.createCar(car);

        Car updatedCar = new Car(1234, "A8", "Black", "Audi", "ABC-123", 2017, 2);
        carDAO.updateCar(updatedCar);

        List<Car> carList = (List<Car>) carDAO.listCars();

        assertTrue(carList.indexOf(updatedCar).equals(updatedCar));
    }

    @Test
    public void testDeleteCar() throws EntryNotFoundException, CarErrorException, ListNotFoundException {
        List<Car> beforeList = (List<Car>) carDAO.listCars();

        Car car = new Car(1234, "A8", "Silver", "Audi", "ABC-123", 2017, 2);
        carDAO.createCar(car);

        carDAO.deleteCar(car);
        List<Car> afterList = (List<Car>) carDAO.listCars();

        assertTrue(beforeList.equals(afterList));
    }
}
