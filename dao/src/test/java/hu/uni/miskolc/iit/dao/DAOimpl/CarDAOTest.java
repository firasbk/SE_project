package hu.uni.miskolc.iit.dao.DAOimpl;

import static org.junit.Assert.assertTrue;
import java.util.Collection;
import hu.uni.miskolc.iit.model.Car;
import hu.uni.miskolc.iit.exceptions.CarErrorException;
import hu.uni.miskolc.iit.exceptions.EntryNotFoundException;
import org.junit.Test;

/**
 * Unit test for CarDAO.
 */
public class CarDAOTest
{
    private CarDAO cardao;

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        cardao = new CarDAO();
    }

    @Test
    public void testCreateCar()
    {
        assertTrue( true );
    }

    @Test
    public void testUpdateCar() { assertTrue( true ); }

    @Test
    public void testDeleteCar() { assertTrue( true ); }

}
