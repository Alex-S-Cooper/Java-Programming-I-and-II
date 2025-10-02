package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class NotifierApplication extends Application {

    public void start(javafx.stage.Stage window) {
        VBox components = new VBox();

        TextField textBox = new TextField();
        Button button = new Button("Update");
        Label label = new Label();

        components.getChildren().addAll(textBox, button, label);

        button.setOnAction((event) -> {
            label.setText(textBox.getText());
        });

        Scene view = new Scene(components);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
