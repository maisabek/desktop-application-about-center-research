package theproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;
import sun.security.util.Password;
public class Theproject extends Application {
                   public void start(Stage primaryStage) {           
                   ImageView doc=new ImageView("doc.JPG");
                   ImageView mang=new ImageView("man.JPG");
                   ImageView client=new ImageView("clients.JPG");
                   Button buttonmanager = new Button("",mang);
                   Button buttondoctor = new Button("",doc);
                   Button buttonclient = new Button("",client);
                   buttonmanager.setTextFill(Color.BLUE);
                   buttondoctor.setTextFill(Color.BLUE);
                   buttonclient.setTextFill(Color.BLUE);
                   buttonmanager.setStyle("-fx-background-color: White");
                   buttondoctor.setStyle("-fx-background-color: White");
                   buttonclient.setStyle("-fx-background-color: White"); 
                   GridPane gridpane=new GridPane();
                   gridpane.setAlignment(Pos.CENTER);
                   gridpane.setHgap(12);
                   gridpane.setVgap(13);
                   gridpane.add(buttonmanager, 0, 2);
                   gridpane.add(buttondoctor, 4, 2);
                   gridpane.add(buttonclient, 8, 2);
                   BorderPane borderpane=new BorderPane();
                   borderpane.setCenter(gridpane);
buttonmanager.setOnAction(new EventHandler<ActionEvent>(){
                  Stage x1;
                  public void handle(ActionEvent event) {
                      ImageView man=new ImageView("man.JPG");
                      man.setFitHeight(55);
                      man.setFitWidth(55);
                   Label l = new Label("         Manager Login Here                                                                                          ",man);
                   l.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 30));
                   l.setTextAlignment(TextAlignment.RIGHT); l.setAlignment(Pos.TOP_CENTER);
                   l.setStyle("-fx-background-color: White");
                   l.setTextFill(Color.BLUE);
                  ImageView pass=new ImageView("pass.JPG");
                  ImageView uname=new ImageView("uname.JPG");
                  ImageView logout=new ImageView("logout.JPG");
                  Button buttonlogout=new Button("",logout);
                  final TextField textfeilduser = new TextField();
                  final PasswordField textfeildpass = new PasswordField();
                  Button buttonlogin = new Button("Login");
                  final Label lblMessage = new Label();
                  buttonlogin.setTextFill(Color.WHITE);
                  buttonlogin.setStyle("-fx-background-color: BLUE");
                  Label l1=new Label("Login Here");
                  GridPane gridpane=new GridPane();
                  gridpane.setAlignment(Pos.CENTER);
                  gridpane.setStyle("-fx-opacity:0.7;-fx-background-color:WHITE;");
                  gridpane.setHgap(12);
                  gridpane.setVgap(13);
                  gridpane.add(l1, 0, 0);
                  gridpane.add(uname, 0, 3);
                  gridpane.add(textfeilduser, 2, 3);
                  gridpane.add(pass, 0, 5);
                  gridpane.add(textfeildpass, 2, 5);
                  gridpane.add(buttonlogin, 2, 7);
                  gridpane.add(lblMessage, 2, 8);
                  gridpane.setMaxHeight(350);
                  gridpane.setMaxWidth(350);
                  BorderPane borderpane=new BorderPane();
                  borderpane.setCenter(gridpane);
                  borderpane.setTop(l);
                  borderpane.setRight(buttonlogout);
                  Scene secondScene = new Scene(borderpane, 1300, 750,Color.WHITE);  
                  borderpane.setStyle(" -fx-background-image: url(\"lll.jpg\");-fx-background-size: 1300 750;");                 
                  Stage newWindow = new Stage();
                  newWindow.setTitle("Login");
                  newWindow.setScene(secondScene);
                  newWindow.show();
                  x1=newWindow;
buttonlogout.setOnAction(new EventHandler<ActionEvent>() {
                 public void handle(ActionEvent event) {
                 x1.close();
                  }});
buttonlogin.setOnAction(new EventHandler<ActionEvent>() {
                  Stage x2;
                  public void handle(ActionEvent event) {
                      loginn g=new loginn();
                 if(g.managerlogin(textfeilduser, textfeildpass)){
                 ImageView mang=new ImageView("man.JPG");
                 mang.setFitWidth(55);
                 mang.setFitHeight(55);
                 ImageView logout1=new ImageView("logout.JPG");
                 ImageView doct=new ImageView("doc.JPG");
                 ImageView clients=new ImageView("clients.JPG");
                 ImageView research=new ImageView("research.JPG");
                 ImageView student=new ImageView("student.JPG");
                 Button buttonmanagerstudent=new Button("Student",student);
                 Button buttonlogout1=new Button("",logout1);
                 Button buttonmangerdoctor=new Button("Doctors",doct);
                 Button buttonmanagerclient=new Button("Clients",clients);
                 Button buttonmanagerresearch=new Button("Researchs",research);
                 GridPane gridpane=new GridPane();
                 gridpane.setAlignment(Pos.CENTER);
                 gridpane.setHgap(17);
                 gridpane.setVgap(17);
                 gridpane.add(buttonmangerdoctor, 1, 0); 
                 gridpane.add(buttonmanagerclient, 7, 0);
                 gridpane.add(buttonmanagerresearch, 1, 5);
                 gridpane.add(buttonmanagerstudent, 7, 5);        
                  Label l = new Label("                  Manager Portal                                                                                    ",mang);
                  l.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 40));
                  l.setTextAlignment(TextAlignment.RIGHT); l.setAlignment(Pos.TOP_CENTER);
                  l.setStyle("-fx-background-color: White");l.setTextFill(Color.GRAY);
                  BorderPane borderpane=new BorderPane();
                  borderpane.setCenter(gridpane);
                  borderpane.setRight(buttonlogout1);
                  borderpane.setTop(l);
                  Scene secondScene = new Scene(borderpane, 1300, 750,Color.gray(0, 0));
                  borderpane.setStyle(" -fx-background-image: url(\"z1.jpg\");-fx-background-size: 1300 750;");
                  Stage newWindow = new Stage();
                  newWindow.setTitle("Login");
                  newWindow.setScene(secondScene);
                  newWindow.show();
                  x2=newWindow;
                  buttonlogout1.setOnAction(new EventHandler<ActionEvent>() {
                  public void handle(ActionEvent event) {
                  x1.close();
                  x2.close();
                  }});
buttonmangerdoctor.setOnAction(new EventHandler<ActionEvent>() {
                  Stage x3;
                  public void handle(ActionEvent event) {
                 Button buttonadd=new Button("add Doctor");
                 Button buttondelete=new Button("Delet Doctor");
                 Button buttonupdate=new Button("update Doctor");
                 Button buttonsearch=new Button("search Doctor");
                 Button buttonview=new Button("view Doctors");
                 Button button=new Button("  Add  ");
                 ImageView logout1=new ImageView("logout1.JPG");
                 Button logout=new Button("logout",logout1);
                 ImageView home3=new ImageView("home2.JPG");
                  ImageView doc=new ImageView("doc.JPG");
                  doc.setFitHeight(55);
                  doc.setFitWidth(55);
                 Button home4=new Button("Home",home3);        
                 button.setStyle("-fx-font-size: 2em; ");  
                 ImageView i2=new ImageView("dd.JPG");
                  Label l = new Label("                ADD Doctor                                                                                                                     ",doc);
                  l.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 35));
                  l.setTextAlignment(TextAlignment.RIGHT); l.setAlignment(Pos.TOP_RIGHT);
                  l.setStyle("-fx-background-color: White");
                  l.setTextFill(Color.BLUE); 
                  HBox hbox=new HBox();
                  hbox.getChildren().addAll(buttonadd,buttonsearch,buttonupdate,buttondelete,buttonview);
                   HBox hbox1=new HBox();
                  Label labelId =new Label("Doctor ID  ");
                  TextField textfeildid=new TextField();
                  Label labelfname =new Label("First Name  ");
                  TextField textfeildfname=new TextField();
                  Label labellname =new Label("Last Name  ");
                  TextField textfeildlname=new TextField();
                  Label labelage =new Label("Age  ");
                  TextField textfeildage=new TextField();
                  Label labeldate =new Label("Date  ");
                  TextField textfeilddate=new TextField();
                  Label labelgender =new Label("Gender  ");
                   TextField textfeildEmail1=new TextField();
                  Label labelEmail =new Label("Email Address ");
                  TextField textfeildEmail=new TextField();
                  Label labelresearchtype =new Label("Researsh Name  ");
                  TextField textfeildresearchtype=new TextField();
                  Label labelsearchduration =new Label("Searsh Duration  ");
                  TextField textfeildsearchduration=new TextField();
                  Label labelPhone =new Label("Phone  ");
                  TextField textfeildphone=new TextField();
                  Label labelname =new Label("User_Name  ");
                  TextField textfeildname=new TextField();
                  Label labelpass =new Label("Password  ");
                  TextField textfeildpassword=new TextField();
                  labelfname.setTextFill(Color.BLUE);
                  labelId.setTextFill(Color.BLUE);
                  labellname.setTextFill(Color.BLUE);
                  labelage.setTextFill(Color.BLUE);
                  labelgender.setTextFill(Color.BLUE);
                  labelEmail.setTextFill(Color.BLUE);
                  labelresearchtype.setTextFill(Color.BLUE);
                  labelPhone.setTextFill(Color.BLUE);
                  labelsearchduration.setTextFill(Color.BLUE);
                  labeldate.setTextFill(Color.BLUE);
                  labelname.setTextFill(Color.BLUE);
                  labelpass.setTextFill(Color.BLUE);
                  labelfname.setStyle("-fx-font-size:19");
                  labeldate.setStyle("-fx-font-size:19");
                  labellname.setStyle("-fx-font-size:19");
                  labelEmail.setStyle("-fx-font-size:19");
                  labelId.setStyle("-fx-font-size:19");
                  labelage.setStyle("-fx-font-size:19");
                  labelgender.setStyle("-fx-font-size:19");
                  labelresearchtype.setStyle("-fx-font-size:19");
                  labelPhone.setStyle("-fx-font-size:19");
                  labelsearchduration.setStyle("-fx-font-size:19");
                  labelname.setStyle("-fx-font-size:19");
                  labelpass.setStyle("-fx-font-size:19");
                  GridPane gridpane=new GridPane();
                  gridpane.setAlignment(Pos.CENTER);
                  gridpane.setHgap(10);
                  gridpane.setVgap(12);
                  gridpane.add(labelId, 0, 0);
                  gridpane.add(textfeildid, 1, 0);
                  gridpane.add(button, 5, 0);
                  gridpane.add(i2, 16, 0);
                  gridpane.add(labelfname, 0, 2);
                  gridpane.add(textfeildfname, 1, 2);
                  gridpane.add(labellname, 4, 2);
                  gridpane.add(textfeildlname, 5, 2);
                  gridpane.add(labelEmail, 0, 4);
                  gridpane.add(textfeildEmail, 1, 4);
                  gridpane.add(labelresearchtype, 0, 6);
                  gridpane.add(textfeildresearchtype, 1, 6);
                  gridpane.add(labelsearchduration, 0, 8);
                  gridpane.add(textfeildsearchduration, 1, 8);
                  gridpane.add(labelage, 0, 10);
                  gridpane.add(textfeildage, 1, 10);
                  gridpane.add(labelgender, 4, 10);
                  gridpane.add(textfeildEmail1, 5, 10); 
                  gridpane.add(labeldate, 0, 12);
                  gridpane.add(textfeilddate, 1, 12);
                  gridpane.add(labelPhone, 0, 14);
                  gridpane.add(textfeildphone, 1, 14);
                  gridpane.add(labelname, 0, 16);
                  gridpane.add(textfeildname, 1, 16);
                  gridpane.add(labelpass, 0, 18);
                  gridpane.add(textfeildpassword, 1, 18);
                  HBox hbox2=new HBox();
                  hbox2.getChildren().addAll(home4,logout);
                  BorderPane borderpane1=new BorderPane();
                  borderpane1.setTop(l);
                  borderpane1.setCenter(gridpane);
                  borderpane1.setLeft(hbox);
                  borderpane1.setRight(hbox2);
                  Scene scene = new Scene(borderpane1, 1300, 750,Color.BEIGE);
                  borderpane1.setStyle(" -fx-background-image: url(\"password.JPG\");-fx-background-size: 1300 750;");
button.setOnAction(new EventHandler<ActionEvent>(){
                   public void handle(ActionEvent event) {
                   Connection con;
                   String s1=textfeildfname.getText();
                   String s2=textfeildlname.getText();
                   String s3=textfeildEmail.getText();
                   String s4=textfeildresearchtype.getText();
                   String s5=textfeildsearchduration.getText();
                   String s6=textfeildage.getText();
                   String s7=textfeildEmail1.getText();
                   String s8=textfeilddate.getText();
                   String s11=textfeildphone.getText();
                   String s12=textfeildname.getText();
                   String s13=textfeildpass.getText();
                   
                   try {
                  con= (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/dp"+"?useUnicode=true&characterEncoding=utf-8", "root", "");
                  Statement stm=con.createStatement();
                  stm.executeUpdate("insert into doctorr values(null,'"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s11+"','"+s12+"','"+s13+"');");
                  JOptionPane.showMessageDialog(null,"Inserted Successfully!");
                  con.close();
                  }catch (SQLException ex) {
                  ex.getMessage();}
                   }});
 buttonsearch.setOnAction(new EventHandler<ActionEvent>() {
                  Stage s1;
                  public void handle(ActionEvent event) {
                  ImageView i3=new ImageView("logout1.JPG");
                  ImageView i4=new ImageView("home2.JPG");
                  ImageView i2=new ImageView("dd.JPG");
                  ImageView doc=new ImageView("doc.JPG");
                  doc.setFitHeight(55);
                  doc.setFitWidth(55);                 
                  Label l = new Label("               Search Doctor                                                                                                                                                            ",doc);
                  l.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 35));
                  l.setTextAlignment(TextAlignment.RIGHT);  l.setAlignment(Pos.TOP_RIGHT);
                  l.setStyle("-fx-background-color: White");l.setTextFill(Color.BLUE); 
                  Button buttonsearch=new Button("Search"); 
                  Button buttonhome=new Button("Home",i4);
                  Button buttonlogout=new Button("Logout",i3);
                  Label labelId =new Label("Doctor ID  ");
                  TextField textfeildid=new TextField();
                  Label labelfname =new Label("First Name  ");
                  TextField textfeildfname=new TextField();
                  Label labellname =new Label("First Name  ");
                  TextField textfeildlname=new TextField();
                  Label labeldate =new Label("Date  ");
                  TextField textfeilddate=new TextField();
                  Label labelage =new Label("Age  ");
                  TextField textfeildage=new TextField();
                  Label labelgender =new Label("Gender  ");
                  TextField comboboxgender=new TextField();
                  Label labelEmail =new Label("Email Address ");
                  TextField textfeildEmail=new TextField();
                  Label labelresearchtype =new Label("Researsh Type  ");
                  TextField textfeildresearchtype=new TextField();
                  Label labelsearchduration =new Label("Searsh Duration  ");
                  TextField textfeildsearchduration=new TextField();
                  Label labelPhone =new Label("Phone  ");
                  TextField textfeildphone=new TextField();
                  Label labelcity =new Label("City  ");
                  TextField textfeildcity=new TextField();
                   Label labelname =new Label("User_Name  ");
                  TextField textfeildname=new TextField();
                  Label labelpass =new Label("Password  ");
                  TextField textfeildpassword=new TextField();
                  button.setStyle("-fx-font-size: 2em; ");
                  labelfname.setTextFill(Color.BLUE);
                  labelId.setTextFill(Color.BLUE);
                  labellname.setTextFill(Color.BLUE);
                  labelage.setTextFill(Color.BLUE);
                  labelgender.setTextFill(Color.BLUE);
                  labelEmail.setTextFill(Color.BLUE);
                  labelresearchtype.setTextFill(Color.BLUE);
                  labelPhone.setTextFill(Color.BLUE);
                  labelcity.setTextFill(Color.BLUE);
                  labelsearchduration.setTextFill(Color.BLUE);
                  buttonhome.setTextFill(Color.WHEAT);
                  buttonlogout.setTextFill(Color.BLUE);
                  buttonhome.setTextFill(Color.BLUE);
                  labelname.setTextFill(Color.BLUE);
                  labelpass.setTextFill(Color.BLUE);
                  labelfname.setStyle("-fx-font-size:19");
                  labeldate.setStyle("-fx-font-size:19");
                  labellname.setStyle("-fx-font-size:19");
                  labelEmail.setStyle("-fx-font-size:19");
                  labelId.setStyle("-fx-font-size:19");
                  labelage.setStyle("-fx-font-size:19");
                  labelgender.setStyle("-fx-font-size:19");
                  labelresearchtype.setStyle("-fx-font-size:19");
                  labelPhone.setStyle("-fx-font-size:19");
                  labelcity.setStyle("-fx-font-size:19");
                  labelsearchduration.setStyle("-fx-font-size:19");
                  labelname.setStyle("-fx-font-size:19");
                  labelpass.setStyle("-fx-font-size:19");
                  GridPane gridpane=new GridPane();
                  gridpane.setAlignment(Pos.CENTER);
                  gridpane.setHgap(10);
                  gridpane.setVgap(12);
                  gridpane.add(labelId, 0, 0);
                  gridpane.add(textfeildid, 1, 0);
                  gridpane.add(buttonsearch, 5, 0);
                  gridpane.add(i2, 16, 0);
                  gridpane.add(labelfname, 0, 2);
                  gridpane.add(textfeildfname, 1, 2);
                  gridpane.add(labellname, 4, 2);
                  gridpane.add(textfeildlname, 5, 2);
                  gridpane.add(labelEmail, 0, 4);
                  gridpane.add(textfeildEmail, 1, 4);
                  gridpane.add(labelresearchtype, 0, 6);
                  gridpane.add(textfeildresearchtype, 1, 6);
                  gridpane.add(labelsearchduration, 0, 8);
                  gridpane.add(textfeildsearchduration, 1, 8);
                  gridpane.add(labelage, 0, 10);
                  gridpane.add(textfeildage, 1, 10);
                  gridpane.add(labelgender, 4, 10);
                  gridpane.add(comboboxgender, 5, 10); 
                  gridpane.add(labeldate, 0, 12);
                  gridpane.add(textfeilddate, 1, 12);
                  gridpane.add(labelPhone, 0, 14);
                  gridpane.add(textfeildphone, 1, 14);
                  gridpane.add(labelname, 0, 16);
                  gridpane.add(textfeildname, 1, 16);
                  gridpane.add(labelpass, 0, 18);
                  gridpane.add(textfeildpassword, 1, 18);
                   HBox hbox1=new HBox();
                   hbox1.getChildren().addAll(buttonhome,buttonlogout);
                   BorderPane borderpane=new BorderPane();
                   borderpane.setCenter(gridpane);
                   borderpane.setRight(hbox1);
                   borderpane.setTop(l);
                   Scene secondScene = new Scene(borderpane, 1300, 750,Color.BEIGE);
                   borderpane.setStyle(" -fx-background-image: url(\"password.JPG\");-fx-background-size: 1300 750;");
                   Stage newWindow = new Stage();
                   newWindow.setTitle("Search for Doctor");
                   newWindow.setScene(secondScene);
                   newWindow.show();
                   s1=newWindow;
buttonhome.setOnAction(new EventHandler<ActionEvent>(){
                   public void handle(ActionEvent t) {
                   s1.close();
                    }});
buttonlogout.setOnAction(new EventHandler<ActionEvent>() {
                  public void handle(ActionEvent event) {
                  x1.close();
                  x3.close();
                  start(new Stage());
                  s1.close();
                  x2.close();
                  }});
 buttonsearch.setOnAction(new EventHandler<ActionEvent>(){
        public void handle(ActionEvent event) {
        try{
            Connection connection = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/dp"+"?useUnicode=true&characterEncoding=utf-8", "root", "");
            Statement statement=connection.createStatement();
            ResultSet resultset = statement.executeQuery("SELECT First_Name,Last_Name,"
            + "Email_Address ,Search_Name,Research_Duration,"
            + "Age,Gender,Date,Phone,User_Name,Password FROM doctorr where Doctor_Id ="+Double.parseDouble(textfeildid.getText()));
            while (resultset.next()){
            textfeildfname.setText(resultset.getString("First_Name"));textfeildlname.setText(resultset.getString("Last_Name"));
            textfeildEmail.setText(resultset.getString("Email_Address"));textfeildresearchtype.setText(resultset.getString("Search_Name"));
            textfeildsearchduration.setText(resultset.getString("Research_Duration"));textfeildage.setText(resultset.getString("Age"));
            comboboxgender.setText(resultset.getString("Gender"));textfeilddate.setText(resultset.getString("Date"));
            textfeildphone.setText(resultset.getString("Phone"));
            textfeildname.setText(resultset.getString("User_Name"));
            textfeildpass.setText(resultset.getString("Password"));
          }
            connection.close();
         } catch (SQLException ex) {
           System.out.println(ex.getMessage());
       }}});
      }});
buttondelete.setOnAction(new EventHandler<ActionEvent>() {
                   Stage s1;
                    public void handle(ActionEvent event) {  
                    ImageView i2=new ImageView("dd.JPG");
                    ImageView doc=new ImageView("doc.JPG");
                    doc.setFitHeight(55);
                    doc.setFitWidth(55);                    ImageView i3=new ImageView("logout1.JPG");
                    ImageView i4=new ImageView("home2.JPG");
                    Label l = new Label("                Delet Doctor                                                                                                                                       ",doc);
                     l.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 35));
                     l.setTextAlignment(TextAlignment.RIGHT);l.setAlignment(Pos.TOP_RIGHT);
                     l.setStyle("-fx-background-color: White"); l.setTextFill(Color.BLUE);
                     Button buttonhome=new Button("Home",i4);
                     Button buttonlogout=new Button("Logout",i3);
                     Button button=new Button("Search");
                     Button buttondelete=new Button("Delete");
                     Label labelId =new Label("Doctor ID  ");
                     TextField textfeildid=new TextField();
                     Label labelfname =new Label("First Name  ");
                     TextField textfeildfname=new TextField();
                     Label labellname =new Label("Last Name  ");
                     TextField textfeildlname=new TextField();
                     Label labelage =new Label("Age  ");
                     TextField textfeildage=new TextField();
                     Label labeldate =new Label("Date  ");
                     TextField textfeilddate=new TextField();
                     Label labelgender =new Label("Gender  ");
                     TextField comboboxgender=new TextField();
                     Label labelEmail =new Label("Email Address ");
                     TextField textfeildEmail=new TextField();
                     Label labelresearchtype =new Label("Researsh Type  ");
                     TextField textfeildresearchtype=new TextField();
                     Label labelsearchduration =new Label("Searsh Duration  ");
                     TextField textfeildsearchduration=new TextField();
                     Label labelPhone =new Label("Phone  ");
                     TextField textfeildphone=new TextField();
                     Label labelcity =new Label("City  ");
                     TextField textfeildcity=new TextField();
                     Label labelname =new Label("User_Name  ");
                     TextField textfeildname=new TextField();
                     Label labelpass =new Label("Password  ");
                     TextField textfeildpassword=new TextField();
                     buttondelete.setStyle("-fx-font-size: 2em; ");
                     labelfname.setTextFill(Color.BLUE);
                     labelId.setTextFill(Color.BLUE);
                     labellname.setTextFill(Color.BLUE);
                     labelage.setTextFill(Color.BLUE);
                     labelgender.setTextFill(Color.BLUE);
                     labelEmail.setTextFill(Color.BLUE);
                     labelresearchtype.setTextFill(Color.BLUE);
                     labelPhone.setTextFill(Color.BLUE);
                     labelcity.setTextFill(Color.BLUE);
                     labelsearchduration.setTextFill(Color.BLUE);
                     labeldate.setTextFill(Color.BLUE);
                     labelname.setTextFill(Color.BLUE);
                     labelpass.setTextFill(Color.BLUE);
                     labelfname.setStyle("-fx-font-size:19");
                     labeldate.setStyle("-fx-font-size:19");
                     labellname.setStyle("-fx-font-size:19");
                     labelEmail.setStyle("-fx-font-size:19");
                     labelId.setStyle("-fx-font-size:19");
                     labelage.setStyle("-fx-font-size:19");
                     labelgender.setStyle("-fx-font-size:19");
                     labelresearchtype.setStyle("-fx-font-size:19");
                     labelPhone.setStyle("-fx-font-size:19");
                     labelcity.setStyle("-fx-font-size:19");
                     labelsearchduration.setStyle("-fx-font-size:19");
                     labelname.setStyle("-fx-font-size:19");
                     labelpass.setStyle("-fx-font-size:19");
                     GridPane gridpane=new GridPane();
                     gridpane.setAlignment(Pos.CENTER);
                     gridpane.setHgap(10);
                     gridpane.setVgap(12);
                     gridpane.add(labelId, 0, 0);
                     gridpane.add(textfeildid, 1, 0);
                     gridpane.add(buttondelete, 5, 0);
                     gridpane.add(i2, 16, 0);
                     gridpane.add(labelfname, 0, 2);
                     gridpane.add(textfeildfname, 1, 2);
                     gridpane.add(labellname, 4, 2);
                     gridpane.add(textfeildlname, 5, 2);
                     gridpane.add(labelEmail, 0, 4);
                     gridpane.add(textfeildEmail, 1, 4);
                     gridpane.add(labelresearchtype, 0, 6);
                     gridpane.add(textfeildresearchtype, 1, 6);
                     gridpane.add(labelsearchduration, 0, 8);
                     gridpane.add(textfeildsearchduration, 1, 8);
                     gridpane.add(labelage, 0, 10);
                     gridpane.add(textfeildage, 1, 10);
                     gridpane.add(labelgender, 4, 10);
                     gridpane.add(comboboxgender, 5, 10); 
                     gridpane.add(labeldate, 0, 12);
                     gridpane.add(textfeilddate, 1, 12);
                     gridpane.add(labelPhone, 0, 14);
                     gridpane.add(textfeildphone, 1, 14);
                     gridpane.add(labelname, 0, 16);
                     gridpane.add(textfeildname, 1, 16);
                     gridpane.add(labelpass, 0, 18);
                     gridpane.add(textfeildpassword, 1, 18);
                     HBox hbox1=new HBox();
                     hbox1.getChildren().addAll(buttonhome,buttonlogout);
                     BorderPane borderpane=new BorderPane();
                     borderpane.setCenter(gridpane);
                     borderpane.setTop(l);
                     borderpane.setRight(hbox1); 
                     Scene secondScene = new Scene(borderpane, 1300, 750,Color.BEIGE);
                     borderpane.setStyle(" -fx-background-image: url(\"password.JPG\");-fx-background-size: 1300 750;");
                     Stage newWindow = new Stage();
                     newWindow.setTitle("Delete for Doctor");
                     newWindow.setScene(secondScene);
                     newWindow.show();
                     s1=newWindow;
buttonhome.setOnAction(new EventHandler<ActionEvent>(){
                     public void handle(ActionEvent t) {
                     s1.close();
                      }});
buttonlogout.setOnAction(new EventHandler<ActionEvent>() {
                   public void handle(ActionEvent event) {
                   x1.close();
                   x3.close();
                   start(new Stage());
                   s1.close();
                   x2.close();
                  }});
 buttondelete.setOnAction(new EventHandler<ActionEvent>(){
        public void handle(ActionEvent event) {
        try{
            Connection connection = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/dp"+"?useUnicode=true&characterEncoding=utf-8", "root", "");
            Statement statement=connection.createStatement();
            ResultSet resultset = statement.executeQuery("SELECT First_Name,Last_Name,"
            + "Email_Address ,Search_Name,Research_Duration,"
            + "Age,Gender,Date,Phone,User_Name,Password FROM doctorr where Doctor_Id ="+Double.parseDouble(textfeildid.getText()));
            while (resultset.next()){
            textfeildfname.setText(resultset.getString("First_Name"));textfeildlname.setText(resultset.getString("Last_Name"));
            textfeildEmail.setText(resultset.getString("Email_Address"));textfeildresearchtype.setText(resultset.getString("Search_Name"));
            textfeildsearchduration.setText(resultset.getString("Research_Duration"));textfeildage.setText(resultset.getString("Age"));
            comboboxgender.setText(resultset.getString("Gender"));textfeilddate.setText(resultset.getString("Date"));
            textfeildphone.setText(resultset.getString("Phone"));
            textfeildname.setText(resultset.getString("User_Name"));
            textfeildpass.setText(resultset.getString("Password"));
          }
            statement.executeUpdate("DELETE FROM `doctorr` WHERE doctor_id="+Double.parseDouble(textfeildid.getText()));
            connection.close();
         } catch (SQLException ex) {
           System.out.println(ex.getMessage());
       }}});
                    }});                    
buttonupdate.setOnAction(new EventHandler<ActionEvent>() {
                     Stage s1;
                     public void handle(ActionEvent event) {
                     ImageView i2=new ImageView("dd.JPG");
                     ImageView doc=new ImageView("doc.JPG");
                      doc.setFitHeight(55);
                      doc.setFitWidth(55);                     ImageView i3=new ImageView("logout1.JPG");
                     ImageView i4=new ImageView("home2.JPG");
                     Label l = new Label("           Update Doctor                                                                                                                                 ",doc);
                    l.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 35));
                    l.setTextAlignment(TextAlignment.RIGHT);  l.setAlignment(Pos.TOP_RIGHT);
                    l.setStyle("-fx-background-color: White"); l.setTextFill(Color.BLUE); 
                    Button buttonhome=new Button("Home",i4);
                    Button buttonlogout=new Button("Logout1",i3);
                    Button button=new Button("Search");
                    Button buttonupdate=new Button("Update");
                    Label labelId =new Label("Doctor ID  ");
                    TextField textfeildid=new TextField();
                    Label labelfname =new Label("First Name  ");
                    TextField textfeildfname=new TextField();
                    Label labellname =new Label("Last Name  ");
                    TextField textfeildlname=new TextField();
                    Label labeldate =new Label("Date  ");
                    TextField textfeilddate=new TextField();
                    Label labelage =new Label("Age  ");
                    TextField textfeildage=new TextField();
                    Label labelgender =new Label("Gender  ");
                    TextField comboboxgender=new TextField();
                    Label labelEmail =new Label("Email Address ");
                    TextField textfeildEmail=new TextField();
                    Label labelresearchtype =new Label("Researsh Type  ");
                    TextField textfeildresearchtype=new TextField();
                    Label labelsearchduration =new Label("Searsh Duration  ");
                    TextField textfeildsearchduration=new TextField();
                    Label labelPhone =new Label("Phone  ");
                    TextField textfeildcity=new TextField();
                    Label labelname =new Label("User_Name  ");
                    TextField textfeildname=new TextField();
                    Label labelpass =new Label("Password  ");
                    TextField textfeildpassword=new TextField();
                    buttonupdate.setStyle("-fx-font-size: 2em; ");
                    labelfname.setTextFill(Color.BLUE);
                    labelId.setTextFill(Color.BLUE);
                    labellname.setTextFill(Color.BLUE);
                    labelage.setTextFill(Color.BLUE);
                    labelgender.setTextFill(Color.BLUE);
                    labelEmail.setTextFill(Color.BLUE);
                    labelresearchtype.setTextFill(Color.BLUE);
                    labelPhone.setTextFill(Color.BLUE);
                    labelsearchduration.setTextFill(Color.BLUE);
                    labeldate.setTextFill(Color.BLUE);
                    labelname.setTextFill(Color.BLUE);
                    labelpass.setTextFill(Color.BLUE);
                    labelfname.setStyle("-fx-font-size:19");
                    labeldate.setStyle("-fx-font-size:19");
                    labellname.setStyle("-fx-font-size:19");
                    labelEmail.setStyle("-fx-font-size:19");
                    labelId.setStyle("-fx-font-size:19");
                    labelage.setStyle("-fx-font-size:19");
                    labelgender.setStyle("-fx-font-size:19");
                    labelresearchtype.setStyle("-fx-font-size:19");
                    labelPhone.setStyle("-fx-font-size:19");
                    labelsearchduration.setStyle("-fx-font-size:19");
                    labelname.setStyle("-fx-font-size:19");
                    labelpass.setStyle("-fx-font-size:19");
                     Button b=new Button("Search");
                    GridPane gridpane=new GridPane();
                    gridpane.setAlignment(Pos.CENTER);
                    gridpane.setHgap(10);
                    gridpane.setVgap(12);
                    gridpane.add(labelId, 0, 0);
                    gridpane.add(textfeildid, 1, 0);
                    gridpane.add(buttonupdate, 5, 0);
                    gridpane.add(b, 7, 0);
                    gridpane.add(i2, 16, 0);
                    gridpane.add(labelfname, 0, 2);
                    gridpane.add(textfeildfname, 1, 2);
                    gridpane.add(labellname, 4, 2);
                    gridpane.add(textfeildlname, 5, 2);
                    gridpane.add(labelEmail, 0, 4);
                    gridpane.add(textfeildEmail, 1, 4);
                    gridpane.add(labelresearchtype, 0, 6);
                    gridpane.add(textfeildresearchtype, 1, 6);
                    gridpane.add(labelsearchduration, 0, 8);
                    gridpane.add(textfeildsearchduration, 1, 8);
                    gridpane.add(labelage, 0, 10);
                    gridpane.add(textfeildage, 1, 10);
                    gridpane.add(labelgender, 4, 10);
                    gridpane.add(comboboxgender, 5, 10); 
                    gridpane.add(labeldate, 0, 12);
                    gridpane.add(textfeilddate, 1, 12);
                    gridpane.add(labelPhone, 0, 14);
                    gridpane.add(textfeildphone, 1, 14);
                    gridpane.add(labelname, 0, 16);
                    gridpane.add(textfeildname, 1, 16);
                    gridpane.add(labelpass, 0, 18);
                    gridpane.add(textfeildpassword, 1, 18);
                    HBox hbox1=new HBox();
                    hbox1.getChildren().addAll(buttonhome,buttonlogout);
                    BorderPane borderpane=new BorderPane();
                    borderpane.setCenter(gridpane);
                   borderpane.setRight(hbox1);
                   borderpane.setTop(l);
                   Scene secondScene = new Scene(borderpane, 1300, 750,Color.BEIGE);
                  borderpane.setStyle(" -fx-background-image: url(\"password.JPG\");-fx-background-size: 1300 750;");
                   Stage newWindow = new Stage();
                   newWindow.setTitle("Update for Doctor");
                   newWindow.setScene(secondScene);
                   newWindow.show();
                  s1=newWindow;
  b.setOnAction(new EventHandler<ActionEvent>(){
          public void handle(ActionEvent t) {
                  ResultSet resultset;
              try {
                  com.mysql.jdbc.Connection connection = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/dp","root","");
                    Statement statement=connection.createStatement();
                    resultset = statement.executeQuery("SELECT First_Name,Last_Name,"
                          + "Email_Address ,Search_Name,Research_Duration,"
                          + "Age,Gender,Date,Phone,User_Name,Passwrd FROM doctorr where Doctor_Id ="+Double.parseDouble(textfeildid.getText()));
                   while (resultset.next()){
                   textfeildfname.setText(resultset.getString("First_Name"));textfeildlname.setText(resultset.getString("Last_Name"));
                   textfeildEmail.setText(resultset.getString("Email_Address"));textfeildresearchtype.setText(resultset.getString("Search_Name"));
                   textfeildsearchduration.setText(resultset.getString("Research_Duration"));textfeildage.setText(resultset.getString("Age"));
                   comboboxgender.setText(resultset.getString("Gender"));textfeilddate.setText(resultset.getString("Date"));
                   textfeildphone.setText(resultset.getString("Phone"));
                    textfeildname.setText(resultset.getString("User_Name"));
                   textfeildpass.setText(resultset.getString("Password"));
                    }} catch (SQLException ex) {
                    Logger.getLogger(Theproject.class.getName()).log(Level.SEVERE, null, ex);
                    }}});
buttonupdate.setOnAction(new EventHandler<ActionEvent>(){
                  public void handle(ActionEvent t) {
                  try {
                  com.mysql.jdbc.Connection connection = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/dp","root","");
                  Statement statement=connection.createStatement();

                  statement.executeUpdate("UPDATE doctorr SET First_Name='"+textfeildfname.getText()
                  +"',Last_Name='"+textfeildlname.getText()+"',Email_Address='"+textfeildEmail.getText()
                  +"',Search_Name='"+textfeildresearchtype.getText()+"',Research_Duration='"+textfeildsearchduration.getText()
                  +"',Age='"+textfeildage.getText()+"',Gender='"+comboboxgender.getText()
                  +"',Phone='"+textfeilddate.getText()
                  +"' WHERE Doctor_Id="+Double.parseDouble(textfeildid.getText()));
                   connection.close();
                  } catch (SQLException ex) {
                  System.out.println(ex.getMessage());
                     }
                  }});
buttonlogout.setOnAction(new EventHandler<ActionEvent>() {
                  public void handle(ActionEvent event) {
                  x1.close();
                  start(new Stage());
                  s1.close();
                   x2.close();
                   x3.close();
                  }});
buttonhome.setOnAction(new EventHandler<ActionEvent>(){
                  public void handle(ActionEvent t) {
                  s1.close();
                  }});
                     }});    
buttonview.setOnAction(new EventHandler<ActionEvent>() {
                 Stage s1;
                  public void handle(ActionEvent event) {
                      doctortable t=new doctortable();
                      t.buildData();     
      }});              
                    primaryStage.setTitle("Doctor information");
                    primaryStage.setScene(scene);
                    primaryStage.show(); 
                    x3=primaryStage;
home4.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(ActionEvent t) {
                    x3.close();
                    }});
logout.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(ActionEvent event) {
                    x1.close();
                    start(new Stage());
                    x3.close();
                     x2.close();
                    }});}});      
buttonmanagerclient.setOnAction(new EventHandler<ActionEvent>() {
                   public void handle(ActionEvent event) {
                       Stage w;
                   Button b=new Button("logout");
                    b.setStyle("-fx-background-color: White"); b.setTextFill(Color.BLUE); 
                    b.setStyle("-fx-font-size:19");
                   ImageView doc=new ImageView("health.JPG");
                   doc.setFitHeight(60);
                   doc.setFitWidth(60);
                   ImageView mang=new ImageView("education.jpg");
                   mang.setFitHeight(60);
                   mang.setFitWidth(60);
                   ImageView client=new ImageView("medecine.JPG");
                   client.setFitHeight(60);
                   client.setFitWidth(60);
                   Label l = new Label("    Choose What Client do you want             ");
                     l.setAlignment(Pos.TOP_CENTER);
                     l.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 40));
                     l.setTextAlignment(TextAlignment.RIGHT);
                     l.setStyle("-fx-background-color: BEIGE");
                     Button health=new Button("Ministry_of_Health",doc);
                     Button medecine=new Button("Pharmaceutical_Company",client);
                     l.setTextFill(Color.BLUE);
                     health.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 20));
                     medecine.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 20));
                     health.setTextFill(Color.BLUE);
                     medecine.setTextFill(Color.BLUE);
                     GridPane gridpane=new GridPane();
                     gridpane.setAlignment(Pos.CENTER);
                     gridpane.setVgap(13);
                     gridpane.setHgap(13);
                     gridpane.add(health, 0, 3);
                     gridpane.add(medecine, 0, 5);
                     gridpane.add(b, 0, 7);
                     BorderPane borderpane=new BorderPane();
                     borderpane.setCenter(gridpane);
                     Scene secondScene = new Scene(borderpane, 1300, 750);
                     borderpane.setStyle(" -fx-background-image: url(\"z1.jpg\");-fx-background-size: 1300 750;");
                     Stage newWindow = new Stage();
                     newWindow.setTitle("view for manager");
                     newWindow.setScene(secondScene);
                     newWindow.show();
                     w=newWindow;
 b.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(ActionEvent event) {
                    w.close();
                    }}); 
 health.setOnAction(new EventHandler<ActionEvent>() {
                 Stage s1;
                  public void handle(ActionEvent event) {
                healthrequest r=new healthrequest();
                r.buildData();
                  }}); 
medecine.setOnAction(new EventHandler<ActionEvent>() {
                 Stage s;
                  public void handle(ActionEvent event) {      
                  Button send=new Button("Send Request");
                  Button cancel=new Button("Cancel");
                  Label medecinename=new Label("medecine name");
                  TextField medecinetext=new TextField();
                  Label medecinepermit=new Label("permit");
                  TextField  permittext=new TextField();
                   send.setTextFill(Color.WHITE);
                   send.setStyle("-fx-background-color: BLUE");
                   send.setStyle("-fx-font-size: 16");
                   cancel.setStyle("-fx-font-size: 16");
                   cancel.setTextFill(Color.WHITE);    
                   cancel.setStyle("-fx-background-color: BLUE");
                   medecinename.setTextFill(Color.BLUE);
                   medecinename.setStyle("-fx-font-size: 16");
                   medecinepermit.setTextFill(Color.BLUE);
                   medecinepermit.setStyle("-fx-font-size: 16");
                  GridPane gridpane=new GridPane();
                  gridpane.setAlignment(Pos.TOP_CENTER);
                  gridpane.setHgap(13);
                  gridpane.setVgap(13);
                  gridpane.add(medecinename,0,13);
                  gridpane.add(medecinetext,2,13);
                  gridpane.add(medecinepermit,0,14);
                  gridpane.add(permittext,2,14);
                  gridpane.add(send,1,15);
                  gridpane.add(cancel,2,15);
                  BorderPane borderpane=new BorderPane();
                  borderpane.setCenter(gridpane);
                  Scene secondScene = new Scene(borderpane, 1300, 750,Color.BEIGE);
                  borderpane.setStyle(" -fx-background-image: url(\"cc.jpeg\");-fx-background-size: 1300 750;");
                  Stage newWindow = new Stage();
                  newWindow.setTitle("view for Doctors");
                  newWindow.setScene(secondScene);
                  newWindow.show();
                    s=newWindow;
send.setOnAction(new EventHandler<ActionEvent>(){
                    public void handle(ActionEvent t) {
                    Connection con;
                   String s1=medecinetext.getText();
                   String s2=permittext.getText();        
                   try {
                  con= (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/dp"+"?useUnicode=true&characterEncoding=utf-8", "root", "");
                  Statement stm=con.createStatement();
                  stm.executeUpdate("insert into medecinecompany values('"+s1+"','"+s2+"');");
                  JOptionPane.showMessageDialog(null,"Inserted Successfully!");
                  s.close();
                  con.close();
                  }catch (SQLException ex) {
                  ex.getMessage();}
                    }});
cancel.setOnAction(new EventHandler<ActionEvent>() {
                  public void handle(ActionEvent event) {
                    x1.close();
                    s.close();
                     x2.close();
                    }});}});
                     }});
buttonmanagerstudent.setOnAction(new EventHandler<ActionEvent>() {
                      Stage s1;
                     public void handle(ActionEvent event){
                   studenttable t=new studenttable();
                   t.buildData();
 } });

buttonmanagerresearch.setOnAction(new EventHandler<ActionEvent>(){
                    Stage s1;
                    public void handle(ActionEvent event){
                    researchtable t=new researchtable();
                    t.buildData();
                    }});
                    }else{
                         lblMessage.setText("Incorrect user or Possword.");
                         lblMessage.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 25));
                         lblMessage.setTextFill(Color.RED);                      
                    }}}); }});                
buttondoctor.setOnAction(new EventHandler<ActionEvent>(){
                       Stage e1;
                       public void handle(ActionEvent t){
                       ImageView docc=new ImageView("doc.JPG");
                       docc.setFitHeight(55);
                       docc.setFitWidth(55);
                       Label l = new Label("         Doctor Login Here                                                                                                   ",docc);
                       l.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 30));
                       l.setTextAlignment(TextAlignment.RIGHT); l.setAlignment(Pos.TOP_CENTER);
                       l.setStyle("-fx-background-color: White");
                       l.setTextFill(Color.BLUE);
                       ImageView pass=new ImageView("pass.JPG");
                       ImageView uname=new ImageView("uname.JPG");
                       ImageView logout=new ImageView("logout.JPG");
                       final TextField textfeilduser=new TextField();
                       final  PasswordField textfeildpass=new PasswordField();
                        final Label lblMessage = new Label();
                        Button buttonlogout=new Button("",logout);
                        Button buttonlogin=new Button("Login");
                       buttonlogin.setTextFill(Color.WHITE);
                       buttonlogin.setStyle("-fx-background-color: BLUE");
                       Label l1=new Label("Login Here");
                       l1.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 20));
                       l1.setStyle("-fx-background-color:BEIGE ");
                       GridPane gridpane=new GridPane();
                        gridpane.setAlignment(Pos.CENTER);
                        gridpane.setStyle("-fx-opacity:0.7;-fx-background-color:WHITE;");
                        gridpane.setMaxHeight(350);
                        gridpane.setMaxWidth(350);
                       gridpane.setHgap(12);
                       gridpane.setVgap(13);
                       gridpane.add(l1, 0, 0);
                       gridpane.add(uname, 0, 3);
                       gridpane.add(textfeilduser, 2, 3);
                       gridpane.add(pass, 0, 5);
                       gridpane.add(textfeildpass, 2, 5);
                       gridpane.add(buttonlogin, 2, 7);
                       gridpane.add(lblMessage, 2, 8);
                       BorderPane borderpane=new BorderPane();
                       borderpane.setCenter(gridpane);
                       borderpane.setTop(l);
                       borderpane.setRight(buttonlogout);
                       Scene secondScene = new Scene(borderpane, 1300, 750,Color.WHITE);  
                        borderpane.setStyle(" -fx-background-image: url(\"lll.jpg\");-fx-background-size: 1300 750;");
                       Stage newWindow = new Stage();
                        newWindow.setTitle("Login");
                        newWindow.setScene(secondScene);
                        newWindow.show();
                        e1=newWindow;
buttonlogout.setOnAction(new EventHandler<ActionEvent>() {
                        public void handle(ActionEvent event) {
                         e1.close();
                         }});
buttonlogin.setOnAction(new EventHandler<ActionEvent>() {
                        Stage v2;
                        public void handle(ActionEvent event) {
                            loginn h=new loginn();
                        if(h.doctorlogin(textfeilduser, textfeildpass)==true){       
                        ImageView l=new ImageView("d.JPG");
                        Button buttonprofil=new Button("Profile            ");
                        Button buttonappiontments=new Button("Appointments       ");
                        Button buttonpass=new Button("Change Password  ");
                        Button buttonlogout=new Button("Logout");
                        buttonprofil.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 20));
                        buttonappiontments.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 20));
                        buttonpass.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 20));
                        buttonprofil.setTextFill(Color.BLUE);
                        buttonappiontments.setTextFill(Color.BLUE);
                        buttonpass.setTextFill(Color.BLUE);
                        buttonlogout.setTextFill(Color.WHITE);
                        buttonlogout.setStyle("-fx-background-color: BLUE");
                        buttonprofil.setStyle("-fx-background-color: White");
                        buttonappiontments.setStyle("-fx-background-color: White");
                        buttonpass.setStyle("-fx-background-color: White");
                        GridPane gridpane=new GridPane(); 
                        gridpane.setAlignment(Pos.CENTER);
                        gridpane.setVgap(12);
                        gridpane.setHgap(13);
                        gridpane.add(l, 4, 0);
                        gridpane.add(buttonprofil, 4, 2);
                        gridpane.add(buttonappiontments, 4, 3);
                        gridpane.add(buttonpass, 4, 4);
                        gridpane.add(buttonlogout, 4, 5);
                        BorderPane borderpane=new BorderPane();
                        borderpane.setLeft(gridpane);
                        Scene scene = new Scene(borderpane, 1300, 750,Color.WHITE);
                        borderpane.setStyle(" -fx-background-image: url(\"docto.png\");-fx-background-size: 1300 750;");
                         primaryStage.setTitle("doctor");
                         primaryStage.setScene(scene);
                         primaryStage.show(); 
                         v2=primaryStage;
buttonlogout.setOnAction(new EventHandler<ActionEvent>() {
                         public void handle(ActionEvent event) {
                          v2.close();
                         start(new Stage());
                         }});
buttonprofil.setOnAction(new EventHandler<ActionEvent>(){
                                Stage s1;
                  public void handle(ActionEvent event) {
                  ImageView i3=new ImageView("logout1.JPG");
                  ImageView i4=new ImageView("home2.JPG");
                  ImageView i2=new ImageView("dd.JPG");
                  ImageView doc=new ImageView("doc.JPG");
                  doc.setFitHeight(55);
                  doc.setFitWidth(55);                 
                  Label l = new Label("               View Doctor info                                                                                                                                                            ",doc);
                  l.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 35));
                  l.setTextAlignment(TextAlignment.RIGHT);  l.setAlignment(Pos.TOP_RIGHT);
                  l.setStyle("-fx-background-color: White");l.setTextFill(Color.BLUE); 
                  Button buttonsearch=new Button("view"); 
                  Button buttonhome=new Button("Home",i4);
                  Button buttonlogout=new Button("Logout",i3);
                  Label labelId =new Label("Doctor ID  ");
                  TextField textfeildid=new TextField();
                  Label labelfname =new Label("First Name  ");
                  TextField textfeildfname=new TextField();
                  Label labellname =new Label("First Name  ");
                  TextField textfeildlname=new TextField();
                  Label labeldate =new Label("Date  ");
                  TextField textfeilddate=new TextField();
                  Label labelage =new Label("Age  ");
                  TextField textfeildage=new TextField();
                  Label labelgender =new Label("Gender  ");
                  TextField comboboxgender=new TextField();
                  Label labelEmail =new Label("Email Address ");
                  TextField textfeildEmail=new TextField();
                  Label labelresearchtype =new Label("Researsh Type  ");
                  TextField textfeildresearchtype=new TextField();
                  Label labelsearchduration =new Label("Searsh Duration  ");
                  TextField textfeildsearchduration=new TextField();
                  Label labelPhone =new Label("Phone  ");
                  TextField textfeildphone=new TextField();
                  Label labelcity =new Label("City  ");
                  TextField textfeildcity=new TextField();
                   Label labelname =new Label("User_Name  ");
                  TextField textfeildname=new TextField();
                  Label labelpass =new Label("Password  ");
                  TextField textfeildpassword=new TextField();
                  labelfname.setTextFill(Color.BLUE);
                  labelId.setTextFill(Color.BLUE);
                  labellname.setTextFill(Color.BLUE);
                  labelage.setTextFill(Color.BLUE);
                  labelgender.setTextFill(Color.BLUE);
                  labelEmail.setTextFill(Color.BLUE);
                  labelresearchtype.setTextFill(Color.BLUE);
                  labelPhone.setTextFill(Color.BLUE);
                  labelcity.setTextFill(Color.BLUE);
                  labelsearchduration.setTextFill(Color.BLUE);
                  buttonhome.setTextFill(Color.WHEAT);
                  buttonlogout.setTextFill(Color.BLUE);
                  buttonhome.setTextFill(Color.BLUE);
                  labelname.setTextFill(Color.BLUE);
                  labelpass.setTextFill(Color.BLUE);
                  labelfname.setStyle("-fx-font-size:19");
                  labeldate.setStyle("-fx-font-size:19");
                  labellname.setStyle("-fx-font-size:19");
                  labelEmail.setStyle("-fx-font-size:19");
                  labelId.setStyle("-fx-font-size:19");
                  labelage.setStyle("-fx-font-size:19");
                  labelgender.setStyle("-fx-font-size:19");
                  labelresearchtype.setStyle("-fx-font-size:19");
                  labelPhone.setStyle("-fx-font-size:19");
                  labelcity.setStyle("-fx-font-size:19");
                  labelsearchduration.setStyle("-fx-font-size:19");
                  labelname.setStyle("-fx-font-size:19");
                  labelpass.setStyle("-fx-font-size:19");
                  GridPane gridpane=new GridPane();
                  gridpane.setAlignment(Pos.CENTER);
                  gridpane.setHgap(10);
                  gridpane.setVgap(12);
                  gridpane.add(labelId, 0, 0);
                  gridpane.add(textfeildid, 1, 0);
                  gridpane.add(buttonsearch, 5, 0);
                  gridpane.add(i2, 16, 0);
                  gridpane.add(labelfname, 0, 2);
                  gridpane.add(textfeildfname, 1, 2);
                  gridpane.add(labellname, 4, 2);
                  gridpane.add(textfeildlname, 5, 2);
                  gridpane.add(labelEmail, 0, 4);
                  gridpane.add(textfeildEmail, 1, 4);
                  gridpane.add(labelresearchtype, 0, 6);
                  gridpane.add(textfeildresearchtype, 1, 6);
                  gridpane.add(labelsearchduration, 0, 8);
                  gridpane.add(textfeildsearchduration, 1, 8);
                  gridpane.add(labelage, 0, 10);
                  gridpane.add(textfeildage, 1, 10);
                  gridpane.add(labelgender, 4, 10);
                  gridpane.add(comboboxgender, 5, 10); 
                  gridpane.add(labeldate, 0, 12);
                  gridpane.add(textfeilddate, 1, 12);
                  gridpane.add(labelPhone, 0, 14);
                  gridpane.add(textfeildphone, 1, 14);
                  gridpane.add(labelname, 0, 16);
                  gridpane.add(textfeildname, 1, 16);
                  gridpane.add(labelpass, 0, 18);
                  gridpane.add(textfeildpassword, 1, 18);
                   HBox hbox1=new HBox();
                   hbox1.getChildren().addAll(buttonhome,buttonlogout);
                   BorderPane borderpane=new BorderPane();
                   borderpane.setCenter(gridpane);
                   borderpane.setRight(hbox1);
                   borderpane.setTop(l);
                   Scene secondScene = new Scene(borderpane, 1300, 750,Color.BEIGE);
                   borderpane.setStyle(" -fx-background-image: url(\"password.JPG\");-fx-background-size: 1300 750;");
                   Stage newWindow = new Stage();
                   newWindow.setTitle("Search for Doctor");
                   newWindow.setScene(secondScene);
                   newWindow.show();
                   s1=newWindow;
buttonsearch.setOnAction(new EventHandler<ActionEvent>(){
                        public void handle(ActionEvent event) {
                       try{
                      Connection connection = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/dp"+"?useUnicode=true&characterEncoding=utf-8", "root", "");
                      Statement statement=connection.createStatement();
                      ResultSet resultset = statement.executeQuery("SELECT First_Name,Last_Name,"
                      + "Email_Address ,Search_Name,Research_Duration,"
                      + "Age,Gender,Date,Phone,User_Name,Password FROM doctorr where Doctor_Id ="+Double.parseDouble(textfeildid.getText()));
                      while (resultset.next()){
                     textfeildfname.setText(resultset.getString("First_Name"));textfeildlname.setText(resultset.getString("Last_Name"));
                      textfeildEmail.setText(resultset.getString("Email_Address"));textfeildresearchtype.setText(resultset.getString("Search_Name"));
                        textfeildsearchduration.setText(resultset.getString("Research_Duration"));textfeildage.setText(resultset.getString("Age"));
                      comboboxgender.setText(resultset.getString("Gender"));textfeilddate.setText(resultset.getString("Date"));
                      textfeildphone.setText(resultset.getString("Phone"));
                    textfeildname.setText(resultset.getString("User_Name"));
                       textfeildpass.setText(resultset.getString("Password"));
                   }
                  connection.close();
                 } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                }}});
buttonhome.setOnAction(new EventHandler<ActionEvent>() {
                         public void handle(ActionEvent event) {
                         s1.close();
                          e1.close();
                         }});
buttonlogout.setOnAction(new EventHandler<ActionEvent>() {
                         public void handle(ActionEvent event) {
                         s1.close();
                         start(new Stage());
                         v2.close();
                         e1.close();
                         }});}});                        
buttonpass.setOnAction(new EventHandler<ActionEvent>(){
                   Stage s;
                   public void handle(ActionEvent event) {
                   Label current=new Label("Enter Current password");
                   final PasswordField currenttext=new PasswordField();
                   Label neww=new Label("Enter New password");
                   final PasswordField newtext=new PasswordField();
                   Label confirme=new Label("Confirme password");
                   final PasswordField confirmetext=new PasswordField();
                   Button change=new Button("Change Password");
                   Button cancel=new Button("Cancel");
                   Label l=new Label("                                    Change Your Password                                        ");
                   l.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 30));
                   l.setStyle("-fx-background-color: White"); l.setTextFill(Color.BLUE);
                  current.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 20));
                  current.setStyle("-fx-background-color: White");
                  current.setTextFill(Color.BLUE);
                  neww.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 20));
                  neww.setStyle("-fx-background-color: White");
                  neww.setTextFill(Color.BLUE);
                  confirme.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 20));
                  confirme.setStyle("-fx-background-color: White");
                  confirme.setTextFill(Color.BLUE);
                  change.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 20));
                  change.setStyle("-fx-background-color: BLUE");
                  change.setTextFill(Color.WHITE);
                  cancel.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 20));
                  cancel.setStyle("-fx-background-color: BLUE");
                  cancel.setTextFill(Color.WHITE);
                  Label message=new Label();
                  GridPane gridpane=new GridPane();
                   gridpane.setAlignment(Pos.CENTER);
                   gridpane.setVgap(13);
                   gridpane.setHgap(14);
                   gridpane.add(current, 0, 0);
                   gridpane.add(currenttext, 2, 0);
                   gridpane.add(neww, 0, 2);
                   gridpane.add(newtext, 2, 2);
                   gridpane.add(confirme, 0, 4);
                   gridpane.add(confirmetext, 2, 4);
                   gridpane.add(message, 0, 5);
                   gridpane.add(change, 3, 7);
                   gridpane.add(cancel, 4, 7);
                   BorderPane borderpane=new BorderPane();
                   borderpane.setCenter(gridpane);
                   borderpane.setTop(l);
                   Scene secondScene = new Scene(borderpane, 1300, 750,Color.BEIGE);
                   borderpane.setStyle(" -fx-background-image: url(\"docto.png\");-fx-background-size: 1300 750;");
                   Stage newWindow = new Stage();
                    newWindow.setTitle("changepassword");
                    newWindow.setScene(secondScene);
                    newWindow.show(); 
                    s=newWindow;
cancel.setOnAction(new EventHandler<ActionEvent>(){
                     public void handle(ActionEvent event) {
                     s.close();
                      e1.close();
                       }});
change.setOnAction(new EventHandler<ActionEvent>(){
                    String checkUser,checkPw;
                     public void handle(ActionEvent event) {
                    loginn j=new loginn();
                   
                    if(j.changepassword(textfeilduser, textfeilduser, confirmetext)==true){
                    
                     }else{
                       message.setText("the passwords you typed don't match please retype the passwords again");
                       confirmetext.setText("");
                       newtext.setText("");
                       message.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 17));
                       message.setTextFill(Color.RED);  
                     } }}); }});      
buttonappiontments.setOnAction(new EventHandler<ActionEvent>(){   
                   public void handle(ActionEvent event){
                   doctortasks tw=new doctortasks();
                   tw.buildData();
                   }}); 
                  }else{
                         lblMessage.setText("Incorrect user or Possword.");
                         lblMessage.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 25));
                         lblMessage.setTextFill(Color.RED);
                         
                 }}}); }});
buttonclient.setOnAction(new EventHandler<ActionEvent>(){
                          Stage a1;
                          public void handle(ActionEvent event){                
                          ImageView doc=new ImageView("health.JPG");
                          doc.setFitHeight(60);
                          doc.setFitWidth(60);
                          ImageView mang=new ImageView("education.jpg");
                          mang.setFitHeight(60);
                          mang.setFitWidth(60);
                          ImageView client=new ImageView("medecine.JPG");
                          client.setFitHeight(60);
                          client.setFitWidth(60);
                          ImageView home=new ImageView("logout.JPG");
                          home.setFitHeight(40);
                          home.setFitWidth(40);
                          ImageView clien=new ImageView("clients.JPG");
                          clien.setFitHeight(55);
                          clien.setFitWidth(55);
                          Button buttonhealth = new Button("Ministry of Health",doc);
                          Button buttonmedecine = new Button("Pharmaceutical_Company",client);
                          Button buttoneducate = new Button("Ministry of education",mang);
                          Button home1 = new Button("",home);
                          buttonhealth.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 20));
                          buttonmedecine.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 20));
                          buttoneducate.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 20));
                          buttonhealth.setTextFill(Color.BLUE);
                          buttonmedecine.setTextFill(Color.BLUE);
                          buttoneducate.setTextFill(Color.BLUE); 
                          Label l = new Label("          Login As                                                                                                                                      ",clien);
                          l.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 30));
                          l.setTextAlignment(TextAlignment.RIGHT); l.setAlignment(Pos.TOP_CENTER);
                          l.setStyle("-fx-background-color: White");
                          l.setTextFill(Color.BLUE);
                            GridPane gridpane=new GridPane();
                            gridpane.setAlignment(Pos.CENTER);
                            gridpane.setHgap(12);
                            gridpane.setVgap(13);
                            gridpane.add(buttonmedecine, 0, 1);
                            gridpane.add(buttoneducate, 0, 3);
                            gridpane.add(buttonhealth, 0, 5);
                            BorderPane borderpane=new BorderPane();
                            borderpane.setTop(l);
                            borderpane.setCenter(gridpane);
                            borderpane.setRight(home1);
                            Scene scene = new Scene(borderpane, 1300, 750,Color.WHITE);
                            borderpane.setStyle(" -fx-background-image: url(\"z1.jpg\");-fx-background-size: 1300 750;");
                            primaryStage.setTitle("login as");
                            primaryStage.setScene(scene);
                            primaryStage.show(); 
                            a1=primaryStage;
home1.setOnAction(new EventHandler<ActionEvent>(){
                           public void handle(ActionEvent t) {
                             a1.close();
                             start(new Stage());
                            }});
buttonhealth.setOnAction(new EventHandler<ActionEvent>(){
                             Stage c1;
                             public void handle(ActionEvent event) {
                             ImageView doc=new ImageView("health.JPG");
                             doc.setFitHeight(55);
                             doc.setFitWidth(55); 
                             Label l = new Label("                 Ministry of Health Login Here                                                                 ",doc);
                             l.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 30));
                             l.setAlignment(Pos.TOP_CENTER);
                             l.setStyle("-fx-background-color: White");
                             ImageView pass=new ImageView("pass.JPG");
                             ImageView uname=new ImageView("uname.JPG");
                             ImageView logout=new ImageView("logout.JPG");
                             final   TextField textfeilduser=new TextField();
                             final  PasswordField textfeildpass=new PasswordField();
                             Button buttonlogout=new Button("",logout);
                             Button buttonlogin=new Button("Login");
                             buttonlogin.setTextFill(Color.WHITE);
                             buttonlogin.setStyle("-fx-background-color: BLUE");
                             l.setTextFill(Color.BLUE);
                             Label l1=new Label("Login Here");
                             final Label lblMessage = new Label();
                             GridPane gridpane=new GridPane();
                             gridpane.setAlignment(Pos.CENTER);
                             gridpane.setStyle("-fx-opacity:0.7;-fx-background-color:WHITE;");
                             gridpane.setMaxHeight(350);
                             gridpane.setMaxWidth(350);
                             gridpane.setHgap(12);
                             gridpane.setVgap(13);
                             gridpane.add(l1, 0, 0);
                             gridpane.add(uname, 0, 3);
                             gridpane.add(textfeilduser, 2, 3);
                             gridpane.add(pass, 0, 5);
                             gridpane.add(textfeildpass, 2, 5);
                             gridpane.add(buttonlogin, 2, 7);
                              gridpane.add(lblMessage, 2, 8);
                             BorderPane borderpane=new BorderPane();
                             borderpane.setCenter(gridpane);
                             borderpane.setTop(l);
                             borderpane.setRight(buttonlogout);
                             Scene secondScene = new Scene(borderpane, 1300, 750,Color.WHITE);
                             borderpane.setStyle(" -fx-background-image: url(\"lll.jpg\");-fx-background-size: 1300 750;");
                            Stage newWindow = new Stage();
                            newWindow.setTitle("Login");
                            newWindow.setScene(secondScene);
                            newWindow.show();
                            c1=newWindow;
buttonlogout.setOnAction(new EventHandler<ActionEvent>() {
                             public void handle(ActionEvent event) {
                              c1.close();
                               }});
buttonlogin.setOnAction(new EventHandler<ActionEvent>() {
                              Stage x2;
                              public void handle(ActionEvent event) {     
                             loginn h=new loginn();
                                 if(h.healthlogin(textfeilduser, textfeildpass)){
                                 healthresponce r=new healthresponce();
                                 r.buildData();
                                 c1.close();
                                }else{
                                 lblMessage.setText("Incorrect user or Possword.");
                                 lblMessage.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 25));
                                 lblMessage.setTextFill(Color.RED);
                                 }}});  }});                                     
buttonmedecine.setOnAction(new EventHandler<ActionEvent>(){
                                 Stage f1;
                                 public void handle(ActionEvent event) {
                                 ImageView client=new ImageView("medecine.JPG");
                                 client.setFitHeight(55);
                                 client.setFitWidth(55);
                                 ImageView pass=new ImageView("pass.JPG");
                                 ImageView uname=new ImageView("uname.JPG");
                                 ImageView logout=new ImageView("logout.JPG");
                                 final TextField textfeilduser=new TextField();
                                 final PasswordField textfeildpass=new PasswordField();
                                 final Label lblMessage=new Label();
                                 Button buttonlogout=new Button("",logout);
                                 Button buttonlogin=new Button("Login");
                                 buttonlogin.setTextFill(Color.WHITE);
                                 buttonlogin.setStyle("-fx-background-color: BLUE");
                                 Label l = new Label("                    Pharmaceutical_Company Login Here                                                            ",client);
                                 l.setFont(Font.font("Aparajita ", FontWeight.LIGHT, FontPosture.REGULAR, 30));
                                 l.setTextAlignment(TextAlignment.RIGHT);l.setAlignment(Pos.TOP_CENTER);
                                 l.setStyle("-fx-background-color: White"); l.setTextFill(Color.BLUE);
                                 Label l1=new Label("Login Here");
                                 GridPane gridpane=new GridPane();
                                 gridpane.setAlignment(Pos.CENTER);
                                 gridpane.setStyle("-fx-opacity:0.7;-fx-background-color:WHITE;");
                                 gridpane.setMaxHeight(350);
                                 gridpane.setMaxWidth(350);
                                 gridpane.setHgap(12);
                                 gridpane.setVgap(13);
                                 gridpane.add(l1, 0, 0);
                                 gridpane.add(uname, 0, 3);
                                 gridpane.add(textfeilduser, 2, 3);
                                 gridpane.add(pass, 0, 5);
                                 gridpane.add(textfeildpass, 2, 5);
                                 gridpane.add(buttonlogin, 2, 7);
                                 gridpane.add(lblMessage, 2, 8);
                                 BorderPane borderpane=new BorderPane();
                                 borderpane.setCenter(gridpane);
                                 borderpane.setTop(l);
                                 borderpane.setRight(buttonlogout);
                                 Scene secondScene = new Scene(borderpane, 1300, 750,Color.WHITE); 
                                 borderpane.setStyle(" -fx-background-image: url(\"lll.jpg\");-fx-background-size: 1300 750;");
                                 Stage newWindow = new Stage();
                                 newWindow.setTitle("Login");
                                 newWindow.setScene(secondScene);
                                 newWindow.show();
                                 f1=newWindow;
buttonlogout.setOnAction(new EventHandler<ActionEvent>() {
                                 public void handle(ActionEvent event) {
                                 f1.close();
                                 }});
buttonlogin.setOnAction(new EventHandler<ActionEvent>() {
                                Stage y1;
                                public void handle(ActionEvent event) {     
                               loginn h=new loginn();
                               if(h.medecinelogin(textfeilduser, textfeildpass)){
                                    medecinecompany y=new medecinecompany();
                                    y.buildData();
                                   f1.close();
                                 }else{
                               lblMessage.setText("Incorrect user or Possword.");
                               lblMessage.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 25));
                               lblMessage.setTextFill(Color.RED);
                                }}});  }});   
buttoneducate.setOnAction(new EventHandler<ActionEvent>(){
                                 Stage r1;
                                 public void handle(ActionEvent event) {
                                 ImageView mang=new ImageView("education.jpg");
                                 mang.setFitHeight(55);
                                 mang.setFitWidth(55);
                                 ImageView pass=new ImageView("pass.JPG");
                                 ImageView uname=new ImageView("uname.JPG");
                                 ImageView logout=new ImageView("logout.JPG");
                                 final TextField textfeilduser=new TextField();
                                 final PasswordField textfeildpass=new PasswordField();
                                 Label lblMessage=new Label();
                                 Button buttonlogout=new Button("",logout);
                                 Button buttonlogin=new Button("Login");
                                 buttonlogin.setTextFill(Color.WHITE);
                                 buttonlogin.setStyle("-fx-background-color: BLUE");
                                 Label l = new Label("         Ministry_of_Education Login Here                                                                  ",mang);
                                 l.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 30));
                                 l.setTextAlignment(TextAlignment.RIGHT); l.setAlignment(Pos.TOP_CENTER);
                                 l.setStyle("-fx-background-color: White");
                                 l.setTextFill(Color.BLUE);
                                 Label l1=new Label("Login Here");
                                 GridPane gridpane=new GridPane();
                                 gridpane.setAlignment(Pos.CENTER);
                                 gridpane.setStyle("-fx-opacity:0.7;-fx-background-color:WHITE;");
                                 gridpane.setMaxHeight(350);
                                 gridpane.setMaxWidth(350);
                                 gridpane.setHgap(12);
                                 gridpane.setVgap(13);
                                 gridpane.add(l1, 0, 0);
                                 gridpane.add(uname, 0, 3);
                                 gridpane.add(textfeilduser, 2, 3);
                                 gridpane.add(pass, 0, 5);
                                 gridpane.add(textfeildpass, 2, 5);
                                 gridpane.add(buttonlogin, 2, 7);
                                 gridpane.add(lblMessage, 2, 8);
                                 BorderPane borderpane=new BorderPane();
                                 borderpane.setCenter(gridpane);
                                 borderpane.setTop(l);
                                 borderpane.setRight(buttonlogout);
                                 Scene secondScene = new Scene(borderpane, 1300, 750,Color.WHITE);  
                                 borderpane.setStyle(" -fx-background-image: url(\"lll.jpg\");-fx-background-size: 1300 750;");
                                 Stage newWindow = new Stage();
                                 newWindow.setTitle("Login");
                                 newWindow.setScene(secondScene);
                                 newWindow.show();
                                 r1=newWindow;
buttonlogout.setOnAction(new EventHandler<ActionEvent>() {
                                 public void handle(ActionEvent event) {
                                 r1.close();
                                 }});
buttonlogin.setOnAction(new EventHandler<ActionEvent>() {
                                 Stage y2;
                                 public void handle(ActionEvent event) {     
                                 loginn h=new loginn();
                                 if(h.educatelogin(textfeilduser, textfeildpass)){
                                 Label fname=new Label("Enter First_Name");
                                 TextField textfname=new TextField();
                                 Label lname=new Label("Enter Last_Name");
                                 TextField textlname=new TextField();
                                   Label email=new Label("Enter Email_Address");
                                 TextField textemail=new TextField();
                                 Label ldegree=new Label("Degree");
                                 TextField degree=new TextField();
                                 Label age=new Label("Age");
                                 TextField textage=new TextField();
                                 Label gender=new Label("Gender");
                                 TextField textgender=new TextField();
                                 Label date=new Label("Date");
                                 TextField textdate=new TextField();
                                 Label courcenum=new Label("Enter cource_number");
                                 TextField textcourcenum=new TextField();
                                 Label courcename=new Label("Enter cource_name");
                                 TextField textcourcename=new TextField();
                                 Button send=new Button("Send Request");
                                 Button cancel=new Button("Cancel");
                                 fname.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 25));
                                 lname.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 25));
                                 email.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 25));
                                 ldegree.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 25));
                                 age.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 25));
                                 gender .setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 25));
                                 date.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 25));
                                 courcenum.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 25));
                                 courcename.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 25));
                                 send.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 25));
                                 cancel.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 25));
                                 fname.setTextFill(Color.BLUE);
                                 lname.setTextFill(Color.BLUE);
                                 email.setTextFill(Color.BLUE);
                                 ldegree.setTextFill(Color.BLUE);
                                 age.setTextFill(Color.BLUE);
                                 gender.setTextFill(Color.BLUE);
                                 date.setTextFill(Color.BLUE);
                                 courcenum.setTextFill(Color.BLUE);
                                 courcename.setTextFill(Color.BLUE);
                                 send.setTextFill(Color.WHITE);
                                 send.setStyle("-fx-background-color: BLUE");
                                 cancel.setTextFill(Color.WHITE);
                                 cancel.setStyle("-fx-background-color: BLUE");
                                 ImageView doc=new ImageView("education.jpg");
                                 doc.setFitHeight(60);
                                 doc.setFitWidth(60);
                                 Label l = new Label("                       Ministry_of_Education  Send Request                      ",doc);
                                 l.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 40));
                                 l.setTextAlignment(TextAlignment.RIGHT);l.setAlignment(Pos.TOP_CENTER);
                                 l.setStyle("-fx-background-color: White");l.setTextFill(Color.BLUE); 
                                 GridPane gridpane=new GridPane();
                                 gridpane.setAlignment(Pos.CENTER);
                                 gridpane.setHgap(10);
                                 gridpane.setVgap(10);
                                 gridpane.add(fname, 0, 0);
                                 gridpane.add(textfname, 2, 0);
                                 gridpane.add(lname, 0, 2);
                                 gridpane.add(textlname, 2, 2);
                                 gridpane.add(email, 0, 4);
                                 gridpane.add(textemail, 2, 4);
                                 gridpane.add(ldegree, 0, 6);
                                 gridpane.add(degree, 2, 6);
                                 gridpane.add(age, 0, 7);
                                 gridpane.add(textage, 2, 7);
                                 gridpane.add(gender, 0, 8);
                                 gridpane.add(textgender, 2, 8);
                                 gridpane.add(date, 0, 9);
                                 gridpane.add(textdate, 2, 9);
                                 gridpane.add(courcenum, 0, 10);
                                 gridpane.add(textcourcenum, 2, 10);
                                  gridpane.add(courcename, 0, 11);
                                 gridpane.add(textcourcename, 2, 11);
                                  gridpane.add(send, 3, 12);
                                 gridpane.add(cancel, 4, 12);
                                 BorderPane borderpane=new BorderPane();
                                 borderpane.setCenter(gridpane);
                                 borderpane.setTop(l);
                                 Scene secondScene = new Scene(borderpane, 1300, 750,Color.WHITE);
                                 borderpane.setStyle(" -fx-background-image: url(\"s.png\");-fx-background-size: 1300 750;");
                                 Stage newWindow = new Stage();
                                 newWindow.setTitle("Login");
                                 newWindow.setScene(secondScene);
                                 newWindow.show();  
                                 y2=newWindow;
cancel.setOnAction(new EventHandler<ActionEvent>() {
                                 public void handle(ActionEvent event) {
                                 y2.close();
                                 r1.close();
                                 }}); 
send.setOnAction(new EventHandler<ActionEvent>() {
                                 public void handle(ActionEvent event) {
                                   Connection con;
                   String s1=textfname.getText();
                   String s2=textlname.getText();
                   String s3=textemail.getText();
                   String s4=degree.getText();
                   String s5=textage.getText();
                   String s6=textgender.getText();
                   String s7=textdate.getText();
                   String s8=textcourcenum.getText();
                   String s11=textcourcename.getText();      
                   try {
                  con= (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/dp"+"?useUnicode=true&characterEncoding=utf-8", "root", "");
                  Statement stm=con.createStatement();
                  stm.executeUpdate("insert into student values(null,'"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s11+"');");
                  JOptionPane.showMessageDialog(null,"Inserted Successfully!");
                  y2.close();
                  r1.close();
                  con.close();
                  }catch (SQLException ex) {
                  ex.getMessage();}
                                 }}); 

                                 }else{
                                lblMessage.setText("Incorrect user or Possword.");
                                lblMessage.setFont(Font.font("Aparajita", FontWeight.LIGHT, FontPosture.REGULAR, 25));
                                lblMessage.setTextFill(Color.RED);
                                 } }}); }}); }});
                                 Scene scene = new Scene(borderpane, 1300, 750,Color.WHITE);
                                 borderpane.setStyle(" -fx-background-image: url(\"c.JPG\");-fx-background-size: 1300 750;");
                                 primaryStage.setTitle("login as");
                                 primaryStage.setScene(scene);
                                 primaryStage.show(); 
    }
    public static void main(String[] args) {
        launch(args);
    }
 
}
