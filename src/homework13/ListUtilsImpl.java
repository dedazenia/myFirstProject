package homework13;

import java.util.*;

public class ListUtilsImpl implements ListUtils {

    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        ArrayList<String> result = new ArrayList<>();
        result.addAll(Arrays.asList(strings));
        return result;
    }


    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        ArrayList<Double> result = new ArrayList<>(data);
        Collections.sort(result);
        Collections.reverse(result);
        return result;
    }


}
