public class MyListTest {

    public static void main(String[] args) {

        int[] myArray = {9,13,5,5,5,12,51,2};

        // Objekt von Typ myList wird erstellt.
        MyList myList = new MyList(myArray);
        System.out.println("Originales Array: ");
        myList.printArray();

        myList.addToList(2,50);
        System.out.println("\nArray nach dem addToList: ");
        myList.printArray();


        myList.removeFromList(2);
        System.out.println("\nArray nach dem removeFromList: ");
        myList.printArray();

        int removedElements = myList.removeDuplicates();
        System.out.println("\nAnzahl der gelöschten Elemente: "+ removedElements);
        System.out.println("\nArray nach removeDuplicates");
        myList.printArray();

        myList.sortList();
        System.out.println("\nArray nach sortList: ");
        myList.printArray();


        int[] myArray2 = {1,1,2,5};
        MyList myList2 = new MyList(myArray2);
        System.out.println();
        System.out.println("--------------");
        System.out.println("Anderes Array: ");
        myList2.printArray();

        int zahl = 8;
        System.out.println("\nOperanden, welche " + zahl+ " ergeben: ");
        myList2.kombiZahl(zahl);



    }
}
