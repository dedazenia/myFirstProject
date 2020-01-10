package homework13;

import java.util.*;

public class ListUtilsImpl implements ListUtils {

    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        List<String> result = new LinkedList<>();
        result.addAll(Arrays.asList(strings));

//        List<String> result = new LinkedList<>();
//        for (int i = 0; i < strings.length; i++) {
//            result.add(strings[i]);
//        }
        return result;
    }


    @Override
    public List<Double> sortedList(List<Double> data) throws IllegalArgumentException {
        if (data==null){
            throw new IllegalArgumentException();
        }
        List<Double> result=new ArrayList<Double>(data);
        result.sort(DecComoarator);
        return result;
    }

    static final Comparator<Double> DecComoarator=new Comparator<Double>() {
        @Override
        public int compare(Double o1, Double o2) {
            return o2.compareTo(o1);
        }

    };




}
