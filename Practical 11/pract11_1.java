package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Collections;
import java.util.LinkedList;

public class pract11_1 extends Application {
    private LinkedList<Integer> numberList = new LinkedList<>();
    private TextArea numbersDisplay = new TextArea();
    private TextField numberInput;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        Label numberInputLabel = new Label("Enter a number:");
        numberInputLabel.setPadding(new Insets(2,10,0,0));
        numberInput = new TextField();
        numberInput.setPromptText("Enter a number");

        Button addButton = new Button("Add");
        addButton.setOnAction(e -> addNumber(numberInput.getText()));

        Button sortButton = new Button("Sort");
        sortButton.setOnAction(e -> sortList());

        Button shuffleButton = new Button("Shuffle");
        shuffleButton.setOnAction(e -> shuffleList());

        Button reverseButton = new Button("Reverse");
        reverseButton.setOnAction(e -> reverseList());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(new HBox(numberInputLabel, numberInput), numbersDisplay, new HBox(10, addButton, sortButton, shuffleButton, reverseButton));
        layout.setPadding(new Insets(20));
        primaryStage.setScene(new Scene(layout, 300, 250));
        primaryStage.show();
    }

    private void addNumber(String text) {
        try {
            int number = Integer.parseInt(text);
            if (!numberList.contains(number)) {
                numberList.add(number);
                numbersDisplay.setText(numberList.toString());
                numberInput.clear();
                numberInput.requestFocus();
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }

    private void sortList() {
        Collections.sort(numberList);
        numbersDisplay.setText(numberList.toString());
    }

    private void shuffleList() {
        Collections.shuffle(numberList);
        numbersDisplay.setText(numberList.toString());
    }

    private void reverseList() {
        Collections.reverse(numberList);
        numbersDisplay.setText(numberList.toString());
    }
}
