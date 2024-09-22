import java.util.Stack;

public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    Stack<Pair> stack = new Stack<>();
    int counter = 1;
    
    /**
     * Flood fill, starting with the given row and column.
    */
    public void floodfill(int row, int column)
    {
        stack.push(new Pair(row, column));
        Pair pair = stack.pop();
        if(pixels[pair.row][pair.column] == 0)
        {
            pixels[pair.row][pair.column] = counter++;
            floodfill(pair.row, Math.max(0, pair.column - 1));
            floodfill(Math.min(9, pair.row + 1), pair.column);
            floodfill(pair.row, Math.min(9, pair.column + 1));
            floodfill(Math.max(0, pair.row - 1), pair.column);
        }
    }

    @Override
    public String toString()
    {
        String r = "";
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
                r = r + String.format("%4d", pixels[i][j]);
            r = r + "\n";
        }
        return r;
    }
}
