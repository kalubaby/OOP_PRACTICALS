package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class DynamicTextFormatting extends Application {

    private Label textLabel;
    private ComboBox<String> fontFamilyComboBox;
    private ComboBox<Integer> fontSizeComboBox;
    private CheckBox boldCheckBox;
    private CheckBox italicCheckBox;

 
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(20));

        fontFamilyComboBox = new ComboBox<>(FXCollections.observableArrayList(Font.getFamilies()));
        fontFamilyComboBox.setValue("Arial");
        fontFamilyComboBox.setOnAction(event -> updateFont());

        fontSizeComboBox = new ComboBox<>(FXCollections.observableArrayList(
                8, 9, 10, 11, 12, 14, 16, 18, 20,
                22, 24, 26, 28, 30, 32, 34, 36,
                38, 40, 42, 44, 46, 48, 50, 52,
                54, 56, 58, 60, 62, 64, 66, 68,
                70, 72, 74, 76, 78, 80, 82, 84,
                86, 88, 90, 92, 94, 96, 98, 100
        ));
        fontSizeComboBox.setValue(12);
        fontSizeComboBox.setOnAction(event -> updateFont());

        Label fontFamilyLabel = new Label("Font family:");
        Label fontSizeLabel = new Label("Font size:");

        HBox fontControls = new HBox(10);
        fontControls.getChildren().addAll(fontFamilyLabel, fontFamilyComboBox, fontSizeLabel, fontSizeComboBox);
        fontControls.setPadding(new Insets(10));
        fontControls.setAlignment(javafx.geometry.Pos.TOP_LEFT);

        textLabel = new Label("Programming is fun");
        textLabel.setFont(Font.font(fontFamilyComboBox.getValue(), fontSizeComboBox.getValue()));
        VBox centerBox = new VBox();
        centerBox.getChildren().add(textLabel);
        centerBox.setAlignment(javafx.geometry.Pos.CENTER);

        boldCheckBox = new CheckBox("Bold");
        boldCheckBox.setOnAction(event -> updateFont());
        italicCheckBox = new CheckBox("Italic");
        italicCheckBox.setOnAction(event -> updateFont());

        HBox checkBoxes = new HBox(10);
        checkBoxes.getChildren().addAll(boldCheckBox, italicCheckBox);
        checkBoxes.setAlignment(javafx.geometry.Pos.BOTTOM_LEFT);

        root.setTop(fontControls);
        root.setCenter(centerBox);
        root.setBottom(checkBoxes);

        Scene scene = new Scene(root, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Dynamic Text Formatting");
        primaryStage.show();
    }

    private void updateFont() {
        String fontFamily = fontFamilyComboBox.getValue();
        int fontSize = fontSizeComboBox.getValue();

        FontWeight fontWeight = boldCheckBox.isSelected() ? FontWeight.BOLD : FontWeight.NORMAL;
        FontPosture fontPosture = italicCheckBox.isSelected() ? FontPosture.ITALIC : FontPosture.REGULAR;

        Font font = Font.font(fontFamily, fontWeight, fontPosture, fontSize);
        textLabel.setFont(font);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
