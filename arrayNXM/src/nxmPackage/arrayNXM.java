package nxmPackage;

import com.sun.jmx.snmp.SnmpUnsignedInt;
import javafx.util.Pair;

import java.util.*;

public class arrayNXM {

    private static Map < Integer, LinkedList<Pair<Byte, Byte>> > numRepeated = new HashMap<>();

    public static void main(String[] args){
        int[][] array = {
                {2,3,5,5,5,5},
                {1,3,5,6,5,6},
                {0,5,5,5,6,3}
        };

        System.out.println("Original");
        //print out the array
        Print2DArray(array);

        int row = array.length;
        int column = array[0].length;

        hashMapStore(array);

        System.out.println();

        printHashMapStore();

        int[][] restoredArray = restoreArrayFromMap(row, column);
        Print2DArray(restoredArray);
    }

    //store the array in a hashmap
    private static void hashMapStore(int[][] array){
        for (int row = 0; row < array.length ; row++){
            for (int column = 0; column < array[row].length; column ++) {
                int key = array[row][column];
                if(numRepeated.containsKey(key)) {
                    LinkedList pair = numRepeated.get(key);
                    pair.add(new Pair(row, column));
                    numRepeated.put(key, pair);
                } else {
                    LinkedList pair = new LinkedList();
                    pair.add(new Pair(row, column));
                    numRepeated.put(key, pair);
                }
            }
        }

    }

    private static void printHashMapStore(){
        System.out.println("Stored as this: ");
        numRepeated.forEach((key, value) -> System.out.println(key + ": val " + value));
        System.out.println();
    }

    private static int[][] restoreArrayFromMap(int row, int column) {
        int[][] restoredArray = new int[row][column];

        Iterator it = numRepeated.entrySet().iterator();

        System.out.println("Restoring array:");

        while (it.hasNext()) {
            Map.Entry mapElement = (Map.Entry) it.next();
            LinkedList list = (LinkedList) mapElement.getValue();
            for (int i = 0; i < list.size(); i++) {
                Pair pair = (Pair) list.get(i);
                int r = (int) pair.getKey();
                int c = (int) pair.getValue();
                restoredArray[r][c] = (int) mapElement.getKey();
            }
        }
        return restoredArray;
        //lambada approach not done properly
        // numRepeated.forEach((key, value) -> (value.forEach(pair -> System.out.print(pair.getKey() + " " + pair.getValue()+ "\n" ));
    }

    //Prints the 2d array so its visible
    private static void Print2DArray(int[][] array) {
        for (int i = 0; i < array.length ; i++){
            for (int j = 0; j < array[i].length; j ++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
