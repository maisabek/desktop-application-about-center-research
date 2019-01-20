package theproject;

import javafx.beans.property.SimpleStringProperty;

public class person4 {
        private final SimpleStringProperty Research_Name;
        private final SimpleStringProperty Result;
        private final SimpleStringProperty Cources_Number;
        private final SimpleStringProperty Cources_Name;
        private final SimpleStringProperty Appointment;
        person4( String fname, String lname, String Email,String search, String duration) {
            this.Research_Name = new SimpleStringProperty(fname);
            this.Result = new SimpleStringProperty(lname);
            this.Cources_Number = new SimpleStringProperty(Email);
            this.Cources_Name = new SimpleStringProperty(search);
            this.Appointment = new SimpleStringProperty(duration);
        }
  
          public String getResearch_Name() {
            return Research_Name.get();
        } 
        public void setResearch_Name(String fname) {
            Research_Name.set(fname);
        }
  
        public String getResult() {
            return Result.get();
        }
          public void setResult(String lname) {
            Result.set(lname);
        }
          public String getCources_Number() {
            return Cources_Number.get();
        }
             public void setCources_Number(String Email) {
            Cources_Number.set(Email);
        }
          
         public String getCources_Name() {
            return Cources_Name.get();
        }
              public void setCources_Name(String search) {
            Cources_Name.set(search);
        }
         
              public String getAppointment() {
            return Appointment.get();
        }
         public void setAppointment(String duration) {
            Appointment.set(duration);
        }
}