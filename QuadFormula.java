import java.util.*;
public class Main {

    public static void main(String[] args) {
        double a, b, c;
        do{
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a value for a: ");//asks for a value for a
            a = scan.nextDouble();//saves the value inputted as a
            if(a!=0){//as long as a is not zero, the program will run
                System.out.print("Enter a value for b: ");//asks for a value for b
                b = scan.nextDouble();//saves the value inputted as b
                System.out.print("Enter a value for c: ");//asks for a value for c
                c = scan.nextDouble();//saves the value inputted as c
                double bSquared = Math.pow(b,2);//it squares the b
                double fourAC = 4*a*c;//multiplies 4ac
                double radical = bSquared-fourAC;//saves bsqaured minus 4ac as the discriminant named radical
                if(radical<0){//as long as discriminant is negative if statement will run
                    System.out.println("You  have an imaginary root!");//This statement will print
                    double bImaginary = Math.sqrt(-radical);//it will take the square root of the positive version of the discriminant
                    double aImaginary = (-b)/(2*a);//it solves for a in the form a+bi where a is equal to -b/2a
                    System.out.println("The roots are "+aImaginary+" plus or minus "+bImaginary+"i.");//will print the roots in a+/-bi form
                }else{//if discriminants are not negative
                    double sqrted = Math.sqrt(radical);//takes sqaure root of radical which is definately positive
                    double numerator = -(b)-sqrted;//the numerator is -b minus the sqrt
                    double numerator2 = -(b)+sqrted; //the second numerator is the positive number
                    double denominator = 2*a;//sets denominator equal to 2a
                    double finalAnswer = numerator/denominator;//divides the negative numerator with denominator
                    double finalAnswer2 = numerator2/denominator;//divides the positive numerator with denominator
                    System.out.println("The roots are "+finalAnswer+" and "+finalAnswer2);//prints the 2 roots
                }
            }
        }while(a!=0);
    }
}
