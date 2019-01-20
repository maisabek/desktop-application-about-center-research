package theproject;

import javafx.beans.property.SimpleStringProperty;

public class person1 {
    
        private final SimpleStringProperty Student_ID;
        private final SimpleStringProperty First_Name;
        private final SimpleStringProperty Last_Name;
        private final SimpleStringProperty Email_Address;
        private final SimpleStringProperty Degree;
        private final SimpleStringProperty Age;
        private final SimpleStringProperty Gender;
        private final SimpleStringProperty Date;
        private final SimpleStringProperty Cource_Number;
         private final SimpleStringProperty Cource_Name;
        person1(String id, String fname, String lname, String Email,String search, String duration, String age, String gender,String date, String phone) {
            this.Student_ID = new SimpleStringProperty(id);
            this.First_Name = new SimpleStringProperty(fname);
            this.Last_Name = new SimpleStringProperty(lname);
            this.Email_Address = new SimpleStringProperty(Email);
            this.Degree = new SimpleStringProperty(search);
            this.Age = new SimpleStringProperty(age);
            this.Gender = new SimpleStringProperty(gender);
            this.Date = new SimpleStringProperty(date);
            this.Cource_Number = new SimpleStringProperty(duration);
            this.Cource_Name = new SimpleStringProperty(phone);
        }
  
        public String getStudent_ID() {
            
            return Student_ID.get();
        }
          public void setStudent_ID(String id) {
            Student_ID.set(id);
        }
          public String getFirst_Name() {
            return First_Name.get();
        } 
        public void setFirst_Name(String fname) {
            First_Name.set(fname);
        }
  
        public String getLast_Name() {
            return Last_Name.get();
        }
          public void setLast_Name(String lname) {
            Last_Name.set(lname);
        }
          public String getEmail_Address() {
            return Email_Address.get();
        }
             public void setEmail_Address(String Email) {
            Email_Address.set(Email);
        }
          
         public String getDegree() {
            return Degree.get();
        }
              public void setdegree(String search) {
            Degree.set(search);
        }
         

          public String getAge() {
            return Age.get();
        }
             public void setAge(String age) {
            Age.set(age);
        }
          
         public String getGender() {
            return Gender.get();
        }
       public void setGender(String gender) {
            Gender.set(gender);
        }
         
         public String getDate() {
            return Date.get();
        }
        public void setDate(String date) {
            Date.set(date);
        }
          public String getCource_Number() {
            return Cource_Number.get();
        }
         public void setcource_number(String duration) {
            Cource_Number.set(duration);
        }
          public String getCource_Name() {
            return Cource_Name.get();
        }
    public void setCource_Name(String phone) {
            Cource_Name.set(phone);
        }   }
