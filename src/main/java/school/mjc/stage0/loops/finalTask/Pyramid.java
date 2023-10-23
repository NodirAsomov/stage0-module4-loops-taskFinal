package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int rows = cathetusLength, k = 0;

        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print(i+" ");
                ++k;
            }

            System.out.println("");
        }
    }




    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
