import java.util.*;

public class printAverageMain {
    public static void main(String[] args){
        int x = 7;
        int y = 18;
        int z = 5;

        if (z <= x) {
            z = x + 1;
        } else {
            z = z + 12;
        }
        if (z <= y)
            y++;

        System.out.println(x + " " + z + " " + y );

    }
}
