import java.util.List;

public class Main {
    public static void main(String[] args) {


        SortableArray<String> o = new SortableArray<String>(new SortableListimpl());

        o.add("zzzciao");
        o.add("zzzzzzzzzzzzzciao");
        o.add("ciao");
        o.remove("ciao");
        o.add("sads");
        o.add("helloo");
        o.add("checkaout");

        o.sort();

        o.print();
        System.out.println("Hello world!");

    }
}