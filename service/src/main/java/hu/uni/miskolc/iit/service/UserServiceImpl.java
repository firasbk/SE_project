package hu.uni.miskolc.iit.service;
import hu.uni.miskolc.iit.dao.CarService;
import hu.uni.miskolc.iit.dao.UserService;
import hu.uni.miskolc.iit.dao.exceptions.ListNotFoundException;
import hu.uni.miskolc.iit.dao.exceptions.UserErrorException;
import hu.uni.miskolc.iit.dao.model.Car;
import hu.uni.miskolc.iit.dao.UserDAO;

import java.util.Collection;


public class UserServiceImpl implements UserService {

    private UserDAO userdao;

    public UserServiceImpl(UserDAO userdao) {
        this.userdao = userdao;
    }

    @Override
    public void userRegistration(User user) throws UserErrorException {
        try {
            userdao.createUser(user);
        } catch (UserErrorException e) {
            throw new UserErrorException;
        }
    }

    @Override
    public boolean logger(User user) throws ListNotFoundException {
        //try {
        //   userdao.listUsers()
        //}
        return false;
    }

    @Override
    public void userModification(User user) throws EntryNotFoundException {
        try {
            userdao.updateUser(user);
        } catch (EntryNotFoundException e) {
            throw new EntryNotFoundException;
        }
    }

    @Override
    public void userDelete(User user) throws EntryNotFoundException {
        try {
            userdao.deleteUser(user);
        } catch (EntryNotFoundException e) {
            throw new EntryNotFoundException;
        }
    }
}