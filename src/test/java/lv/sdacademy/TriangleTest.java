package lv.sdacademy;


import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertNotNull;

public class TriangleTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void createTriangle() {
        Triangle triangle = new Triangle(3, 3, 3);

        assertNotNull(triangle);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenOneSideIsZeroTriangleShouldNotBeCreated() {
        new Triangle(0, 3, 3);
    }

    @Test
    public void whenOneSideIsZeroTriangleShouldNotBeCreatedUsingRule() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Side length should be positive number");
        new Triangle(0, 3, 3);
    }
}
