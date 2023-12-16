import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MultiplicationTableApp extends Application 
{
    public void start(Stage primaryStage) 
    {
        primaryStage.setTitle("Multiplication Table");
        TextField tf1 = new TextField();
        tf1.setPromptText("Enter a number");
        Button b1 = new Button("Calculate");
        Label l1 = new Label();
        b1.setOnAction(new EventHandler<ActionEvent>() 
        {
            public void handle(ActionEvent event) 
            {
                try
                {
                    int num = Integer.parseInt(tf1.getText());
                    StringBuilder table = new StringBuilder();
                    for (int i = 1; i <= 10; i++) 
                    {
                        int result = num * i;
                        //if we used String instead of String builder then --table= table+num+" x "+i+" = "+result+"\n";
                        table.append(num).append(" x ").append(i).append(" = ").append(result).append("\n");
                    }
                    l1.setText(table.toString());
                } 
                catch (NumberFormatException ex) 
                {
                    l1.setText("Invalid input. Please enter a valid number.");
                }
            }
        });
        HBox root = new HBox();
        root.getChildren().addAll(tf1, b1, l1);
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) 
    {
        launch(args);
    }
}
