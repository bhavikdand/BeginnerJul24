package adv_lc_1.generics.intro;

public class Main {

    public static void main(String[] args) {
        ObjectPrinter objectPrinter = new ObjectPrinter("Bhavik");
        String s = (String) objectPrinter.get();
        System.out.println(s);
//        Integer i = (Integer) objectPrinter.get();


        Printer<Integer> pi = new Printer<>(5);
        pi.print();

        Printer<String> ps = new Printer<>("Hello");
        pi.print();

        Pair<String, Integer> psi = new Pair<>("Hello", 6);

        print(5);
        print("Hello");
        print(psi);
        print(new Dog());
    }

    public static <T> void print(T something){
        System.out.println(something);
    }
}

class Dog{

}
