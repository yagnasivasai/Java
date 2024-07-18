public class staticvariable {
    static int x = 10;
    public static void main(String[] args) {
        System.out.println(staticvariable.x);
        System.out.println(x);
        
        staticvariable s = new staticvariable();
        System.out.println(s.x);
    }
}
