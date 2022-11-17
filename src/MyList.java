public class MyList {

    int[] myArray = {2,1,5,4,4,6,45,7,6,5,23,8,73,3};
    public void addToList(int index,int item)
    {
        if (index < 0 || index >= myArray.length)
        {
            System.out.println("Der Index liegt außerhalb vom Array.");
            return;
        }

        int[] myTempArray = new int[myArray.length+1];
        //index = 2


        for (int i = 0; i < index; i++) {

            myTempArray[i] = myArray[i];
        }

        myTempArray[index] = item;

        for (int j = index+1; j < myTempArray.length; j++) {
            myTempArray[j] = myArray[j-1];
        }

        myArray = myTempArray;

    }

    public void removeFromList(int index)
    {
        if (index < 0 || index >= myArray.length)
        {
            System.out.println("Der Index liegt außerhalb vom Array.");
           System.exit(0);
        }

        int[] myTempArray = new int[myArray.length-1];

        for (int i = 0; i < index ; i++) {
            myTempArray[i] = myArray[i];
        }

        for (int i = index; i < myTempArray.length; i++) {
            myTempArray[i] = myArray[i+1];
        }

        myArray = myTempArray;

    }

    public int removeDuplicates()
    {


        int[] myTempArray = myArray;
        int counter = 0;
        for (int i = 0; i < myTempArray.length; i++) {
            for (int j = 0; j < myTempArray.length; j++) {
                if (myTempArray[i] == myTempArray[j] && i != j) {
                    removeFromList(j); // Fehler er löscht zu viel!
                    counter++;
                }
            }
        }
        return counter;

    }


    public void sortList()
    { // {2,1,4};
        int minValue = myArray[0];
        for (int i = 0; i < myArray.length; i++) {

            for (int j = 0; j < i ; j++) {
                if (minValue > myArray[j])
                {

                    // fehlt  noch...

                }
            }

        }
    }

    public void printArray()
    {
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]+" ");
        }
    }

}
