package theproject;

import javafx.beans.property.SimpleStringProperty;

public class person6 {
        private final SimpleStringProperty Medecine_Name;
        private final SimpleStringProperty Result;
         private final SimpleStringProperty Descrption;
        person6( String fname, String lname,String d) {
            this.Medecine_Name = new SimpleStringProperty(fname);
            this.Result = new SimpleStringProperty(lname);
            this.Descrption = new SimpleStringProperty(d);
          
        }
  
          public String getMedecine_Name() {
            return Medecine_Name.get();
        } 
        public void setMedecine_Name(String fname) {
            Medecine_Name.set(fname);
        }
  
        public String getResult() {
            return Result.get();
        }
          public void setResult(String lname) {
            Result.set(lname);
          }
           public String getDescrption() {
            return Result.get();
        }
          public void setDescrption(String d) {
            Result.set(d);
          }
}
