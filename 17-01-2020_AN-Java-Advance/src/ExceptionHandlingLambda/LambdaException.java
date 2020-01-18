package ExceptionHandlingLambda;
@FunctionalInterface
interface MyFunctionalInterface{
    int calculate(int i, int j);
}
public class LambdaException {
    // Lambda wrapper
    static MyFunctionalInterface lambdaWrapper(MyFunctionalInterface ref) {
        return (x, y) -> {
            try {
                ref.calculate(x, y);
            }catch(ArithmeticException e) {
                System.out.println("Exception while calculating- " + e.getMessage());
            }
            return -1;
        };
    }
    
    public static void main(String[] args) {
    	
        MyFunctionalInterface ref = lambdaWrapper((x,y)->x/y);
        System.out.println("Result is " + ref.calculate(8, 0));    
    }
}