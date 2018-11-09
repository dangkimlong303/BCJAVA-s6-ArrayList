public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        System.out.println("List: ");
        myList.add(12);
        myList.add(24);
        myList.add(369);
        System.out.println(myList);
        System.out.println("------");
        myList.print();
        System.out.println("Index of: " + myList.indexOf(369));
        System.out.println("Contain: " + myList.contain(24));
        System.out.println("Get Element: " + myList.get(2));
        System.out.println("Size: " + myList.size());
        System.out.println("After add: ");
        myList.add(1,33);
        System.out.println(myList);
        System.out.println("After remove: ");
        myList.remove(1);
        myList.print();
        System.out.println("Clear");
        myList.clear();
        myList.print();
        System.out.println("Clone: ");

    }
}
