import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws MyException{
        int result = 0;

        try {
            result = Division.division(100, 0);
        } catch (ArithmeticException exception) {
            Logger.getLogger(Division.class.getName()).log(new LogRecord(Level.WARNING, "Not possible to use 0 as divider!") );
            throw new MyException(exception);
        }
        System.out.println("Result is: " + result);
    }
}
