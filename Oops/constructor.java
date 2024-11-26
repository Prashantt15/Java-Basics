class myemployee{
    private String name;
    private int id;
    public void setname(String a){
        name=a;
    }
    public String getname(){
        return name;
    }
    public void setid(int n){
        id=n;
    }
    public int getid(){
        return id;
    }
    public myemployee(){
        name="prashant";
        id=54;
    }
    myemployee(String myname, int m){
        name=myname;
        id=m;
    }
}
public class constructor {
    public static void main(String[] args) {
        myemployee em1=new myemployee("prashant", 54);
        // em1.setname("prashant");
        // System.out.println(em1.getname());
        // em1.setid(54);
        // System.out.println(em1.getid());
        System.out.println(em1.getname());
        System.out.println(em1.getid());
    }
}
