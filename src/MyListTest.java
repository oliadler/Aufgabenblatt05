public class MyListTest {

    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.addToList(2, 10);
        System.out.println("Array nach dem addToList: ");
        myList.printArray();


        myList.removeFromList(2);
        System.out.println("\nArray nach dem removeFromList: ");
        myList.printArray();

        int removedElements = myList.removeDuplicates();
        System.out.println("\nAnzahl der gelöschten Elemente: "+ removedElements);
        myList.printArray();


        myList.sortList();
        System.out.println("\nArray nach sortList: ");
        myList.printArray();

    }
}
