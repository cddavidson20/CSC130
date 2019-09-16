package javaPackage;
import java.util.*;

public class encodeDecodeMain {
    public static void main(String[] args){

        int[] key = {3, 1, 7, 4, 2, 5};

        Integer keyValue;
        String encoded = "";
        String decoded = "";
        String message = "";

        Scanner scan = new Scanner(System.in);
        Queue<Integer> encodingQueue = new LinkedList<Integer>();
        Queue<Integer> decodingQueue = new LinkedList<Integer>();

        System.out.println("Insert the coded message here:");
        message = scan.nextLine();
        System.out.println();

        for (int i = 0; i < key.length; i++) {
            encodingQueue.add(key[i]);
            decodingQueue.add(key[i]);
        }

        for (int i = 0; i < message.length(); i ++) {
            keyValue = encodingQueue.remove();
            encoded += (char) (message.charAt(i) + keyValue);
            encodingQueue.add(keyValue);
        }

        System.out.println("Encoded Message: \n" + encoded + "\n");

        for (int i = 0; i < encoded.length(); i++) {
            keyValue = decodingQueue.remove();
            decoded += (char) (encoded.charAt(i) - keyValue);
            decodingQueue.add(keyValue);
        }

        System.out.println("Decoded Message: \n" + decoded + "\n");
    }
}
