package lv.sdacademy;


public class Fibunnaci {

    public int number(int i) {
        if (i <= 2) {
            return 1;
        }
        return number(i - 1) + number(i - 2);
    }
}
