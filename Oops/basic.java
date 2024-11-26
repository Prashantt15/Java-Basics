class employee{
    int id;
    String name;
    String department;
    public void getDetail(){
        System.out.println("Employee id is "+id);
        System.out.println("Employee name is "+name);
        System.out.println("Employee department is "+department);
    }
}
public class basic {
    public static void main(String[] args){
        employee empl=new employee();
        empl.name="Prashant";
        empl.id=101;
        empl.department="SWE";
        empl.getDetail();
    }
}
