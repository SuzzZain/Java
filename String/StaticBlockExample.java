package String;

//A static block is a block of code that is executed when the class is first loaded into memory. It is used to initialize static variables or perform setup actions.
    class StaticBlockExample {
        static int a;
        static int b;
    
        // Static block to initialize variables
        static {
            a = 10;
            b = 20;
            System.out.println("Static block executed");
        }
    
        public static void main(String[] args) {
            System.out.println("a = " + a);  
            System.out.println("b = " + b);  
        }
    }

