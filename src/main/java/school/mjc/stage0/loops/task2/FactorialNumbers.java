package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int fact = 1;
        System.out.println(fact);
        int i = 1;
        while( i <= printToInclusive ){
            fact = fact * i;
            System.out.println(fact);
            i++; //increment i by 1
        }
    }
}
