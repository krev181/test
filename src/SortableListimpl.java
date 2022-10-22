import java.util.ArrayList;
import java.util.Collections;

public class SortableListimpl implements SortableList {


    private ArrayList<Comparable> arrayList;

    public SortableListimpl(){
        arrayList=new ArrayList<Comparable>();
    }

    @Override
    public void add(Comparable el) {
        arrayList.add(el);
    }

    @Override
    public void remove(Comparable el) {
        arrayList.remove(el);

    }

    @Override
    public void sort() {
        Collections.sort(arrayList);
    }

    @Override
    public void print() {
        for (Comparable n:arrayList) {
            System.out.println(n);
        }
    }
}

