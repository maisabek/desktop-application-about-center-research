
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
public class healthrequest extends Application {
    private ObservableList<person5> data;            
    private TableView table = new TableView();            
    public static void main(String[] args) {               
        launch(args);
    }  
    public void buildData(){ 
        Stage x;
        TableColumn Col1 = new TableColumn("Medecine_Name");
        TableColumn Col2 = new TableColumn("Side_Effects");                       
        data = FXCollections.observableArrayList();
                    try{
        Connection connection = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/dp"+"?useUnicode=true&characterEncoding=utf-8", "root", "");
        Statement statement=connection.createStatement();         
        ResultSet rs = statement.executeQuery(" SELECT * from healthrequest");                       
        while (rs.next()){
        data.add(new person5 (rs.getString("Medecine_Name"), rs.getString("Side_Effects")));
        }connection.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,ex);
        }  
        Col1.setCellValueFactory(new PropertyValueFactory<>("Medecine_Name"));
        Col2.setCellValueFactory(new PropertyValueFactory<>("Side_Effects"));
        table.getColumns().addAll(Col1, Col2); 
        table.setItems(data);
        Button view=new Button("view request");
        Button response=new Button("send response");
        view.setStyle("-fx-font-size:14");
        response.setStyle("-fx-font-size:14");
        ImageView t=new ImageView("z8.png");
        Button b=new Button("",t);
           t.setFitWidth(17);
          t.setFitHeight(17);
        b.setStyle("-fx-font-size:14");
       HBox hbox1=new HBox();
       hbox1.getChildren().addAll(view,response,b);
        BorderPane n=new BorderPane();
        n.setCenter(table);
        n.setTop(hbox1);
        Scene scene = new Scene(n,1300,750);
        Stage newWindow = new Stage();
        newWindow.setTitle("view for Doctor");
        newWindow.setScene(scene);
        newWindow.show();
        x=newWindow;
response.setOnAction(new EventHandler<ActionEvent>(){
    Stage s;
                    public void handle(ActionEvent t) {
                   HBox hbox=new HBox();
                   ImageView i4=new ImageView("home2.JPG");
                   Button buttonhome=new Button("Home",i4);
                   ImageView i3=new ImageView("logout1.JPG");
                   Button buttonlogout=new Button("Logout",i3);
                   hbox.getChildren().addAll(buttonhome,buttonlogout);
                  BorderPane borderpane=new BorderPane();
                  borderpane.setTop(hbox);
                  Label medecinename=new Label("Medecine Name");
                  TextField textmedecine=new TextField();
                  Label result=new Label("Result");
                  TextField textresult=new TextField();
                  Label descrption=new Label("Description");
                  TextField description=new TextField();
                  Button send=new Button("Send Responce");
                  Button cancel=new Button("Cancel");
                  send.setTextFill(Color.WHITE);
                  cancel.setTextFill(Color.WHITE);
                  medecinename.setTextFill(Color.BLUE);
                  result.setTextFill(Color.BLUE);
                  descrption.setTextFill(Color.BLUE);
                  medecinename.setStyle("-fx-font-size:16");
                  result.setStyle("-fx-font-size:16");
                  descrption.setStyle("-fx-font-size:16");
                   send.setStyle("-fx-font-size:16");
                  cancel.setStyle("-fx-font-size:16");
                  send.setStyle("-fx-background-color: BLUE");
                  cancel.setStyle("-fx-background-color: BLUE");
                   GridPane gridpane=new GridPane();
                   gridpane.setAlignment(Pos.TOP_CENTER);
                     gridpane.setVgap(13);
                     gridpane.setHgap(13);
                     gridpane.add(medecinename, 0, 15);
                     gridpane.add(textmedecine, 1, 15);
                     gridpane.add(result, 0, 16);
                     gridpane.add(textresult, 1, 16);
                     gridpane.add(descrption, 0, 17);
                     gridpane.add(description, 1, 17);
                     gridpane.add(send, 0, 18);
                     gridpane.add(cancel, 1, 18);
                     BorderPane borderpane1=new BorderPane();
                     borderpane1.setCenter(gridpane);
                   borderpane1.setStyle(" -fx-background-image: url(\"g.jpg\");-fx-background-size: 1300 750;");
                  Scene secondScene = new Scene(borderpane1, 1300, 750,Color.BEIGE);
                  Stage newWindow = new Stage();
                  newWindow.setTitle("view for request");
                  newWindow.setScene(secondScene);
                  newWindow.show();  
                  s=newWindow;
send.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(ActionEvent t) {
                    Connection con;
                   String s1=textmedecine.getText();
                   String s2=textresult.getText();
                   String s3=description.getText();          
                   try {
                  con= (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/dp"+"?useUnicode=true&characterEncoding=utf-8", "root", "");
                  Statement stm=con.createStatement();
                  stm.executeUpdate("insert into sendresponce values('"+s1+"','"+s2+"','"+s3+"');");
                  JOptionPane.showMessageDialog(null,"Inserted Successfully!");
                  s.close();
                  x.close();
                  con.close();
                  }catch (SQLException ex) {
                  ex.getMessage();}
                    }});
cancel.setOnAction(new EventHandler<ActionEvent>() {
                  public void handle(ActionEvent event) {
                   s.close();
                   x.close();
                   }});
                    }});

b.setOnAction(new EventHandler<ActionEvent>() {
                  public void handle(ActionEvent event) {               
                   x.close();
                   }});
    }
      public void start(Stage stage) throws Exception {   
    }}
