package title;

import javafx.application.Application;
import javafx.stage.Stage;


public class UserTitle extends Application{

    public void start(Stage window) {
        Parameters params = getParameters();

        String input = params.getNamed().get("input");
        window.setTitle(input);
        window.show();
    }

}
