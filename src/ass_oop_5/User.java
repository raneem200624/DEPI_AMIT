package ass_oop_5;

public class User {
    protected int uid;
     String name;
    protected String email;

    public  User(int uid,String name,String email){
        this.uid=uid;
        this.name=name;
        this.email=email;
    }
    public String getUserDetails(){
        return "User: "+name+" [Email: "+ email +" ]";
    }

}
