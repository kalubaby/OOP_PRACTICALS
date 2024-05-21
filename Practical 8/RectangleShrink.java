package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RectangleShrink extends Application {

    
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Rectanguloid Display");
        primaryStage.setScene(scene);
        primaryStage.show();

        Rectangle rec1 = new Rectangle();
        rec1.setFill(Color.TRANSPARENT);
        rec1.setStroke(Color.BLACK);
        rec1.xProperty().bind(pane.widthProperty().divide(4).subtract(25));
        rec1.yProperty().bind(pane.heightProperty().divide(4).add(25));
        rec1.widthProperty().bind(pane.widthProperty().divide(2));
        rec1.heightProperty().bind(pane.widthProperty().divide(2));

        Rectangle rec2 = new Rectangle();
        rec2.setFill(Color.TRANSPARENT);
        rec2.setStroke(Color.BLACK);
        rec2.xProperty().bind(pane.widthProperty().divide(4).add(25));
        rec2.yProperty().bind(pane.heightProperty().divide(4).subtract(25));
        rec2.widthProperty().bind(pane.widthProperty().divide(2));
        rec2.heightProperty().bind(pane.widthProperty().divide(2));

        Line line1 = new Line();
        line1.startXProperty().bind(rec1.xProperty());
        line1.startYProperty().bind(rec1.yProperty());
        line1.endXProperty().bind(rec2.xProperty());
        line1.endYProperty().bind(rec2.yProperty());

        Line line2 = new Line();
        line2.startXProperty().bind(rec1.xProperty());
        line2.startYProperty().bind(rec1.yProperty().add(rec1.heightProperty()));
        line2.endXProperty().bind(rec2.xProperty());
        line2.endYProperty().bind(rec2.yProperty().add(rec1.heightProperty()));

        Line line3 = new Line();
        line3.startXProperty().bind(rec1.xProperty().add(rec1.widthProperty()));
        line3.startYProperty().bind(rec1.yProperty().add(rec1.heightProperty()));
        line3.endXProperty().bind(rec2.xProperty().add(rec1.widthProperty()));
        line3.endYProperty().bind(rec2.yProperty().add(rec1.heightProperty()));

        Line line4 = new Line();
        line4.startXProperty().bind(rec1.xProperty().add(rec1.widthProperty()));
        line4.startYProperty().bind(rec1.yProperty());
        line4.endXProperty().bind(rec2.xProperty().add(rec1.widthProperty()));
        line4.endYProperty().bind(rec2.yProperty());

        pane.getChildren().addAll(rec1, rec2, line1, line2, line3, line4);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

