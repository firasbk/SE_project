package hu.uni.miskolc.iit.service;
import hu.uni.miskolc.iit.model.Car;
import hu.uni.miskolc.iit.dao.CarDAO;
import hu.uni.miskolc.iit.exceptions.*;

import java.util.Collection;

public class CarServiceImpl implements CarService {

    private CarDAO cardao;

    public CarServiceImpl() {}

    public CarServiceImpl(CarDAO cardao) {
        this.cardao = cardao;
    }


    @Override
    public Car carCreation(Car car) throws CarErrorException {
        if ( car == null ){
            throw new CarErrorException();
        }
        return cardao.createCar(car);
    }

    @Override
    public Collection<Car> carList() throws ListNotFoundException {
        List<Car> listedCars;
        try {
             listedCars = (List<Car>) cardao.listCars();
        } catch (ListNotFoundException e) {
            throw new ListNotFoundException();
        }
        if ( listedCars == null ) {
            throw new ListNotFoundException();
        }
        return listedCars;
    }

    @Override
    public Car carModification(Car car) throws CarErrorException {
        if ( car == null ){
            throw new CarErrorException();
        }
        return cardao.updateCar(car);
    }

    @Override
    public boolean carDelete(Car car) throws CarErrorException {
        if ( car == null ){
            throw new CarErrorException();
        }
        return cardao.deleteCar(car);
    }
}
