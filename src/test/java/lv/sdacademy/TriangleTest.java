package lv.sdacademy;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TriangleTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @BeforeClass
    public static void setUp() {
        System.out.println("Run before all tests!");
    }

    @AfterClass
    public static void tearDown() {

        System.out.println("Run after all tests!");
    }

    @Test
    public void createTriangle() {
        System.out.println("Running createTriangle");

        Triangle triangle = new Triangle(3, 3, 3);

        assertNotNull(triangle);
        assert triangle.getSide1() == 3; // assert keyword
        assertEquals(3, triangle.getSide2());
        assertThat(3L, is(triangle.getSide3())); // Using matchers (Hamcrest)

        assertTrue(Arrays.asList(triangle).contains(triangle));

        assertThat(Arrays.asList(triangle), contains(triangle));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenOneSideIsZeroTriangleShouldNotBeCreated() {
        System.out.println("Running whenOneSideIsZeroTriangleShouldNotBeCreated");

        new Triangle(0, 3, 3);
    }

    @Test
    public void whenOneSideIsZeroTriangleShouldNotBeCreatedUsingRule() {
        System.out.println("Running whenOneSideIsZeroTriangleShouldNotBeCreatedUsingRule");

        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Side length should be positive number");
        new Triangle(0, 3, 3);
    }

    @Test
    public void whenOneSideIsLongerThanTwoSideCombined() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Can't create a triangle");

        new Triangle(10, 5, 2);
    }

    @Test
    public void whenOneSideIsLongerThanTwoSideCombinedManually() {
        try {
            new Triangle(10, 5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            assertEquals("Message are not the same", "Can't create a triangle!", e.getMessage());
        }
    }
}
