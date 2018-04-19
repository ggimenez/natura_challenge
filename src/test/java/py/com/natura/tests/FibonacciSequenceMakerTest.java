package py.com.natura.tests;

import org.junit.Test;

import static py.com.natura.tests.FibonacciSequenceMaker.makeFibonacci;

public class FibonacciSequenceMakerTest {

    @Test
    public void test(){

        System.out.println("The 15th value in the makeFibonacci sequence : " + makeFibonacci(15));
    }

}
