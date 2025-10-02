package textstatistics;

import java.util.Arrays;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;


public class TextStatisticsApplication extends Application {


    public void start(javafx.stage.Stage window) {
        BorderPane layout = new BorderPane();
        HBox bottomEdge = new HBox();

        TextArea textArea = new TextArea();
        Label labelOne = new Label("Letters: 0");
        Label labelTwo = new Label("Words: 0");
        Label labelThree = new Label("The longest word is:");

        layout.setBottom(bottomEdge);
        layout.setCenter(textArea);
        bottomEdge.setSpacing(10);
        bottomEdge.getChildren().add(labelOne);
        bottomEdge.getChildren().add(labelTwo);
        bottomEdge.getChildren().add(labelThree);


        //Events
        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                .sorted((s1, s2) -> s2.length() - s1.length())
                .findFirst()
                .get();

            labelOne.setText("Letters: " + String.valueOf(characters));
            labelTwo.setText("Words: " + String.valueOf(words));
            labelThree.setText("The longest word is: " + longest);

        });



        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();

    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
