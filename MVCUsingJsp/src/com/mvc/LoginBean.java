package com.mvc;

public class LoginBean {
private String username,password;

public String getName() {
	return username;
}

public void setName(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
public boolean validate(){  
    if(password.equals("admin")){  
        return true;  
    }  
    else{  
        return false;  
    }  
}  

}
