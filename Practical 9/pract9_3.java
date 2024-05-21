package application;

import java.io.File;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

public class pract9_3 extends Application {
    private TextField tfAnimationSpeed = new TextField();
    private TextField tfImagePrefix = new TextField();
    private TextField tfNumberOfImages = new TextField();
    private TextField tfAudioFileURL = new TextField();
    private ImageView imageView = new ImageView();
    private MediaPlayer mediaPlayer;
    private int currentIndex = 0;

    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        root.setPrefSize(600, 400);

        Label lblAnimationSpeed = new Label("Animation Speed (ms):");
        Label lblImagePrefix = new Label("Image File Prefix:");
        Label lblNumberOfImages = new Label("Number of Images:");
        Label lblAudioFileURL = new Label("Audio File URL:");

        tfAnimationSpeed.setPromptText("Animation speed in ms");
        tfImagePrefix.setPromptText("Image file prefix");
        tfNumberOfImages.setPromptText("Number of images");
        tfAudioFileURL.setPromptText("Audio file URL");

        VBox inputFields = new VBox(10);
        inputFields.setAlignment(Pos.CENTER_LEFT);
        inputFields.getChildren().addAll(
            new HBox(10, lblAnimationSpeed, tfAnimationSpeed),
            new HBox(10, lblImagePrefix, tfImagePrefix),
            new HBox(10, lblNumberOfImages, tfNumberOfImages),
            new HBox(10, lblAudioFileURL, tfAudioFileURL)
        );

        Button btnStartAnimation = new Button("Start Animation");
        btnStartAnimation.setOnAction(e -> startAnimation());

        HBox topRightBox = new HBox();
        topRightBox.getChildren().add(btnStartAnimation);
        topRightBox.setAlignment(Pos.TOP_RIGHT);
        root.setTop(topRightBox);

        root.setCenter(imageView);
        root.setBottom(inputFields);
        root.setPadding(new Insets(20));

        Scene scene = new Scene(root);
        primaryStage.setTitle("Image Animation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void startAnimation() {
        int animationSpeed = Integer.parseInt(tfAnimationSpeed.getText());
        String imagePrefix = tfImagePrefix.getText();
        int numberOfImages = Integer.parseInt(tfNumberOfImages.getText());
        String path = tfAudioFileURL.getText().toString();
        
        //create file path to \ to \\
        String[] splitParts = path.split("\\\\");

        StringBuilder concatenatedPath = new StringBuilder();
        for (String part : splitParts) {
            concatenatedPath.append(part).append("\\\\");
        }

        String finalPath = concatenatedPath.toString().replaceAll("\\\\\\\\$", "");
        //

        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
        Media media = new Media(new File(finalPath).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        mediaPlayer.setAutoPlay(true);
        mediaPlayer.play();

        javafx.animation.Timeline timeline = new javafx.animation.Timeline(
            new javafx.animation.KeyFrame(Duration.millis(animationSpeed), e -> updateImage(imagePrefix, numberOfImages))
        );
        timeline.setCycleCount(javafx.animation.Animation.INDEFINITE);
        timeline.play();
    }

    private void updateImage(String prefix, int count) {
        currentIndex = (currentIndex + 1) % count;
        Image image = new Image(getClass().getResourceAsStream("/image/" + prefix + (currentIndex + 1) + ".gif"));
        imageView.setImage(image);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
