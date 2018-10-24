import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MapRenderer {
    public static final int tileWidth = 32,tileHeight =32;
    public static final int mapWidth = 4, mapHeight = 4;
    public static int[][] map = {{0,0,0,0},
            {0,1,1,0},
            {1,1,1,1},
            {0,0,0,1}};
    public static void draw(GraphicsContext gc){
        for(int x = 0;x<mapWidth;x++){
            for(int y = 0;y<mapHeight;y++){
                switch(map[y][x]){
                    case 0:
                        gc.setFill(Color.WHEAT);
                        break;
                    case 1:
                        gc.setFill(Color.BLUE);
                        break;

                }
                gc.fillRect(x*tileWidth,y*tileHeight,tileWidth,tileHeight);
            }
        }
    }

}
