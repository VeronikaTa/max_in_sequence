package com.epam.rd.autotasks.sequence;
import java.util.ArrayList;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        boolean addInt = true;
        do{
            int number;
            number = scanner.nextInt();
            if(number != 0){
                numbers.add(number);
            }
            else {
                addInt = false;
            }
        }
        while(addInt);

        int max = numbers.get(0);
        for(Integer item : numbers){
            if(item > max){
                max = item;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        System.out.println(max());
    }
}
