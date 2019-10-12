package lessonFour.iterator;

import lessonFour.list.SingleLinkedList;

public class IteratorApp {

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        ListIterator iterator = new ListIterator(list);
        iterator.insertAfter("Anton", 33);
        iterator.insertAfter("Garik", 21);
        iterator.insertAfter("Sergey", 18);
        iterator.insertBefore("Petr", 7);
        iterator.insertBefore("Anna", 12);
        iterator.insertBefore("Maria", 27);
        iterator.deleteCurrent();
        list.display();
        System.out.println();
        iterator.deleteCurrent();
        list.display();

//        Map map = new HashMap();
//        Set set = new TreeSet();
//        Set _set = new CopyOnWriteArraySet();
//        List _list = new ArrayList();
//        _list.iterator();
//        map.entrySet().iterator();
//        _set.iterator();
//        set.iterator();
    }

    // Anton Anna Petr Garik

}
