package hu.uni.miskolc.iit.service;
import hu.uni.miskolc.iit.exceptions.*;
import hu.uni.miskolc.iit.exceptions.EntryNotFoundException;
import hu.uni.miskolc.iit.model.User;

public interface UserService {
    /**
     *
     * @param user
     */
    public User userRegistration(User user) throws UserErrorException;

    /**
     *
     * @param user
     * @return
     */
     // public boolean logger(User user) throws EntryNotFoundException;

    /**
     *
     * @param user
     */
    public User userModification(User user) throws EntryNotFoundException;

    /**
     *
     * @param user
     */
    public void userDelete(User user) throws EntryNotFoundException;

}