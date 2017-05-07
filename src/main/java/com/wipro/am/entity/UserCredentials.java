package com.wipro.am.entity;

public class UserCredentials {
  
   public int getId() {
     return id;
   }
   public void setId(int id) {
     this.id = id;
   }
   public String getPassword() {
     return password;
   }
   public void setPassword(String password) {
     this.password = password;
   }
   public String getRole() {
     return role;
   }
   public void setRole(String role) {
     this.role = role;
   }
   public UserCredentials(int id, String password, String role) {
     super();
     this.id = id;
     this.password = password;
     this.role = role;
   }
   private int id;
   private String password;
   private String role;
 
}