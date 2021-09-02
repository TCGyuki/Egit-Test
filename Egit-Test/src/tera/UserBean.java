package tera;

import java.io.Serializable;

public class UserBean implements Serializable {
    private String name;
    private String passWord;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getPassWord(){
        return passWord;
    }
    public void setPassWord(String passWord){
        this.passWord = passWord;
    }
}