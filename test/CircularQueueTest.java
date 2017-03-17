import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircularQueueTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void isEmpty() throws Exception {
        //Arrange
        CircularQueue<String> queue = new CircularQueue<>(10);

        //Act
        boolean result = queue.isEmpty();

        //Assert
        assertTrue(result);
    }

}