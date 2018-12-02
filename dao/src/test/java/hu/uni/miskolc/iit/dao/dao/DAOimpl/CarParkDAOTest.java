package hu.uni.miskolc.iit.dao.dao.DAOimpl;

import static org.junit.Assert.assertTrue;
import hu.uni.miskolc.iit.dao.model.CarPark;
import hu.uni.miskolc.iit.dao.exceptions.EntryNotFoundException;
import hu.uni.miskolc.iit.dao.exceptions.ListNotFoundException;
import hu.uni.miskolc.iit.dao.exceptions.CarParkErrorException;
import java.util.Collection;
import java.util.List;
import org.junit.Test;

/**
 * Unit test for CarParkDAO.
 */
public class CarParkDAOTest
{
    private CarParkDAO carParkDAO = new CarParkDAOImpl();

    @Test
    public void testCreateCarPark() throws CarParkErrorException, ListNotFoundException {
        CarPark carPark = new CarPark(1234, "0000 City, Some Street 1.", "bestcarpark@mail.com", "We are number one", "www.bestcarpark.html", 100, 2);
        carParkDAO.createCarPark(carPark);

        List<CarPark> carParkList = (List<CarPark>) carParkDAO.listCarParks();

        assertTrue(carParkList.get(carParkList.size() - 1).equals(carPark));
    }

    @Test
    public void testlistCarParks() throws ListNotFoundException, CarParkErrorException {
        List<CarPark> localList = new List<CarPark>();

        CarPark carPark1 = new CarPark(1234, "0000 City, Some Street 1.", "bestcarpark@mail.com", "We are number one", "www.bestcarpark.html", 100, 2);
        CarPark carPark2 = new CarPark(1235, "0000 City, Some Street 2.", "bestcarpark@mail.com", "We are number one", "www.bestcarpark.html", 100, 2);
        CarPark carPark3 = new CarPark(1236, "0000 City, Some Street 3.", "bestcarpark@mail.com", "We are number one", "www.bestcarpark.html", 100, 2);
        CarPark carPark4 = new CarPark(1237, "0000 City, Some Street 4.", "bestcarpark@mail.com", "We are number one", "www.bestcarpark.html", 100, 2);
        CarPark carPark5 = new CarPark(1238, "0000 City, Some Street 5.", "bestcarpark@mail.com", "We are number one", "www.bestcarpark.html", 100, 2);

        localList.add(carPark1);
        localList.add(carPark2);
        localList.add(carPark3);
        localList.add(carPark4);
        localList.add(carPark5);

        carParkDAO.createCarPark(carPark1);
        carParkDAO.createCarPark(carPark2);
        carParkDAO.createCarPark(carPark3);
        carParkDAO.createCarPark(carPark4);
        carParkDAO.createCarPark(carPark5);

        List<CarPark> carParkList = (List<CarPark>) carParkDAO.listCarParks();

        assertTrue(carParkList.equals(localList));
    }

    @Test
    public void testUpdateCarPark() throws EntryNotFoundException, CarParkErrorException, ListNotFoundException {
        CarPark carPark = new CarPark(1234, "0000 City, Some Street 1.", "bestcarpark@mail.com", "We are number one", "www.bestcarpark.html", 100, 2);
        carParkDAO.createCarPark(carPark);

        CarPark updatedCarPark = new CarPark(1234, "0000 City, Some Street 2.", "bestcarpark@mail.com", "We are number one", "www.bestcarpark.html", 200, 2);
        carParkDAO.updateCarPark(updatedCarPark);

        List<CarPark> carParkList = (List<CarPark>) carParkDAO.listCarParks();

        assertTrue(carParkList.indexOf(updatedCarPark).equals(updatedCarPark));
    }

    @Test
    public void testDeleteCarPark() throws EntryNotFoundException, CarParkErrorException, ListNotFoundException {
        List<CarPark> beforeList = (List<CarPark>) carParkDAO.listCarParks();

        CarPark carPark = new CarPark(1234, "0000 City, Some Street 1.", "bestcarpark@mail.com", "We are number one", "www.bestcarpark.html", 100, 2);
        carParkDAO.createCarPark(carPark);

        carParkDAO.deleteCarPark(carPark);
        List<CarPark> afterList = (List<CarPark>) carParkDAO.listCarParks();

        assertTrue(beforeList.equals(afterList));
    }
}
