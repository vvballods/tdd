package lv.sdacademy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class TriangleServiceTest {
    private TriangleService triangleService = new TriangleService();

    @Mock
    private Triangle triangle1;

    private Triangle triangle2;

    @Before
    public void setUp() {
        System.out.println("Run before each test!");
        when(triangle1.getSide1()).thenReturn(3L);
        when(triangle1.getSide2()).thenReturn(3L);
        when(triangle1.getSide3()).thenReturn(3L);
    }

    @After
    public void tearDown() {
        System.out.println("Run after each test!");
    }

    @Test
    public void calculatePerimeterForTriangle1() {
        System.out.println("Running calculatePerimeterForTriangle1");
        long perimeterForTriangle1 = triangleService.calculatePerimeter(triangle1);

        assertEquals(9L, perimeterForTriangle1);
        verify(triangle1.getSide1(), atLeastOnce());
    }

    @Test
    public void calculatePerimeterForTriangle2() {
        System.out.println("Running calculatePerimeterForTriangle2");
        triangle2 = mock(Triangle.class);
        when(triangle2.getSide1()).thenReturn(4L);
        when(triangle2.getSide2()).thenReturn(4L);
        when(triangle2.getSide3()).thenReturn(4L);

        long perimeterForTriangle2 = triangleService.calculatePerimeter(triangle2);

        assertEquals(12L, perimeterForTriangle2);
    }

    @Test
    public void calculateDoubledPerimeterForTriangle() {
        System.out.println("Running calculatePerimeterForTriangle");

        long perimeterForTriangle2 = triangleService.calculateDoubledPerimeter(triangle1);

        assertEquals(18L, perimeterForTriangle2);
    }
}
