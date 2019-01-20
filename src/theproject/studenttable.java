package theproject;
import java.awt.Font;
import java.awt.Insets;
import java.sql.Connection;
import java.sql.DriverManager;
import static java.sql.DriverManager.println;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;
import javax.swing.JOptionPane;
public class studenttable extends Application {
    private ObservableList<person1> data;            
    private TableView table = new TableView();            
    public static void main(String[] args) {               
        launch(args);
    }  
    public void buildData(){ 
        TableColumn Col1 = new TableColumn("Student_ID");
        TableColumn Col2 = new TableColumn("First_Name");        
        TableColumn Col3 = new TableColumn("Last_Name");                
        TableColumn Col4 = new TableColumn("Email_Address");
        TableColumn Col5 = new TableColumn("Degree");      
        TableColumn Col7 = new TableColumn("Age");                
        TableColumn Col8 = new TableColumn("Gender");
        TableColumn Col9 = new TableColumn("Date");  
         TableColumn Col6 = new TableColumn("cource_number");  
        TableColumn Col10 = new TableColumn("cource_name");
        data = FXCollections.observableArrayList();
                    try{
        Connection connection = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/dp"+"?useUnicode=true&characterEncoding=utf-8", "root", "");
        Statement statement=connection.createStatement();         
        ResultSet rs = statement.executeQuery(" SELECT * from student");                       
        while (rs.next()){
        data.add(new person1 (rs.getString("Student_ID"), rs.getString("First_Name"),rs.getString("Last_Name"),rs.getString("Email_Address"),rs.getString("degree"),rs.getString("Age"),rs.getString("Gender"),rs.getString("Date"), rs.getString("cource_number"),rs.getString("cource_name")));
        }connection.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,ex);
        }  
        Col1.setCellValueFactory(new PropertyValueFactory<>("Student_ID"));
        Col2.setCellValueFactory(new PropertyValueFactory<>("First_Name"));
        Col3.setCellValueFactory(new PropertyValueFactory<>("Last_Name"));
        Col4.setCellValueFactory(new PropertyValueFactory<>("Email_Address"));
        Col5.setCellValueFactory(new PropertyValueFactory<>("degree"));
        Col7.setCellValueFactory(new PropertyValueFactory<>("Age"));
        Col8.setCellValueFactory(new PropertyValueFactory<>("Gender"));
        Col9.setCellValueFactory(new PropertyValueFactory<>("Date"));
        Col6.setCellValueFactory(new PropertyValueFactory<>("Cource_Number"));
        Col10.setCellValueFactory(new PropertyValueFactory<>("Cource_Name"));
        table.getColumns().addAll(Col1, Col2, Col3,Col4,Col5,Col7,Col8,Col9,Col6,Col10); 
        table.setItems(data);
        Scene scene = new Scene(table,1300,750);
        Stage newWindow = new Stage();
        newWindow.setTitle("view for Doctor");
        newWindow.setScene(scene);
        newWindow.show();
    }
      public void start(Stage stage) throws Exception {   

    }}
