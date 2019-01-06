package lv.sdacademy;


public class Triangle {
    private long side1;
    private long side2;
    private long side3;

    Triangle(long side1, long side2, long side3) {

        long min = Math.min(Math.min(side1, side2), side3);
        if (min <= 0) throw new IllegalArgumentException("Side length should be positive number!");

        long max = Math.max(Math.max(side1, side2), side3);
        long sum = side1 + side2 + side3;
        if (max > (sum - max)) throw new IllegalArgumentException("Can't create a triangle!");

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public long getSide1() {
        return side1;
    }

    public void setSide1(long side1) {
        this.side1 = side1;
    }

    public long getSide2() {
        return side2;
    }

    public void setSide2(long side2) {
        this.side2 = side2;
    }

    public long getSide3() {
        return side3;
    }

    public void setSide3(long side3) {
        this.side3 = side3;
    }
}
