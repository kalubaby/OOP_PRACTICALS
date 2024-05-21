package application;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Iterator;
import java.util.Random;

public class TextDisplay extends Application {

    
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 400, 400);
        Random random = new Random();
        
        String[] text = {"Java", "Java", "Java", "Java", "Java"};
        
        for (int i =0; i < text.length; i++) {
        	Text t = new Text();
        	t.setText(text[i]);
        	
        	Color color = Color.rgb(random.nextInt(255), random.nextInt(255), random.nextInt(255));
        	t.setFill(color);
        	
        	t.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        	
        	t.setX(50 + i * 70);
        	t.setY(scene.getHeight()/2);
        	t.setRotate(90);
        	root.getChildren().add(t);
		}

        primaryStage.setScene(scene);
        primaryStage.setTitle("Vertical Text Display");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
