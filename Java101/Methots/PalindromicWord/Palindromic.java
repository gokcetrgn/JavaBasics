package Methots.PalindromicWord;

import java.util.Scanner;

public class Palindromic {
    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length() -1;

        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
    public static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir kelime girin: ");
        String word = scanner.nextLine();

        System.out.println(isPalindrome2(word));


    }
}
