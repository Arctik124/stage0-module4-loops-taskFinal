package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = cathetusLength; j >= 1; j--) {
                if (i >= j) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 2; j <= cathetusLength; j++) {
                if (i >= j) {
                    System.out.print(j);
                } else {
                    System.out.println();
                    break;
                }
            }
        }
        if (cathetusLength > 0)
            System.out.println();
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(9);
    }
}
