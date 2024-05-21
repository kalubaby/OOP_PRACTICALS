package application;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextMove extends Application {
    private static final int WINDOW_WIDTH = 600;
    private static final int WINDOW_HEIGHT = 200;
    private static final String TEXT_CONTENT = "Programming is fun using JavaFX";
    private static final int TEXT_SIZE = 24;

    private double textXPos = 0;
    private boolean isPaused = false;

    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);

        Text text = new Text(TEXT_CONTENT);
        text.setFont(Font.font(TEXT_SIZE));
        text.setY(WINDOW_HEIGHT / 2);

        root.getChildren().add(text);

        scene.setOnMousePressed(event -> isPaused = true);
        scene.setOnMouseReleased(event -> isPaused = false);

        AnimationTimer timer = new AnimationTimer() {

            public void handle(long now) {
                if (!isPaused) {
                    moveText(text);
                }
            }
        };
        timer.start();

        primaryStage.setScene(scene);
        primaryStage.setTitle("Moving Text");
        primaryStage.show();
    }

    private void moveText(Text text) {
        textXPos += 1; // Adjust the speed here
        if (textXPos > WINDOW_WIDTH) {
            textXPos = -text.getLayoutBounds().getWidth();
        }
        text.setX(textXPos);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
