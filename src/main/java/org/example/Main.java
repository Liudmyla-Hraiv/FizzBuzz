package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for(int i = 1; i < 101;i++){
            if (i%15==0)
                System.out.println("FizzBuzz");
            else
            if (i%3==0 || i%5==0)
                System.out.println((i%3==0) ? "Fizz":"Buzz");
            else System.out.println(i);
        }
    }
}