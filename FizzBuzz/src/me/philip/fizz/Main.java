package me.philip.fizz;

public class Main
{
    public static void main(String[] args)
    {
          
        for (int i = 1; i < 50; i++)
        {
        	
            

            if (i % 3 == 0)
            {
                System.out.print("Fizz");
            }
            if (i % 5 == 0)
            {
                System.out.print("Buzz");
            } 
            	
           
            System.out.println();
        }
    }
}
