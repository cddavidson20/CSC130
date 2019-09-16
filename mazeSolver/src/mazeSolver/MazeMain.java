package mazeSolver;

import java.io.*;
import java.util.*;
import java.lang.*;


public class MazeMain {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name of the file containing the maze: ");
        String filename = scan.nextLine();

        Maze labyrinth = new Maze(filename);
        System.out.println(labyrinth);
        System.out.println("This program will solve the maze starting at the top left and ending at the bottom right.");

        MazeSolve solver = new MazeSolve(labyrinth);

        if (solver.traverse())
            System.out.println("The maze was successfully traversed!");
        else
            System.out.println("There is no possible path.");

        System.out.println(labyrinth);
    }
}
