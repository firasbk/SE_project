package hu.uni.miskolc.iit.dao.DAOimpl;

import hu.uni.miskolc.iit.UserDAO;
import hu.uni.miskolc.iit.exceptions.CarErrorException;
import hu.uni.miskolc.iit.exceptions.EntryNotFoundException;
import hu.uni.miskolc.iit.model.User;

import java.util.Collection;

public class UserDAOImpl implements UserDAO {
    @Override
    public void createUser(User user) throws CarErrorException {

    }

    @Override
    public Collection<User> listUsers() {
        return null;
    }

    @Override
    public void updateUser(User user) throws EntryNotFoundException {

    }

    @Override
    public void deleteUser(User user) throws EntryNotFoundException {

    }
}
