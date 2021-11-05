package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mail {
    public final String mail;
    
    public Mail(String mail){
        this.mail = mail;
    }
    
    public String getDomain(){
        return mail.substring(mail.indexOf("@") + 1);
    }
    
    public static boolean isMail(String line) {
        Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
        Matcher mat = pattern.matcher(line);

        if(mat.matches()){
            return true;
        }else{
            return false;
        }
    }
}
