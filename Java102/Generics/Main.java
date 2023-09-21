package Generics;

public class Main {
    public static void main(String[] args) {

        MyList myList = new MyList<>();

       myList.add(10);
       myList.add(20);
       myList.add(30);
       myList.add(20);
       myList.add(30);
       myList.add(20);
       myList.add(30);
       myList.add(20);
       myList.add(30);
       myList.add(20);
       myList.add(40);

       MyList<Integer> mylist2 = new MyList<>(5);

        System.out.println(myList.size());
        System.out.println(myList.contains(20));
        System.out.println(myList.get(3));
        System.out.println(myList.getCapacity());
        System.out.println(myList.isEmpty());
        System.out.println(myList.lastIndexOf(20));
        System.out.println(myList.indexOf(30));
        System.out.println(myList.sublist(3,8));
        System.out.println(myList.toString());
        myList.remove(6);
        System.out.println(myList.toString());
       
    }
}
