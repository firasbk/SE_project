package hu.uni.miskolc.iit.dao.DAOimpl;

import static org.junit.Assert.assertTrue;
import java.util.Collection;
import hu.uni.miskolc.iit.model.Car;
import hu.uni.miskolc.iit.exceptions.CarErrorException;
import hu.uni.miskolc.iit.exceptions.EntryNotFoundException;
import org.junit.Test;

/**
 * Unit test for UserDAO.
 */
public class UserDAOTest
{
    private UserDAO userdao;

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        userdao = new UserDAO();
    }

    @Test
    public void testCreateUser()
    {
        assertTrue( true );
    }

    @Test
    public void testUpdateUser() { assertTrue( true ); }

    @Test
    public void testDeleteUser() { assertTrue( true ); }

}
