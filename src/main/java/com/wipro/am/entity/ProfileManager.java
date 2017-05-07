package com.wipro.am.entity;

public class ProfileManager {
  
   private UserCredentials [] credentials;
 
   public ProfileManager(UserCredentials[] credentials) {
     super();
     this.credentials = credentials;
   }
 
   public UserCredentials[] getCredentials() {
     return credentials;
   }
 
   public void setCredentials(UserCredentials[] credentials) {
     this.credentials = credentials;
   }
 
   public String authenticate(int id,String password)
  
   {
     String role="Unknown";
  
     for(UserCredentials credentials:credentials)
     {
        if(credentials!=null)
        {
           if((id==credentials.getId())&& (password==credentials.getPassword()))
          {
             role=authorize(id);
             System.out.println(role);
          }
        }
       
     }
     return role ;
   }
   public String authorize(int id){
    
        String response="UNKNOWN";
       
       
          for(UserCredentials credentials:credentials)
          {
             if(credentials !=null){
             if(id==credentials.getId())
             {
                response=credentials.getRole();
              
             }
             }
            
          }
          return response;
              
     }
    
   }