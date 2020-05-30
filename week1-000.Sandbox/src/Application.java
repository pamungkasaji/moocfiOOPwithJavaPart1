// This is not an exercise but a "sandbox" where you can freely test
// whatever you want

public class Application {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        add(a, b);
        System.out.println(a);
        System.out.println(b);
        // Write the code here. You can run the code by
        // selecting Run->Run File from the menu or by pressing Shift+F6

    }

    public static void add (int a, int b){
        a += b;
    }
}
