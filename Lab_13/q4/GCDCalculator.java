import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GCDCalculator extends Application 
{
    public void start(Stage primaryStage) 
    {
        Label input1 = new Label("Enter first positive integer:");
        Label input2 = new Label("Enter second positive integer:");
        TextField number1 = new TextField();
        TextField number2 = new TextField();
        Button calculate = new Button("Calculate GCD");
        Label result = new Label();
        calculate.setOnAction(new EventHandler<ActionEvent>() 
        {
            public void handle(ActionEvent event) 
            {
                try 
                {
                    int num1 = Integer.parseInt(number1.getText());
                    int num2 = Integer.parseInt(number2.getText());
                    int gcd = calculateGCD(num1, num2);
                    result.setText("Numbers: " + num1 + ", " + num2 + "\nGCD: " + gcd);
                } 
                catch (NumberFormatException e) 
                {
                    result.setText("Invalid input. Please enter positive integers.");
                }
            }
        });
        HBox hbox = new HBox();
        hbox.getChildren().addAll(input1, number1, input2, number2, calculate);
        HBox resultHBox = new HBox(result);
        //resultHBox.setStyle("-fx-padding: 20px; -fx-alignment: center;");
        VBox root = new VBox();
        root.getChildren().addAll(hbox, resultHBox);
        Scene scene = new Scene(root, 800, 200);
        primaryStage.setTitle("GCD Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private int calculateGCD(int a, int b)
     {
        while (b != 0) 
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) 
    {
        launch(args);
    }
}
