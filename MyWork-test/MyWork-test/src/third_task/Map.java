package third_task;

import java.util.ArrayList;
import java.util.List;

public class Map<K, V> {
    List<Pair<K, V>> listOfPairs = new ArrayList<>();

    public void setListOfPair(List<Pair<K, V>> listOfPair) {
        this.listOfPairs = listOfPair;
    }

    public void idetiPora(K key, V value) {
        Pair<K, V> newPair = new Pair<>(key, value);
        listOfPairs.add(newPair);
    }

    public V gautiReiksme(K key) {
        for (Pair<K, V> pair : listOfPairs) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        return null;
    }

}
