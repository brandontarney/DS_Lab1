/*
Date: 06/15/2015
Author: Brandon Tarney

Purpose of program:
Drive a program which reads file input (numbers) and outputs the numbers to a new file as their string representation
i.e. input = 0 1 2 3 4 output = "zero" "one" "two" "three" "four"

Implementation goals:
1. Use GIT to version the project (command line, github app, and netbeans integration)
2. Use Sublime Text & Netbeans extensively to familiarize with both
3. Use 1 class as a driver
4. Use 1 class as for I/O (modified version of provided example)
5. Use 1 class as a stack
6. Use 1 class as a "converter" from a letter to a code string for outputting
7. Use runtime metrics
8. Use good error & exception handling
9. Use Javadoc (built in java documenting tool?)
10. Use standard java practices & procedures

*/
import java.io.*;
import java.util.*;



public class Lab1{
   String title;
   String number;     

   
   
	public static void main(String [] args)
        {
            //RuntimeMetric (long n, long t)     track the runtime
            
            String input;
            
            //test stack
            Stack_Tester stackTest = new Stack_Tester();
            stackTest.test();
            //////
            
           //test I/O
            File_IO fileIO = new File_IO(args[0], args[1]);
            input = fileIO.get_NextInput();
            System.out.println(input);
            fileIO.write_Output(input);
            fileIO.close_Output();
            
            
            
            
            

	}//end of main method

}//end of lab1