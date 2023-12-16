import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.EventHandler;

public class LoginApp extends Application 
{
    public void start(Stage primaryStage) 
    {
        TextField username = new TextField();
        PasswordField password = new PasswordField();
        Button signIn = new Button("Sign in");
        Label message = new Label();
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.add(username, 1, 1);
        gridPane.add(password, 1, 2);
        gridPane.add(signIn, 1, 3);
        gridPane.add(message, 1, 4);
        signIn.setOnAction(new EventHandler<ActionEvent>() 
        {
            public void handle(ActionEvent event) 
            {
                String uname = username.getText();
                String pwd = password.getText();
                message.setText("Welcome " + uname);
            }
        });
        Scene scene = new Scene(gridPane, 300, 200);
        primaryStage.setTitle("Login App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args)
     {
        launch(args);
    }
}
