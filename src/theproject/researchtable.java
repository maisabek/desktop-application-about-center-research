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
public class researchtable extends Application {
    private ObservableList<person3> data;            
    private TableView table = new TableView();            
    public static void main(String[] args) {               
        launch(args);
    }  
    public void buildData(){ 
        TableColumn Col1 = new TableColumn("Research_Id");
        TableColumn Col2 = new TableColumn("Research_Name");        
        TableColumn Col3 = new TableColumn("doctor_name");                
        TableColumn Col4 = new TableColumn("description");
        TableColumn Col5 = new TableColumn("result");      
        TableColumn Col7 = new TableColumn("Research_Duration");                
        data = FXCollections.observableArrayList();
                    try{
        Connection connection = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/dp"+"?useUnicode=true&characterEncoding=utf-8", "root", "");
        Statement statement=connection.createStatement();         
        ResultSet rs = statement.executeQuery(" SELECT * from research");                       
        while (rs.next()){
        data.add(new person3 (rs.getString("Research_Id"), rs.getString("Research_Name"),rs.getString("doctor_name"),rs.getString("description"),rs.getString("result"),rs.getString("Research_Duration")));
        }connection.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,ex);
        }  
        Col1.setCellValueFactory(new PropertyValueFactory<>("Research_Id"));
        Col2.setCellValueFactory(new PropertyValueFactory<>("Research_Name"));
        Col3.setCellValueFactory(new PropertyValueFactory<>("Doctor_Name"));
        Col4.setCellValueFactory(new PropertyValueFactory<>("Description"));
        Col5.setCellValueFactory(new PropertyValueFactory<>("Result"));
        Col7.setCellValueFactory(new PropertyValueFactory<>("Research_Duration"));
      
        table.getColumns().addAll(Col1, Col2, Col3,Col4,Col5,Col7); 
        table.setItems(data);
        Scene scene = new Scene(table,1300,750);
        Stage newWindow = new Stage();
        newWindow.setTitle("view for Doctor");
        newWindow.setScene(scene);
        newWindow.show();
    }
      public void start(Stage stage) throws Exception {   

    }}
