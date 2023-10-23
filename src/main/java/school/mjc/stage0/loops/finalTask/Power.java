package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int base = numberToPrint, exponent = power;

        long result = 1;

        for (; exponent != 0; --exponent) {
            result *= base;
        }

        System.out.println(result);
    }



    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
