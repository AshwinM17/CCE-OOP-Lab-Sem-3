import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
class employee
{
    String name;
    int empID;
    String designation;
    double basicpay,da,hra,lic,pf,netSalary;
    employee(String name,int empID,String designation,double basicpay)
    {
        this.name=name;
        this.empID=empID;
        this.designation=designation;
        this.basicpay=basicpay;
        hra=0.15*basicpay;
        da=0.4*basicpay;
        pf=0.12*basicpay;
    }
}
public class EmployeeJavafx extends Application{
    public void start(Stage primarystage) throws Exception
    {
        Label l=new Label("Enter details:");
        Label l0=new Label();
        VBox root=new VBox();
        VBox root2=new VBox();
        HBox par=new HBox();
        Label l1=new Label();
        Label l2=new Label();
        Label l3=new Label();
        Label l4=new Label();
        Label l5=new Label();
        Label l6=new Label();
        Label l7=new Label();
        
        TextField t1=new TextField("Name");
        TextField t2=new TextField("empID");
        TextField t3=new TextField("Designation");
        TextField t4=new TextField("Basic Pay");
        Button b1=new Button("Display");
        root2.getChildren().addAll(l0,l1,l2,l3,l4,l5,l6,l7);
        root.getChildren().addAll(l,t1,t2,t3,t4,b1);
        b1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event)
            {
                employee obj=new employee(t1.getText(),Integer.parseInt(t2.getText()),t3.getText(),Double.parseDouble(t4.getText()));
                l0.setText("Details:");
                l1.setText("name:"+obj.name);
                l2.setText("EmpId:"+obj.empID);
                l3.setText("Designation:"+obj.designation);
                l4.setText("Basic pay:"+obj.basicpay);
                l5.setText("HRA:"+obj.hra);
                l6.setText("DA:"+obj.da);
                l6.setText("PF:"+obj.pf);

            }
            
        });
        par.getChildren().addAll(root,root2);
        Scene sc=new Scene(par,300,400);
        primarystage.setTitle("Employee");
        primarystage.setScene(sc);
        primarystage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}