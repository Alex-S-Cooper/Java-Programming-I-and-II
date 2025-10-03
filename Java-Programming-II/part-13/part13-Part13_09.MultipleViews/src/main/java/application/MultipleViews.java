package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MultipleViews extends Application {

    public void start(Stage window) {
        BorderPane layoutOne = new BorderPane();
        VBox layoutTwo = new VBox();
        GridPane layoutThree = new GridPane();

        Scene firstView = new Scene(layoutOne, 300, 200);
        Scene secondView = new Scene(layoutTwo, 300, 200);
        Scene thirdView = new Scene(layoutThree, 300, 200);

        Button buttonToPageTwo = new Button("To the second view!");
        Button buttonToPageThree = new Button("To the third view!");
        Button buttonToPageOne = new Button("To the first view!");
        Label pageOneLabel = new Label("First view!");
        Label pageTwoLabel = new Label("Second view!");
        Label pageThreeLabel = new Label("Third view!");

        layoutOne.setTop(pageOneLabel);
        layoutOne.setCenter(buttonToPageTwo);
        layoutTwo.getChildren().addAll(buttonToPageThree, pageTwoLabel);

        layoutThree.setConstraints(pageThreeLabel, 0, 0); 
        layoutThree.setConstraints(buttonToPageOne, 1, 1); 
        layoutThree.getChildren().addAll(pageThreeLabel, buttonToPageOne);

        buttonToPageTwo.setOnAction((event) -> { window.setScene(secondView); });
        buttonToPageThree.setOnAction((event) -> { window.setScene(thirdView); });
        buttonToPageOne.setOnAction((event) -> { window.setScene(firstView); });

        window.setScene(firstView);
        window.show();
    }


    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
