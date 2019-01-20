package theproject;
import javafx.beans.property.SimpleStringProperty;
public class person7 {
        private final SimpleStringProperty Medecine_Name;
        private final SimpleStringProperty Permit;
        person7( String fname, String lname){
            this.Medecine_Name = new SimpleStringProperty(fname);
            this.Permit = new SimpleStringProperty(lname); 
        }
        public String getMedecine_Name() {
            return Medecine_Name.get();
        } 
        public void setMedecine_Name(String fname) {
            Medecine_Name.set(fname);
        }
        public String getPermit() {
            return Permit.get();
        }
        public void setPermit(String lname) {
            Permit.set(lname);
        }         
}
