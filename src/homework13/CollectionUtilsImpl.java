package homework13;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

        LinkedList<Integer> result = new LinkedList<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
//        LinkedList<Integer> result = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer integer : a) {
            if (b.contains(integer)) {
                result.add(integer);
            }
        }
        for (Integer integer : b) {
            if (a.contains(integer)) {
                result.add(integer);
            }
        }

        return result;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedHashSet<Integer> result = new LinkedHashSet<>();
        result.addAll(a);
        result.addAll(b);

        return result;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedHashSet<Integer> result = new LinkedHashSet<>();
        for (Integer integer: a) {
            if(b.contains(integer)){
                result.add(integer);
            }
        }

        return result;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer integer : a) {
            if (!b.contains(integer)) {
                result.add(integer);
            }
        }
        for (Integer integer : b) {
            if (!a.contains(integer)) {
                result.add(integer);
            }
        }

        return result;
    }
}
