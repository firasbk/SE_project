package hu.uni.miskolc.iit.service;
import hu.uni.miskolc.iit.dao.DAOimpl.CarDAOImpl;
import hu.uni.miskolc.iit.model.Car;
import hu.uni.miskolc.iit.dao.CarDAO;
import hu.uni.miskolc.iit.exceptions.CarErrorException;
import hu.uni.miskolc.iit.exceptions.ListNotFoundException;
import hu.uni.miskolc.iit.exceptions.EntryNotFoundException;

import java.util.Collection;
import java.util.List;

public class CarServiceImpl implements CarService {

    private CarDAO cardao;

    public CarServiceImpl() { this.cardao = new CarDAOImpl();}

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
        if ( listedCars == null || listedCars.size() == 0 ) {
            throw new ListNotFoundException();
        }
        return (Collection<Car>) listedCars;
    }

    @Override
    public Car carModification(Car car) throws EntryNotFoundException {
        if ( car == null ){
            throw new EntryNotFoundException();
        }
        return cardao.updateCar(car);
    }

    @Override
    public boolean carDelete(Car car) throws EntryNotFoundException {
        if ( car == null ){
            throw new EntryNotFoundException();
        }
        return cardao.deleteCar(car);
    }
}
