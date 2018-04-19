package py.com.natura.tests;

import org.junit.Test;

public class SmallestLargestFinderTest {

    @Test
    public void test(){

        int a[] = new int[] { 23, 34, 13, 64, 72, 90, 10, 15, 9, 27 };

        int min = a[0]; //  assume first elements as smallest number
        int max = a[0]; //  assume first elements as largest number

        for (int i = 1; i < a.length; i++)
        {
            if (a[i] > max)
            {
                max = a[i];
            }
            if (a[i] < min)
            {
                min = a[i];
            }
        }

        System.out.println("The smallest number is : " + min);
        System.out.println("The biggest number is : " + max);
    }
}
