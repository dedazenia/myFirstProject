package homework13;

import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetUtilsImpl implements SetUtils {

    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection1, Set<String> set2) throws NullPointerException {
        return null;
    }

    @Override
    public Set<Integer> customOrderSet(int val1, int val2, int val3, int val4, int val5) {
        int [] arrayParams={ val1,  val2, val3,  val4,  val5};
        Set<Integer> result= new TreeSet<>();
        for (int i=0;i<arrayParams.length;i++){
            result.add(arrayParams[i]);
        }
        return result;
    }
}
