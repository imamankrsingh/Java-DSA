import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        Integer in = Integer.valueOf(4);
        System.out.println(in);

        float f = Float.valueOf(4.5f);
        System.out.println(f);

        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        System.out.println(l1.get(1));

        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }

        System.out.println(l1);

        l1.add(1, 100);
        System.out.println(l1);

        l1.set(1, 10);
        System.out.println(l1);

        l1.remove(1);
        System.out.println(l1);

        l1.remove(Integer.valueOf(7));
        System.out.println(l1);

        boolean ans = l1.contains(60);
        System.out.println(ans);

        ArrayList<Object> l = new ArrayList<>();
        l.add("pqres");
        l.add(1);
        l.add(true);

        System.out.println(l);
    }
}