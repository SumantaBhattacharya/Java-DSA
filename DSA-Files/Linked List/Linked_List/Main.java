package Linked_List;

// import java.util.LinkedList;

// https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/lectures/18-linkedlist/code/src/com/kunal/LL.java
public class Main {
    public static void main(String[] args) {
        // LinkedList<Integer> list = new LinkedList<>();
        // list.add(43);

        LinkedL list = new LinkedL();

        list.insertFirst(69);
        list.insertFirst(68);
        list.insertFirst(440);
        list.insertLast(480);

        list.print();

        // print the selected index elelement 
        list.insert(40, 2);

        list.print();

    }
}
