package Threads;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> commonList = new ArrayList<>();
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        ArrayList<Integer> third = new ArrayList<>();
        ArrayList<Integer> fourth = new ArrayList<>();

        for(int i = 1; i<=10000; i++){
            commonList.add(i);
            if(i <= 2500){
                first.add(i);
            }else if(i>2500 && i<=5000){
                second.add(i);
            }else if(i>5000 && i<=7500){
                third.add(i);
            }else{
                fourth.add(i);
            }
        }

        ExecutorService threadPool = Executors.newFixedThreadPool(4);

        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

        threadPool.execute(new Threads(first, evenList, oddList));
        threadPool.execute(new Threads(second, evenList, oddList));
        threadPool.execute(new Threads(third, evenList, oddList));
        threadPool.execute(new Threads(fourth, evenList, oddList));

        threadPool.shutdown();

        System.out.println("Even List:");
        for (Integer evenNumber : evenList) {
            System.out.println(evenNumber);
        }
        System.out.println("Odd List:");
        for (Integer oddNumber : oddList) {
            System.out.println(oddNumber);
        }
    }   
}
