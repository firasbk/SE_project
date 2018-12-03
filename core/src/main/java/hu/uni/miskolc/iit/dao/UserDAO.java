package hu.uni.miskolc.iit.dao;

import hu.uni.miskolc.iit.model.User;
import hu.uni.miskolc.iit.exceptions.UserErrorException;
import hu.uni.miskolc.iit.exceptions.EntryNotFoundException;
import hu.uni.miskolc.iit.exceptions.ListNotFoundException;

import java.util.Collection;

/**
 * Data Access Object
 * CREATE
 * READ
 * UPDATE
 * DELETE
 */
public interface UserDAO {

    User createUser(User user) throws UserErrorException;

    Collection<User> listUsers() throws ListNotFoundException;

    User updateUser(User user) throws EntryNotFoundException;
    boolean deleteUser(User user) throws EntryNotFoundException;
}