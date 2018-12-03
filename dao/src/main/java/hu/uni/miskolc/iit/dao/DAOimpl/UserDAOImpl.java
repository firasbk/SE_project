package hu.uni.miskolc.iit.dao.DAOimpl;

import hu.uni.miskolc.iit.dao.UserDAO;
import hu.uni.miskolc.iit.exceptions.UserErrorException;
import hu.uni.miskolc.iit.exceptions.EntryNotFoundException;
import hu.uni.miskolc.iit.exceptions.ListNotFoundException;
import hu.uni.miskolc.iit.model.User;

import java.util.Collection;

public class UserDAOImpl implements UserDAO {

    @Override
    public void createUser(User user) throws UserErrorException {

    }

    @Override
    public Collection<User> listUsers() throws ListNotFoundException  {
        return null;
    }

    @Override
    public void updateUser(User user) throws EntryNotFoundException {

    }

    @Override
    public void deleteUser(User user) throws EntryNotFoundException {

    }
}
