interface DaoInteface{
    boolean login();
    boolean logout();
}
class DaoImpl implements DaoInteface{
    public boolean login() {
        return true;
    }
    public boolean logout() {
        return false;
    }
}

public class Demo{
    public static void main(String[] args){
        DaoImpl obj=new DaoImpl();
        System.out.println(obj.login());
        System.out.println(obj.logout());
        
    }
}