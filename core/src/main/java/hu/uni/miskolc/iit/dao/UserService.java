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
    public void userRegistration(String lastName, String firstName,  String email, String password) throws UserErrorException;

    /**
     *
     * @param user
     * @param password
     * @return
     */
    public boolean logger(String user, String password) throws UserErrorException;

    /**
     *
     * @param lastName
     * @param firstName
     * @param email
     * @param password
     */
    public void userModification(String lastName, String firstName,  String email, String password) throws UserErrorException;

    /**
     *
     * @param user
     */
    public void userDelete(String user) throws UserErrorException;

}