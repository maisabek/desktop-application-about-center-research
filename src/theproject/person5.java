package theproject;

import javafx.beans.property.SimpleStringProperty;

public class person5 {
        private final SimpleStringProperty Medecine_Name;
        private final SimpleStringProperty Side_Effects;
        person5( String fname, String lname) {
            this.Medecine_Name = new SimpleStringProperty(fname);
            this.Side_Effects = new SimpleStringProperty(lname);
          
        }
  
          public String getMedecine_Name() {
            return Medecine_Name.get();
        } 
        public void setMedecine_Name(String fname) {
            Medecine_Name.set(fname);
        }
  
        public String getSide_Effects() {
            return Side_Effects.get();
        }
          public void setSide_Effects(String lname) {
            Side_Effects.set(lname);
          }
}
