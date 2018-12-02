package hu.uni.miskolc.iit.service;
import hu.uni.miskolc.iit.dao.CarService;
import hu.uni.miskolc.iit.dao.UserService;
import hu.uni.miskolc.iit.dao.exceptions.CarErrorException;
import hu.uni.miskolc.iit.dao.exceptions.ListNotFoundException;
import hu.uni.miskolc.iit.dao.exceptions.UserErrorException;
import hu.uni.miskolc.iit.dao.model.Car;

import java.util.Collection;


public class UserServiceImpl implements UserService {

    @Override
    public void userRegistration(String lastName, String firstName, String email, String password) throws UserErrorException {

    }

    @Override
    public boolean logger(String user, String password) throws UserErrorException {
        return false;
    }

    @Override
    public void userModification(String lastName, String firstName, String email, String password) throws UserErrorException {

    }

    @Override
    public void userDelete(String user) throws UserErrorException {

    }
}
