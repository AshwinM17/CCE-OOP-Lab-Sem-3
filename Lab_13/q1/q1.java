import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
public class q1 extends Application 
{
    public void start(Stage primaryStage) 
    {
        Label label = new Label("Welcome to JavaFX programming");
        label.setTextFill(Color.MAGENTA);
        FlowPane root = new FlowPane();
        root.getChildren().add(label);
        root.setHgap(10);
        root.setVgap(10);
        Scene scene = new Scene(root, 500, 200);
        primaryStage.setTitle("This is the first JavaFX Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) 
    {
        launch(args);
    }
}
