
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
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Callback;
import javax.swing.JOptionPane;
public class medecinecompany extends Application {
    private ObservableList<person7> data;            
    private TableView table = new TableView();            
    public static void main(String[] args) {               
        launch(args);
    }  
    public void buildData(){ 
        Stage w;
        TableColumn Col1 = new TableColumn("Medecine_Name");
        TableColumn Col2 = new TableColumn("Permit"); 
        data = FXCollections.observableArrayList();
                    try{
        Connection connection = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/dp"+"?useUnicode=true&characterEncoding=utf-8", "root", "");
        Statement statement=connection.createStatement();         
        ResultSet rs = statement.executeQuery(" SELECT * from medecinecompany");                       
        while (rs.next()){
        data.add(new person7 (rs.getString("Medecine_Name"), rs.getString("Permit")));
        }connection.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,ex);
        }  
        Col1.setCellValueFactory(new PropertyValueFactory<>("Medecine_Name"));
        Col2.setCellValueFactory(new PropertyValueFactory<>("Permit"));
        table.getColumns().addAll(Col1, Col2); 
        table.setItems(data);
        Button view=new Button("view response");
        Button request=new Button("send request");
        view.setStyle("-fx-font-size:16");
        request.setStyle("-fx-font-size:16");
        Scene scene = new Scene(table,1300,750);
        Stage newWindow = new Stage();
        newWindow.setTitle("view for Doctor");
        newWindow.setScene(scene);
        newWindow.show();

    }
      public void start(Stage stage) throws Exception {   

    }}
