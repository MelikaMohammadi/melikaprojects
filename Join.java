package EmploeeControler;

import java.util.*;


public class Join {
private int i;
    static List user = new ArrayList();
   static List pass =new ArrayList();


    public void userN(String username){
        user.add(username);
    }
    public void passW (String password){
        pass.add(password);
    }
    public boolean userCheck(String username){
       boolean u =user.contains(username);
     i =  user.indexOf(username);
       return u;
    }
    public boolean passCheck(String password ){
        boolean p =pass.get(i).equals(password);

        return p;
    }





}

