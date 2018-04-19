package py.com.natura.tests;

import org.junit.Test;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

public class CountWordsMatchesTest {


    @Test
    public void test(){

        InputStream inputStream = CountWordsMatchesTest.class.getResourceAsStream("/text.txt" );
        CountWordsMatches cwm = new CountWordsMatches();
        List<Map.Entry<String, Integer>> result = cwm.getMoreRepeatedWords(new InputStreamReader(inputStream));
        System.out.println("More Repeated Word is: '" + result.get(0).getKey() + "', " + result.get(0).getValue() + " times.");
    }
}
