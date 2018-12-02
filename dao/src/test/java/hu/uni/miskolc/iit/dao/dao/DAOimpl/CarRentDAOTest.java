package hu.uni.miskolc.iit.dao.dao.DAOimpl;

import static org.junit.Assert.assertTrue;
import hu.uni.miskolc.iit.dao.model.CarRent;
import hu.uni.miskolc.iit.dao.exceptions.EntryNotFoundException;
import hu.uni.miskolc.iit.dao.exceptions.ListNotFoundException;
import hu.uni.miskolc.iit.dao.exceptions.CarRentErrorException;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
import java.util.Date;

/**
 * Unit test for CarRentDAO.
 */
public class CarRentDAOTest
{
    private CarRentDAO carRentDAO = new CarRentDAOImpl();

    private enum Status {
        CONFIRMED, PENDING, REJECTED
    }

    @Test
    public void testCreateCarRent() throws CarRentErrorException, ListNotFoundException {
        CarRent carRent = new CarRent(1234, 1, 2, 1, new Date(), new Date(), 20000, false, Status.PENDING, 1, "HUF");
        carRentDAO.createCarRent(carRent);

        List<CarRent> carRentList = (List<CarRent>) carRentDAO.listCarRents();

        assertTrue(carRentList.get(carRentList.size() - 1).equals(carRent));
    }

    @Test
    public void testlistCarRents() throws ListNotFoundException, CarRentErrorException {
        List<CarRent> localList = new List<CarRent>();

        CarRent carRent1 = new CarRent(1234, 1, 2, 1, new Date(), new Date(), 20000, false, Status.PENDING, 1, "HUF");
        CarRent carRent2 = new CarRent(1235, 1, 2, 2, new Date(), new Date(), 25000, false, Status.PENDING, 1, "HUF");
        CarRent carRent3 = new CarRent(1236, 1, 2, 3, new Date(), new Date(), 30000, false, Status.PENDING, 1, "HUF");
        CarRent carRent4 = new CarRent(1237, 1, 2, 4, new Date(), new Date(), 35000, false, Status.PENDING, 1, "HUF");
        CarRent carRent5 = new CarRent(1238, 1, 2, 5, new Date(), new Date(), 40000, false, Status.PENDING, 1, "HUF");

        localList.add(carRent1);
        localList.add(carRent2);
        localList.add(carRent3);
        localList.add(carRent4);
        localList.add(carRent5);

        carRentDAO.createCarRent(carRent1);
        carRentDAO.createCarRent(carRent2);
        carRentDAO.createCarRent(carRent3);
        carRentDAO.createCarRent(carRent4);
        carRentDAO.createCarRent(carRent5);

        List<CarRent> carRentList = (List<CarRent>) carRentDAO.listCarRents();

        assertTrue(carRentList.equals(localList));
    }

    @Test
    public void testUpdateCarRent() throws EntryNotFoundException, CarRentErrorException, ListNotFoundException {
        CarRent carRent = new CarRent(1234, 1, 2, 1, new Date(), new Date(), 20000, false, Status.PENDING, 1, "HUF");
        carRentDAO.createCarRent(carRent);

        CarRent carRent = new CarRent(1234, 1, 2, 1, new Date(), new Date(), 30000, false, Status.CONFIRMED, 1, "HUF");
        carRentDAO.updateCarRent(updatedCarRent);

        List<CarRent> carRentList = (List<CarRent>) carRentDAO.listCarRents();

        assertTrue(carRentList.indexOf(updatedCarRent).equals(updatedCarRent));
    }

    @Test
    public void testDeleteCarRent() throws EntryNotFoundException, CarRentErrorException, ListNotFoundException {
        List<CarRent> beforeList = (List<CarRent>) carRentDAO.listCarRents();

        CarRent carRent = new CarRent(1234, 1, 2, 1, new Date(), new Date(), 20000, false, Status.PENDING, 1, "HUF");
        carRentDAO.createCarRent(carRent);

        carRentDAO.deleteCarRent(carRent);
        List<CarRent> afterList = (List<CarRent>) carRentDAO.listCarRents();

        assertTrue(beforeList.equals(afterList));
    }
}
