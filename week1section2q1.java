public class week1section2q1 {

    public static void badSwap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        Integer a = 5; 
        Integer b = 10;
        
        System.out.println("Value of a: " + a.toString());
        System.out.println("Value of b: " + b.toString());

        badSwap(a, b);

        System.out.println("Value of a: " + a.toString()); 
        System.out.println("Value of b: " + b.toString()); 
    }
}
