package theproject;

import javafx.beans.property.SimpleStringProperty;

public class person3 {
    
        private final SimpleStringProperty Research_Id;
        private final SimpleStringProperty Research_Name;
        private final SimpleStringProperty Doctor_Name;
        private final SimpleStringProperty Description;
        private final SimpleStringProperty Result;
        private final SimpleStringProperty Research_Duration;
        person3(String id, String fname, String lname, String Email,String search, String duration) {
            this.Research_Id = new SimpleStringProperty(id);
            this.Research_Name = new SimpleStringProperty(fname);
            this.Doctor_Name = new SimpleStringProperty(lname);
            this.Description = new SimpleStringProperty(Email);
            this.Result = new SimpleStringProperty(search);
            this.Research_Duration = new SimpleStringProperty(duration);
        }
  
        public String getResearch_Id() {
            
            return Research_Id.get();
        }
          public void setResearch_Id(String id) {
            Research_Id.set(id);
        }
          public String getResearch_Name() {
            return Research_Name.get();
        } 
        public void setResearch_Name(String fname) {
            Research_Name.set(fname);
        }
  
        public String getDoctor_Name() {
            return Doctor_Name.get();
        }
          public void setDoctor_Name(String lname) {
            Doctor_Name.set(lname);
        }
          public String getDescription() {
            return Description.get();
        }
             public void setDescription(String Email) {
            Description.set(Email);
        }
          
         public String getResult() {
            return Result.get();
        }
              public void setResult(String search) {
            Result.set(search);
        }
         
              public String getResearch_Duration() {
            return Research_Duration.get();
        }
         public void setResearch_Duration(String duration) {
            Research_Duration.set(duration);
        }
}