import javax.sound.midi.Soundbank;

public class MyList {

    // Instanzvariable
    int[] myArray;

    public MyList(int[] Array){

        // Pruefen, ob das Array leer oder null ist.

        if (Array == null || Array.length == 0)
        {
            System.out.println("Array ist leer oder null.");
            System.exit(0);
        }


        else
        {       //  Instanzvariable wird initialisert.
            this.myArray = Array;
        }
    }

    // methode fuer das Hinzufuegen von neuen Elementen an einer bestimmten Stelle.
    public void addToList(int index,int item)
    {
            // Index darf nicht kleiner als 0 sein und darf auch nicht groeßer als die Laenge des Arrays sein.
        if (index < 0 || index >= myArray.length)
        {
            System.out.println("Der Index liegt außerhalb vom Array.");
            return;
        }

            // neues Array, dessen Laenge 1 groeßer ist.
        int[] myTempArray = new int[myArray.length+1];

        // Elemente werden in das TempArray bis zum index reingeschrieben.
        for (int i = 0; i < index; i++) {

            myTempArray[i] = myArray[i];
        }
        // neues Element wird an Stelle index gesetzt.
        myTempArray[index] = item;

        // andere Elemtente werden einen Wert nach rechts verschoben.
        for (int j = index+1; j < myTempArray.length; j++) {
            myTempArray[j] = myArray[j-1];
        }

        myArray = myTempArray;

    }


    // Methode, um etwas zu entfernen, an einer bestimmten Stelle.
    public void removeFromList(int index)
    {
        // Index darf nicht kleiner als 0 sein und darf auch nicht groeßer als die Laenge des Arrays sein.
        if (index < 0 || index >= myArray.length)
        {
            System.out.println("Der Index liegt außerhalb vom Array.");
           System.exit(0);
        }
        // neues Array, dessen Laenge 1 kleiner ist.
        int[] myTempArray = new int[myArray.length-1];

        for (int i = 0; i < index ; i++) {
            myTempArray[i] = myArray[i];
        }
        // andere Elemtente werden einen Wert nach links verschoben bzw. nach Links hin ueberschrieben.
        for (int i = index; i < myTempArray.length; i++) {
            myTempArray[i] = myArray[i+1];
        }

        myArray = myTempArray;

    }

    //Duplikate werden entfernt.
    public int removeDuplicates()
    {
        int[] tempArray = myArray;

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i] == myArray[j] && i != j) {

                    removeFromList(j);  //Entfernt Duplikat an Stelle z

                    // Rekursiver Aufruf, weil sich die Groesse des Arrays veraendert und somit auch die Indizies.
                    removeDuplicates();
                    // anzahl der gelöschten Elemente.
                }
            }
        }
        return tempArray.length - myArray.length;

    }

    // Sortiet das Array aufsteigend.
    public void sortList()
    {
        for (int i = 0; i < myArray.length; i++) {
            // Initial wird minValue der Index des ersten Elements sein.
            int minValue = i;

            // "Sucht" den index des kleinsten Elements.
            for (int j = i; j < myArray.length ; j++) {
                if (myArray[j] < myArray[minValue])
                {
                    minValue = j; // Falls gefunden wird dieser in minValue gesetzt.
                }
                }
            // Kleinstes Element wird mit der aktuellen Stelle i getauscht.
            int temp = myArray[i];
            myArray[i] =  myArray[minValue];
            myArray[minValue] = temp;
        }
    }

    // Kombiniert die Zahlen, die die den Parameter in einer Addition ergeben können.
    public void kombiZahl(int zahl) {

        StringBuilder indizies = new StringBuilder();
        String stringrows  = " ";

        // ersten 3 Schleifen, dienen alle Kombinationen zu ermitteln.
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length; j++) {
                for (int k = 0; k < myArray.length; k++) {
                    // Die 3 Operanten müssen gemeinsam die "zahl" ergeben.
                    if (myArray[i] + myArray[j] + myArray[k] == zahl) {

                        // die Indizies der Operanten werden in ein StringBuilder reingeschrieben.
                        if (indizies.isEmpty())
                        {

                            indizies.append(i);
                            indizies.append(',');
                            indizies.append(j);
                            indizies.append(',');
                            indizies.append(k);
                            indizies.append('\n');
                        }
                        else
                        {
                      // dient der Aufspaltung des Strings, um im Anschluss die einzelnen Kombis überprüfen zu können.
                            for (int l = 0; l < indizies.length(); l++) {
                                stringrows = indizies.toString();
                                String [] rows = stringrows.split("\n");

                                for (int m = 0; m < rows.length; m++) {

                                        String[] columns = rows[m].split(",");

                                    for (int n = 0; n < columns.length; n++) {

                                        /*


        // Spaltet jede Zeile am Leerzeichen, sodass nur noch die Zahlen drin stehen. In der KombiZahl Methode werden Leerzeichen zum spalten der Zahlen genutzt.
        String[] zahlen = zeile.split(" ");
        // Für jede Zahl wird überprüft, ob diese gleich n ist, wenn ja, wird zahlIstVorhanden auf true gesetzt.
        for (int j = 0; j < zahlen.length; j++) {
            if(Integer.parseInt(zahlen[j]) == n) zahlIstVorhanden = true;
            // Wenn die Zahl im String vorhanden ist, wird aus der For-Schleife herausgegangen.
            if (zahlIstVorhanden) break;
        }
        // Wenn die Zahl nicht gefunden wurde, d.h. zahlIstVorhanden ist false, dann gebe false zurück, sonst wird true zurückgegeben
        return zahlIstVorhanden;
                                         */
                                        //if (Integer.parseInt(columns[n]) == i && Integer.parseInt(columns[n]) == j && Integer.parseInt(columns[n]) == k ){

                                            indizies.append(i);
                                            indizies.append(',');
                                            indizies.append(j);
                                            indizies.append(',');
                                            indizies.append(k);
                                            indizies.append('\n');

                                        }
                                    }

                                }

                            }
                        }
                    }

                }

            }

        System.out.println(indizies);
        System.out.println();
        }










    // Ausgabe des Arrays - dient der Kontrolle und dem Testen.
    public void printArray()
    {
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]+" ");
        }
    }

}
