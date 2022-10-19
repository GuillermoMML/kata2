package kata2;


import java.util.HashMap;
import java.util.Map;

public class HistogramGenerator<T> {
    private final T[] data;

    public HistogramGenerator(T[] data) {
        this.data = data;
    }

    Map<T, Integer> getHistogram() {
        Map<T, Integer> map = new HashMap<T, Integer>();

        for (int i = 0; i < data.length; i++) {
            map.put(data[i], map.containsKey(data[i]) ? map.get(data[i]) + 1 : 1);
        }
        return map;
    }
}