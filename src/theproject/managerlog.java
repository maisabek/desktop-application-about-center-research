
package theproject;

import javafx.beans.property.SimpleStringProperty;

public class managerlog {
     private final SimpleStringProperty mann;
        private final SimpleStringProperty pass;
        managerlog( String fname, String lname) {
            this.mann = new SimpleStringProperty(fname);
            this.pass = new SimpleStringProperty(lname);        
        }
  
          public String getmann() {
            return mann.get();
        } 
        public void setmann(String fname) {
            mann.set(fname);
        }
  
        public String getpass() {
            return pass.get();
        }
          public void setpass(String lname) {
            pass.set(lname);
          }
}
