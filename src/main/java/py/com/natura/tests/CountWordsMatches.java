package py.com.natura.tests;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map.Entry;


public class CountWordsMatches {


    public List<Map.Entry<String, Integer>> getMoreRepeatedWords(InputStreamReader fileInputStream){

        Map<String, Integer> wordMap = getWordCount(fileInputStream);
        List<Map.Entry<String, Integer>> list = sortByValue(wordMap);

        return list;
    }


    private Map<String, Integer> getWordCount(InputStreamReader fileInputStream){
        BufferedReader br = null;
        Map<String, Integer> wordMap = new HashMap<String, Integer>();
        try {
            br = new BufferedReader(fileInputStream);
            String line = null;
            while((line = br.readLine()) != null){
                StringTokenizer st = new StringTokenizer(line, " ");
                while(st.hasMoreTokens()){
                    String temp = st.nextToken().toLowerCase();
                    if(wordMap.containsKey(temp)){
                        wordMap.put(temp, wordMap.get(temp)+1);
                    } else {
                        wordMap.put(temp, 1);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try{
                if(br != null)
                    br.close();
            }catch(Exception ex){}
        }
        return wordMap;
    }

    private List<Entry<String, Integer>> sortByValue(Map<String, Integer> wordMap){
        Set<Entry<String, Integer>> set = wordMap.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Comparator<Map.Entry<String, Integer>> comparator = new Comparator<Map.Entry<String, Integer>>(){
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 ){
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        };
        Collections.sort( list, comparator);
        return list;
    }

}


