package school.mjc.stage0.loops.finalTask;

/**
 *  Write a program that prompts the user to input a positive integer.
 *  It should then print the multiplication table of that number.
 */
public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + numberTableToPrint + " = " + i*numberTableToPrint);
        }
    }
}
