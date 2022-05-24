public class Map {
    //Snake object
    //obstacle coordinates
    //apple location
    private Snake snake;
    private Obstacles obstacles;
    private Coordinates appleCordinates;
    private String[][] map;

    //map constructor(  )
    public Map(int height, int width) {
        map = new String[height][width];
        for (int r = 0; r < height; r++) {
            if (r == 0 || r == height - 1) {
                for (int c = 0; c < width; c++) {
                    map[r][c] = "*";
                }
            } else {
                for (int c = 0; c < width; c++) {
                    if (c == 0 || c == width - 1) {
                        map[r][c] = "*";
                    } else {
                        map[r][c] = " ";
                    }
                }
            }
        }
    }

    public void displayMap() {
        for (int r = 0; r < map.length; r++) {
            for (int c = 0; c < map[r].length; c++) {
                System.out.print(map[r][c] + " ");
            }
            System.out.println();
        }
    }
}
