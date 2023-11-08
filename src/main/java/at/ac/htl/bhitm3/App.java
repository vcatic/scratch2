package at.ac.htl.bhitm3;

import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        System.out.println( "Hello World!" );
    }

 
    public int getSum(){
        int sum = 0;
        for (int i=1; i<=10; i++){
            sum += i*i;
        }
        return sum;
    }
}
