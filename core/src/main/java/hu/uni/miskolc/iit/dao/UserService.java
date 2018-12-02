package hu.uni.miskolc.iit.dao;
import hu.uni.miskolc.iit.dao.exceptions.UserErrorException;
import hu.uni.miskolc.iit.dao.exceptions.*;

public interface UserService {
    /**
     *
     * @param lastName
     * @param firstName
     * @param email
     * @param password
     */
    public void userRegistration(User user) throws UserErrorException;

    /**
     *
     * @param user
     * @param password
     * @return
     */
    public boolean logger(User user) throws EntryNotFoundException;

    /**
     *
     * @param lastName
     * @param firstName
     * @param email
     * @param password
     */
    public void userModification(User user) throws EntryNotFoundException;

    /**
     *
     * @param user
     */
    public void userDelete(User user) throws EntryNotFoundException;

}