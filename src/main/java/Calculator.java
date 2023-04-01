import java.lang.Math;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    double ans;
    double x, y;
    private static final Logger logger = LogManager.getLogger(Calculator.class);


    public double add(double x, double y){
        double temp = x + y;
        return temp;
    }

    public double increment(double x){
        double temp = x + 1;
        return temp;
    }

    public double square_root(double x)
    {
        Double squareroot = Math.pow(x, 0.5);
        logger.info("[SQRT] - " + x);
        logger.info("[RESULT - SQRT] - " + squareroot);
        return squareroot;
    }
    public static double factorial(double x)
    {
        double ans = 1;
        for(int i = 1; i <= x; i++)
        {
            ans *= i;
        }
        logger.info("[FACTORIAL] - " + x);
        logger.info("[RESULT - FACTORIAL] - " + ans);
        return ans;
    }
    public double natural_log(double x)
    {
        logger.info("[LOG] - " + x);
        logger.info("[RESULT - LOG] - " + Math.log(x));
        return Math.log(x);
    }
    public double power(double a , double b)
    {
        logger.info("[POWER] - " + a + ", " + b);
        logger.info("[RESULT - POWER] - " + Math.pow(a,b));
        return Math.pow(a,b);
    }


    public double evaluate(int op, double x, double y){
        switch(op)
        {
            case(1):
                ans = increment(x);
                break;
            case(2):
                ans = add(x,y);
                break;
            case(3):
                ans = square_root(x);
                break;
            case(4):
                ans = factorial(x);
                break;
            case(5):
                ans = natural_log(x);
                break;
            case(6):
                ans = power(x, y);
                break;

            default:
                System.out.println("wrong option selected");
                break;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true)
        {
            System.out.print("Choose operation \n"+
                "1. Increment \n"+
                "2. Addition  \n"+
                "3. Square root  \n"+
                "4. Factorial  \n"+
                "5. Natural log  \n"+
                "6. Power  \n"+
                "Enter your choice : ");

        int op = scan.nextInt();
        double x = 0;
        double y = 0;

        if (op == 1){
            System.out.print("Enter operand x: ");
            x = scan.nextDouble();
        }
        else if (op == 2){
            System.out.print("Enter operands x y: ");
            x = scan.nextDouble();
            y = scan.nextDouble();
        }
        else if (op == 3){
            System.out.print("Enter operands x: ");
            x = scan.nextDouble();
        }
        else if (op == 4){
            System.out.print("Enter operands x: ");
            x = scan.nextDouble();
        }
        else if (op == 5){
            System.out.print("Enter operands x: ");
            x = scan.nextDouble();
        }
        else if (op == 6){
            System.out.print("Enter operands x y: ");
            x = scan.nextDouble();
            y = scan.nextDouble();
        }

        Calculator mycalc = new Calculator();
        System.out.println("Your Answer: " +  mycalc.evaluate(op, x, y));
        }
        

    }
}