package ru.javabegin.training.fastjava2;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(faktorial(5));
    }
    public static int faktorial(int n) {
        int i = 2;
        if (!(n == 2)) i = n * faktorial(n-1);
        return i;
    }
}
