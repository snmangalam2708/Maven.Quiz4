package rocks.zipcode.quiz4.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordCounter {

    private String[] str;
    private Map<String, Integer> wordCountMap;

    public WordCounter(String... strings) {

        this.str = strings;
        this.wordCountMap = new LinkedHashMap<>();
    }

    public Map<String, Integer> getWordCountMap() {

        for (String str : this.str){
            this.wordCountMap.merge(str, 1, Integer::sum);
        }
        return this.wordCountMap;
    }
}
