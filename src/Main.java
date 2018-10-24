import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args){
        launch(args);
    }
    public static void render(GraphicsContext gc){
        gc.clearRect(0,0,300,300);
        gc.setFill(Color.WHEAT);
        MapRenderer.draw(gc);

    }
    public static void update(){

    }
    public static void loop(GraphicsContext gc){
        update();
        render(gc);

    }
    public void start(Stage stage){
        stage.setTitle("Bartender Game");
        Group root = new Group();
        Canvas canvas = new Canvas(300, 250);
        final GraphicsContext gc = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);
        stage.setScene(new Scene(root));
        stage.show();

        final AnimationTimer mainLoop = new AnimationTimer() {
            @Override
            public void handle(long now) {
                loop(gc);
            }
        };
        mainLoop.start();
    }


}
