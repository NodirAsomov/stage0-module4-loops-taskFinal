package school.mjc.stage0.loops.finalTask;
import java.util.Scanner;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        for(int i=1;i<=10;i++){
            // In each iteration print n, i and the product of n and i (n*i)
            System.out.println(i + " x " + numberTableToPrint + " = "+ numberTableToPrint * i);
        }

}}

