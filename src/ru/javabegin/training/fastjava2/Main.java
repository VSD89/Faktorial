package ru.javabegin.training.fastjava2;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(faktorial(0));
        System.out.println(faktorial(1));
        System.out.println(faktorial(2));
        System.out.println(faktorial(10));
    }
    public static int faktorial(int n) {
        int i = 2;
        if(n == 0) return 0;
        else if (n == 1) return 1;
        else if (!(n == 2)) i = n * faktorial(n-1);
        return i;
    }
}
