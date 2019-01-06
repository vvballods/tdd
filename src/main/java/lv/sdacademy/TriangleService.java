package lv.sdacademy;

public class TriangleService {

    public long calculatePerimeter(Triangle triangle) {
        if (triangle != null) {
            return triangle.getSide1() + triangle.getSide2() + triangle.getSide3();
        }
        throw new IllegalArgumentException("Please provide triangle!");
    }

    public long calculateDoubledPerimeter(Triangle triangle) {
        return calculatePerimeter(triangle) * 2;
    }
}
