package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power >= 0){
            int base = 2;
            int i = power;
            long result = 1;
            System.out.println(result);
            while(i != 0){
                result *= base;
                System.out.println(result);
                --i;
            }
        } else {
            System.out.println("too much power");
        }

    }
}
