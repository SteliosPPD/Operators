/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oparators;

// @author stpap

public class Oparators {

    // @param args the command line arguments
    
    public static void main(String[] args) {
        
        //Relational Operators
        /*
                         >
                         <
                        >=
                        <=
                        ==
                         !=
        */
        boolean a = (2!=3);
        System.out.println("a is: "+a);
        
        //Logical Operators
        /*
                     &&
                      ||
                       !
        */
        boolean x = true;
        boolean y = false;
        boolean z = x&&y;
        z = !z;
        System.out.println("z is: " + z);
        
        //Assignment Operators
        /*
                        +=
                        -=
                        *=
                        /=
                        %=
        */
        int number = 10;
        number *=5;
        System.out.println("Number is: " + number);
        
        //Unary Operators
        /*
                        +
                        -
                      ++
                       --
                        !
        */
        int age = 10;
        int newAge = ++age+12*(age+age);
        System.out.println("New age is: "+ newAge);
        System.out.println("Age is: " + age);
    }
    
}
