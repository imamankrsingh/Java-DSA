class ScopeDemo {

    int a = 10; 

    void show() {
        int b = 20; 

        System.out.println("Inside method:");
        System.out.println("a = " + a);
        System.out.println("b = " + b); 

        if (true) {
            int c = 30;
            System.out.println("Inside block:");
            System.out.println("a = " + a); 
            System.out.println("b = " + b); 
            System.out.println("c = " + c); 
        }

   
    }

    public static void main(String[] args) {
        ScopeDemo obj = new ScopeDemo();
        obj.show();

    
    }
}