package hu.uni.miskolc.iit.dao.DAOimpl;

import static org.junit.Assert.assertTrue;
import hu.uni.miskolc.iit.model.User;
import hu.uni.miskolc.iit.exceptions.EntryNotFoundException;
import hu.uni.miskolc.iit.exceptions.ListNotFoundException;
import hu.uni.miskolc.iit.exceptions.UserErrorException;

import java.util.List;

import org.junit.Test;
import java.util.Date;

/**
 * Unit test for UserDAO.
 */
public class UserDAOTest
{
    private UserDAOImpl userDAO = new UserDAOImpl();

    private enum Gender {
        M, F, O
    }

    @Test
    public void testCreateUser() throws UserErrorException, ListNotFoundException {
        User user = new User(1234, "username1", "password1", "My", "Friend", Gender.M, new Date(), "myfriends@email.com", "+36701112222", false);
        userDAO.createUser(user);

        List<User> userList = (List<User>) userDAO.listUsers();

        assertTrue(userList.get(userList.size() - 1).equals(user));
    }

    @Test
    public void testlistUsers() throws ListNotFoundException, UserErrorException {
        List<User> localList = new List<User>();

        User user1 = new User(1234, "username1", "password1", "My", "Friend", Gender.M, new Date(), "myfriends@email.com", "+36701112222", false);
        User user2 = new User(1235, "username2", "password2", "My", "Friend", Gender.M, new Date(), "myfriends@email.com", "+36701112222", false);
        User user3 = new User(1236, "username3", "password3", "My", "Friend", Gender.M, new Date(), "myfriends@email.com", "+36701112222", false);
        User user4 = new User(1237, "username4", "password4", "My", "Friend", Gender.M, new Date(), "myfriends@email.com", "+36701112222", false);
        User user5 = new User(1238, "username5", "password5", "My", "Friend", Gender.M, new Date(), "myfriends@email.com", "+36701112222", false);

        localList.add(user1);
        localList.add(user2);
        localList.add(user3);
        localList.add(user4);
        localList.add(user5);

        userDAO.createUser(user1);
        userDAO.createUser(user2);
        userDAO.createUser(user3);
        userDAO.createUser(user4);
        userDAO.createUser(user5);

        List<User> userList = (List<User>) userDAO.listUsers();

        assertTrue(userList.equals(localList));
    }

    @Test
    public void testUpdateUser() throws EntryNotFoundException, UserErrorException, ListNotFoundException {
        User user = new User(1234, "username1", "password1", "My", "Friend", Gender.M, new Date(), "myfriends@email.com", "+36701112222", false);
        userDAO.createUser(user);

        User updatedUser = new User(1234, "username1", "password1", "My", "Friend", Gender.F, new Date(), "myfriends@email.com", "+36701112222", false);
        userDAO.updateUser(updatedUser);

        List<User> userList = (List<User>) userDAO.listUsers();

        assertTrue(userList.indexOf(updatedUser).equals(updatedUser));
    }

    @Test
    public void testDeleteUser() throws EntryNotFoundException, UserErrorException, ListNotFoundException {
        List<User> beforeList = (List<User>) userDAO.listUsers();

        User user = new User(1234, "username1", "password1", "My", "Friend", Gender.M, new Date(), "myfriends@email.com", "+36701112222", false);
        userDAO.createUser(user);

        userDAO.deleteUser(user);
        List<User> afterList = (List<User>) userDAO.listUsers();

        assertTrue(beforeList.equals(afterList));
    }
}
