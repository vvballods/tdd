package lv.sdacademy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


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
        long perimeterForTrianle1 = triangleService.calculatePerimeter(triangle1);

        assertEquals(9L, perimeterForTrianle1);
    }

    @Test
    public void calculatePerimeterForTriangle2() {
        triangle2 = mock(Triangle.class);
        when(triangle2.getSide1()).thenReturn(4L);
        when(triangle2.getSide2()).thenReturn(4L);
        when(triangle2.getSide3()).thenReturn(4L);

        long perimeterForTrianle2 = triangleService.calculatePerimeter(triangle2);

        assertEquals(12L, perimeterForTrianle2);
    }
}
