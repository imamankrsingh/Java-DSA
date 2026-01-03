// public class Passingarguments {

//     public static void aman(String name){
//         System.out.println("Good morning "+name);
//     }
//     public static void main(String[] args) {
//         aman("Aman");
//     }
// }

public class Passingarguments{

    
    public static void main(String[] args) {
        aman(5,9,3);
    }
    public static void aman(int a, int b, int c){
        System.out.println("Sum is "+(a+b+c));
    }
}