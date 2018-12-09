package hu.uni.miskolc.iit.dao.DAOimpl;

import hu.uni.miskolc.iit.dao.UserDAO;
import hu.uni.miskolc.iit.exceptions.UserErrorException;
import hu.uni.miskolc.iit.exceptions.EntryNotFoundException;
import hu.uni.miskolc.iit.exceptions.ListNotFoundException;
import hu.uni.miskolc.iit.model.User;

import java.util.ArrayList;
import java.util.Collection;

public class UserDAOImpl implements UserDAO {

    @Override
    public User createUser(User user) throws UserErrorException {
        return user;
    }

    @Override
    public Collection<User> listUsers() throws ListNotFoundException  {
        return new ArrayList<User>();
    }

    @Override
    public User updateUser(User user) throws UserErrorException {
        return user;
    }

    @Override
    public boolean deleteUser(User user) throws UserErrorException {
        return true;
    }
}
