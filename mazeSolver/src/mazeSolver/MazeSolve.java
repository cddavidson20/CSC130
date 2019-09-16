package mazeSolver;

import java.util.*;

public class MazeSolve {
    private Maze maze;
    private Deque<Position> path = new LinkedList<Position>();
    private boolean solved = false;

    /**
     * Constuctor for solving the maze
     * @param maze adds the maze to the class
     */
    public MazeSolve(Maze maze) {
        this.maze = maze;
    }

    /**
     * Traverse the maze recursively to find valid paths
     * @return boolean that shows if the maze can be solved
     */
    public boolean traverse() {
        boolean done = false;
        Position pos = new Position();
        Deque<Position> stack = new LinkedList<Position>();
        stack.push(pos);

        while (!(done) && !stack.isEmpty()) {
            pos = stack.pop();
            maze.tryPosition(pos.getx(), pos.gety());
            if (pos.getx() == maze.getRows() - 1 && pos.gety() == maze.getColumns() - 1) {
                done = true;
            } else {
                push_new_pos(pos.getx() - 1, pos.gety(), stack);
                push_new_pos(pos.getx() + 1, pos.gety(), stack);
                push_new_pos(pos.getx(), pos.gety() - 1, stack);
                push_new_pos(pos.getx(), pos.gety() + 1, stack);
            }
        }
        return done;
    }

    /**
     * Push a new attempted move onto the stack
     * push a valid move onto the path
     * @param x represents x coordinate
     * @param y represents y coordinate
     * @param stack the working stack of moves within the grid
     */
    private void push_new_pos(int x, int y, Deque<Position> stack) {
        Position npos = new Position();
        npos.setx(x);
        npos.sety(y);
        if (maze.validPosition(x,y)) {
            stack.push(npos);
            path.push(npos);
        }
    }
}

