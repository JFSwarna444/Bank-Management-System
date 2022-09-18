package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root1 = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("LoginForm.fxml")));
        //Parent root1 = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("SignUpForm.fxml")));
        Parent root2 = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Admin.fxml")));
        Parent root3 = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Payment.fxml")));
        Parent root4 = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Withdraw.fxml")));

        primaryStage.setTitle("Login");
        primaryStage.setTitle("Admin");
        primaryStage.setTitle("Payment");
        primaryStage.setTitle("Withdraw");
        //primaryStage.setScene(new Scene(root1));
        primaryStage.setScene(new Scene(root2));
        primaryStage.setScene(new Scene(root3));
        primaryStage.setScene(new Scene(root4));
        primaryStage.setResizable(true);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
