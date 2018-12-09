package hu.uni.miskolc.iit.service;

import hu.uni.miskolc.iit.model.Car;
import hu.uni.miskolc.iit.exceptions.CarErrorException;
import hu.uni.miskolc.iit.exceptions.ListNotFoundException;
import org.junit.*;
import org.junit.rules.ExpectedException;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class CarServiceImplTest {

    @Rule
    public ExpectedException expectException = ExpectedException.none();

    CarServiceImpl carService = new CarServiceImpl();

    @Test
    public void testValidCarCreation() throws CarErrorException {
        Car testCar = new Car(1234, "A8", "Silver", "Audi", "ABC-123", 2017, 2);
        Car createdCar = carService.carCreation(testCar);
        Assert.assertEquals(createdCar.getPlateNumber(), testCar.getPlateNumber());
    }

    @Test
    public void testValidCarList() throws ListNotFoundException {
        List<Car> localList = new ArrayList<Car>();
        Car testCar1 = new Car(1234, "A8", "Silver", "Audi", "ABC-123", 2017, 2);
        Car testCar2 = new Car(1235, "A8", "Black", "Audi", "ABC-124", 2017, 1);
        localList.add(testCar1);
        localList.add(testCar2);
        carService.carCreation(testCar1);
        carService.carCreation(testCar2);
        List<Car> listedCars = (List<Car>) carService.carList();
        Assert.assertEquals(localList, listedCars);
    }

    @Test
    public void testValidCarModification() throws CarErrorException {
        Car testCar = new Car(1234, "A8", "Silver", "Audi", "ABC-123", 2017, 2);
        Car modifiedCar = new Car(1234, "A8", "Black", "Audi", "ABC-123", 2017, 2);
        carService.carModification(testCar);
        Assert.assertEquals(testCar.getColor(), modifiedCar.getColor());
    }

    @Test
    public void testValidCarDelete() throws CarErrorException {
        Car deletedCar = new Car(1234, "A8", "Silver", "Audi", "ABC-123", 2017, 2);
        Assert.assertTrue(carService.carDelete(deletedCar));
    }

    @Test
    public void testInvalidCarCreation() throws CarErrorException {
        expectException.expect(CarErrorException.class);
        carService.carCreation(null);
    }

    @Test
    public void testInvalidCarList() throws ListNotFoundException {
        expectException.expect(ListNotFoundException.class);
        carService.carList();
    }

    @Test
    public void testInvalidCarModification() throws CarErrorException {
        expectException.expect(CarErrorException.class);
        carService.carModification(null);
    }

    @Test
    public void testInvalidCarDelete() throws CarErrorException {
        expectException.expect(CarErrorException.class);
        carService.carDelete(null);
    }
}