package Threads;

import java.util.ArrayList;

public class Threads implements Runnable{
    private ArrayList<Integer> numbers; 
    private ArrayList<Integer> evenList; 
    private ArrayList<Integer> oddList; 

    public Threads(ArrayList<Integer> numbers, ArrayList<Integer> evenList, ArrayList<Integer> oddList) {
        this.numbers = numbers;
        this.evenList = evenList;
        this.oddList = oddList;
    }

    @Override
    public void run() {
        for (Integer number : numbers) {
            if (findNumber(number)) {
                evenList.add(number);
            } else {
                oddList.add(number);
            }
        }
    }

    private boolean findNumber(int number) {
        return number % 2 == 0;
    }

}
