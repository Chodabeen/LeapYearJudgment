package edu.handong.csee.java;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Main stepC = new Main();
    stepC.c11();
  }
  void c11(){
    Scanner s = new Scanner(System.in);
    int year;

    System.out.print("Enter a year > ");
    year = s.nextInt();

    if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
      System.out.println("This year is leap year");
    if(year % 4 == 0 && year % 100 == 0 && year % 400 != 0)
      System.out.println("This year is not leap year");
    if(year % 4 == 0 && year % 100 != 0){
      System.out.println("This year is leap year");   
    }if(year % 4 != 0){
      System.out.println("This year is not leap year");
    } 

     
  }
}

    

