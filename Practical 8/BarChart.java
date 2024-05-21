package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class BarChart extends Application{

	public void start(Stage stage) throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root,400,300);
		
		int[] pr = {50, 25, 75, 100};
		String[] text = {"Project--20%", "Quiz--10%", "Midterm--30%", "Final--40%"};
		
		for(int i = 0; i<pr.length; i++) {
			Rectangle rec = new Rectangle();
			rec.setWidth(80);
			rec.setHeight(pr[i]);
			
			Text t = new Text();
			t.setText(text[i]);
			t.setFill(Color.BLACK);
			Color color;
            switch (i) {
                case 0:
                    color = Color.RED;
                    break;
                case 1:
                    color = Color.BLUE;
                    break;
                case 2:
                    color = Color.GREEN;
                    break;
                case 3:
                    color = Color.ORANGE;
                    break;
                default:
                    color = Color.BLACK;
            }
            rec.setFill(color);
			
			rec.setX(30+i*90);
			rec.setY(((scene.getHeight()/2)-pr[i])+100);
			t.setX(30+i*90);
			t.setY(((scene.getHeight()/2)-pr[i]-10)+100);
			
			root.getChildren().add(rec);
			root.getChildren().add(t);
		}
		stage.setTitle("Pr8 Ex2");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}
}
