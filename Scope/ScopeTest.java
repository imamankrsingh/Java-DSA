public class ScopeTest {

    static int x = 10;   
    int y = 20;            

    public void method1() {
        int x = 30; 

        System.out.println("method1 x: " + x);
        System.out.println("method1 y: " + y);

        {
            int z = 40;  
            System.out.println("block z: " + z);
            System.out.println("block x: " + x);
        }


    }

    public static void method2() {
        int x = 50;

        System.out.println("method2 x: " + x);
        System.out.println("static x: " + ScopeTest.x);

        for (int i = 0; i < 2; i++) {
            int y = i * 10;
            System.out.println("loop y: " + y);
        }

     
    }

    public static void main(String[] args) {

        ScopeTest obj = new ScopeTest();

        int x = 100;

        System.out.println("main x: " + x);
        System.out.println("static x: " + ScopeTest.x);
        System.out.println("instance y: " + obj.y);

        obj.method1();
        method2();

        {
            int x2 = 200;
            System.out.println("block x2: " + x2);
        }

     
    }
}