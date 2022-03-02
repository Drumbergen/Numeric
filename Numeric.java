public class Numeric{

        public static void main(String[] args){
        
        //For every method you wrote, write at least two calls that will return different values.
        
        // a) write a method to detect if an integer value is odd

        System.out.println("Is 42 odd? reply : " + detectOdd(42));
        System.out.println("Is 43 odd? reply : " + detectOdd(43));

        // b) write a method to detect if an integer value is even
        System.out.println("Is 4711 even? reply : " + detectEven(4711));
        System.out.println("Is 4712 even? reply : " + detectEven(4712));

        // c) write a method to compute the square of an integer
        System.out.println("Square of 25 is " + computeSquare(25));
        System.out.println("Square of -35 is " + computeSquare(-35));

        // d) write a method to compute the cube of an integer
        System.out.println("Cube of 25 is " + computeCube(25));
        System.out.println("Cube of -25 is " + computeCube(-25));

    }

    public static boolean detectOdd (int i){
        // a) write a method to detect if an integer value is odd

        boolean detectOdd = false;
        int rest = 1;
        
        rest = i%2;
        if (rest == 0){
            detectOdd = false;
        } else {
            detectOdd = true;
        }

        return detectOdd;
    }

    public static boolean detectEven (int i){
        // b) write a method to detect if an integer value is even
      
        return (i%2 == 0);
        
    }

    public static int computeSquare (int i){
        // c) write a method to compute the square of an integer
            
        return (i * i);
        
    }

    public static int computeCube (int i){
        // d) write a method to compute the cube of an integer
            
        return (computeSquare(i) * i);
        
    }

}