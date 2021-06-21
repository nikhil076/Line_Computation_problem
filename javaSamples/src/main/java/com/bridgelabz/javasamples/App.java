package com.bridgelabz.javasamples;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Line comparison computation program" );
    
        int Line1x1=6,Line1x2=-3,Line1y1=-1,Line1y2=4;
        double LengthOfLine1 = Math.sqrt((Line1x2-Line1x1)*(Line1x2-Line1x1) + (Line1y2-Line1y1)*(Line1y2-Line1y1));
        System.out.println("Length of line 1 :"+LengthOfLine1);
        int Line2x1=-5,Line2x2=-3,Line2y1=-2,Line2y2=3;
        double LengthOfLine2 = Math.sqrt((Line2x2-Line2x1)*(Line2x2-Line2x1) + (Line2y2-Line2y1)*(Line2y2-Line2y1));
        System.out.println("Length of line 2 :"+LengthOfLine2);
        
        Double d1 = new Double(LengthOfLine1);
        Double d2 = new Double(LengthOfLine2);
        
        if(d1.equals(d2))
        {
        	System.out.println("Both lines are equal");
        }
        else
        {
        	System.out.println("Both lines are different");
        }
    }
}
