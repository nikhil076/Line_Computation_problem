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
    
        int x1=2,x2=3,y1=1,y2=4;
        double LengthOfLine = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("Length of the line is "+LengthOfLine);
    }
}
