package hu.uni.miskolc.iit;

import hu.uni.miskolc.iit.exceptions.CarErrorException;
import hu.uni.miskolc.iit.exceptions.EntryNotFoundException;
import hu.uni.miskolc.iit.model.User;

import java.util.Collection;

/**
 * Data Access Object
 * CREATE
 * READ
 * UPDATE
 * DELETE
 */
public interface UserDAO {

    void createUser(User user) throws CarErrorException;

    Collection<User> listUsers();

    void updateUser(User user) throws EntryNotFoundException;
    void deleteUser(User user) throws EntryNotFoundException;
}