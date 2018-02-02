import UI.UsersController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import manager.DataManager;
import model.User;
import java.util.Scanner;

public class app extends Application {
    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("UI//users.fxml"));
        primaryStage.setTitle("Личные данные");
        primaryStage.setScene(new Scene(root, 600, 420));
        primaryStage.show();
    }

}
