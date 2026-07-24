
public class basics {
    public static void main(String[] args) {

        
        String str = "Hello World";

        
        System.out.println("Length: " + str.length());

        
        System.out.println("Character at index 0: " + str.charAt(0));

        
        System.out.println("Character at index 6: " + str.charAt(6));

        
        String str1 = "Hello";
        String str2 = "World";


        System.out.println("Using + : " + str1 + " " + str2);


        String str3 = str1.concat(" ").concat(str2);
        System.out.println("Using concat(): " + str3);
    }
}