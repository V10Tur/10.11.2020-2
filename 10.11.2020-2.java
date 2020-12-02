package com.company;

public class fd {
    try{
        int[] numbers = new int[3];
        numbers[4]=45;
        System.out.println(numbers[4]);
    }
catch(Exception ex){

        ex.printStackTrace();
    }
finally{
        System.out.println("Блок finally");
    }
System.out.println("Программа завершена");

}
