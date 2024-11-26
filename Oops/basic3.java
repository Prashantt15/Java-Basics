class employee{
    private int id;
    String name;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
}
public class basic3 {
    public static void main(String[] args) {
        employee prashant=new employee();
        prashant.setId(101);
        System.out.println(prashant.getId());
    }
}
