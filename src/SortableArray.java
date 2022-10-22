import java.util.List;

interface SortableList<T extends Comparable<T>> {

    public void add(Comparable<T> el);
    public void remove(Comparable<T> el);
    public void sort();
    public void print();
}

public class SortableArray<T extends Comparable<T>> {

    public SortableList<T> lista;

    public SortableArray(SortableList<T> lista){

        this.lista=lista;

    }

    public void add(T el) {
        lista.add(el);
    }

    public void remove(T el) {
        lista.remove(el);
    }

    public void sort() {
        lista.sort();
    }

    public void print() {
        lista.print();
    }


}
