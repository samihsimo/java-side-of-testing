package uebung11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;


public class CountingArrayList<E> extends ArrayList<E> implements CountingList<E> {
    private final Map<E, Integer> countMap = new HashMap<>();

    @Override
    public boolean add(E element) {
        countMap.put(element, countMap.getOrDefault(element, 0) + 1);
        return super.add(element);
    }

    @Override
    public  int count(E element) {
        return countMap.getOrDefault(element, 0);
    }

    @Override
    public int getCount() {
        return countMap.values().stream().mapToInt(Integer::intValue).sum();
    }

    @Override
    public int unique() {
        return countMap.size();
    }

    public CountingArrayList() {
    super();
}

    public CountingArrayList(List<E> list) {
    super(list);
}
}
