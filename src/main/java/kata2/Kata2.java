package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
       int[] data = {1, 2, 1, 3, 3, 4, 5, 2, 1, 1, 1, 6, 7, 8, 8};

       HistogramGenerator histogramGenerator = new HistogramGenerator(data);
       Map<Integer, Integer> histogram = histogramGenerator.getHistogram();

        for (Map.Entry<Integer, Integer> entry: histogram.entrySet()) {
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }
    }
}