package hu.uni.miskolc.iit.service;

import hu.uni.miskolc.iit.exceptions.UserErrorException;
import hu.uni.miskolc.iit.model.User;
import org.junit.*;
import org.junit.rules.ExpectedException;

import java.util.Date;

public class UserServiceImplTest {

    @Rule
    public ExpectedException expectException = ExpectedException.none();
    private User user = new User(34, "username1", "password1", "My", "Friend", User.Gender.M, new Date(), "myfriends@email.com", "+36701112222", false);


    UserService userService = new UserServiceImpl();

    @Test
    public void userRegistration() throws UserErrorException {
        User newUser = userService.userRegistration(user);
        Assert.assertEquals(user.getUsername(), newUser.getUsername());
    }

    @Test
    public void userModification() throws UserErrorException {
        User modifiedUser = new User(34, "username1", "password1", "My", "lastnametest", User.Gender.M, new Date(), "myfriends@email.com", "+36701112222", false);
        userService.userModification(modifiedUser);
        Assert.assertEquals("lastnametest", modifiedUser.getLastName());
    }

    @Test
    public void userDelete() throws UserErrorException {
        User deleteUser = new User(12, "username1", "password1", "fname", "lname", User.Gender.M, new Date(), "myfriends@email.com", "+36701112222", false);
        boolean isDeleted = userService.userDelete(deleteUser);
        Assert.assertTrue(isDeleted);
    }

    @Test
    public void invalidUserRegistration() throws UserErrorException {
        expectException.expect(UserErrorException.class);
        userService.userRegistration(null);

    }

    @Test
    public void invalidUserModification() throws UserErrorException {
        expectException.expect(UserErrorException.class);
        userService.userModification(null);
    }

    @Test
    public void invalidUserDelete() throws UserErrorException {
        expectException.expect(UserErrorException.class);
        userService.userDelete(null);
    }
}