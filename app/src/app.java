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
       /* DataManager dataManager = DataManager.getInstance();

        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String fname = in.nextLine();

        System.out.print("Введите фамилию: ");
        String sname = in.nextLine();

        System.out.print("Введите отчество: ");
        String tname = in.nextLine();

        System.out.print("Введите адрес: ");
        String address = in.nextLine();

        System.out.print("Введите телефон: ");
        int tel = in.nextInt();

        User u = (new User.Builder())
                .setFname(fname)
                .setSname(sname)
                .setTname(tname)
                .setAddress(address)
                .setTel(tel)
                .build();

        dataManager.addUser(u); */

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
