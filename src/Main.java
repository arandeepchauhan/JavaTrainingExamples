

public class Main {

    private int testNumber = 10;
    public void printTestNumber(){
        System.out.println(testNumber);
    }

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {

        int localVar = 100 ;

        Main obj= new Main();
        obj.printTestNumber();
        // prints a sample text.
        System.out.println("Hello World!= "+localVar);
    }


}
