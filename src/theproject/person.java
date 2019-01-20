package theproject;

import javafx.beans.property.SimpleStringProperty;

public class person {
    
        private final SimpleStringProperty Doctor_Id;
        private final SimpleStringProperty First_Name;
        private final SimpleStringProperty Last_Name;
        private final SimpleStringProperty Email_Address;
        private final SimpleStringProperty Search_Name;
        private final SimpleStringProperty Research_Duration;
        private final SimpleStringProperty Age;
        private final SimpleStringProperty Gender;
        private final SimpleStringProperty Date;
        private final SimpleStringProperty Phone;
        private final SimpleStringProperty User_Name;
        private final SimpleStringProperty Password;
        person(String id, String fname, String lname, String Email,String search, String duration, String age, String gender,String date, String phone,String User_Name,String Password) {
            this.Doctor_Id = new SimpleStringProperty(id);
            this.First_Name = new SimpleStringProperty(fname);
            this.Last_Name = new SimpleStringProperty(lname);
            this.Email_Address = new SimpleStringProperty(Email);
            this.Search_Name = new SimpleStringProperty(search);
            this.Research_Duration = new SimpleStringProperty(duration);
            this.Age = new SimpleStringProperty(age);
            this.Gender = new SimpleStringProperty(gender);
            this.Date = new SimpleStringProperty(date);
            this.Phone = new SimpleStringProperty(phone);
            this.User_Name = new SimpleStringProperty(User_Name);
            this.Password = new SimpleStringProperty(Password);
        }
  
        public String getDoctor_Id() {
            
            return Doctor_Id.get();
        }
          public void setDoctor_id(String id) {
            Doctor_Id.set(id);
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
          
         public String getSearch_Name() {
            return Search_Name.get();
        }
              public void setSearch_Name(String search) {
            Search_Name.set(search);
        }
         
              public String getResearch_Duration() {
            return Research_Duration.get();
        }
         public void setResearch_Duration(String duration) {
            Research_Duration.set(duration);
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
          public String getPhone() {
            return Phone.get();
        }
          public void setPhone(String phone) {
            Phone.set(phone);
        } 
         public String getUser_Name() {
            return User_Name.get();
        }
          public void setUser_Name(String password) {
            User_Name.set(password);
        }
            public String getPassword() {
            return Phone.get();
        }
          public void setPassword(String password) {
            Phone.set(password);
        }
}
