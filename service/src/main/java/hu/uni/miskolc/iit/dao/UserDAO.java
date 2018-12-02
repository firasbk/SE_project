package hu.uni.miskolc.iit.dao;

import hu.uni.miskolc.iit.dao.model.User;
import hu.uni.miskolc.iit.dao.exceptions.UserErrorException;
import hu.uni.miskolc.iit.dao.exceptions.EntryNotFoundException;
import hu.uni.miskolc.iit.dao.exceptions.ListNotFoundException;

import java.util.Collection;

/**
 * Data Access Object
 * CREATE
 * READ
 * UPDATE
 * DELETE
 */
public interface UserDAO {

    void createUser(User user) throws UserErrorException;

    Collection<User> listUsers() throws ListNotFoundException;

    void updateUser(User user) throws EntryNotFoundException;
    void deleteUser(User user) throws EntryNotFoundException;
}