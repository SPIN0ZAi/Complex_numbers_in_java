package ComplexPackage;

public class Main {
    public static void main(String[] args){

        // testing the double constructor

        ComplexNumber num0 = new ComplexNumber(3.2,5.7);

        // testing the int constructor
        ComplexNumber num1 = new ComplexNumber(3, 2); // 3 + 2i
        ComplexNumber num2 = new ComplexNumber(1, 7); // 1 + 7i

        // testing the copy constructor

        ComplexNumber num4 = new ComplexNumber(num1);

        // testing the sum method
        ComplexNumber result_sum = num1.sum(num2);
        result_sum.display();

        // testing the subtract method
        ComplexNumber result_subtract = num1.subtract(num2);
        result_subtract.display();


        // testing multiply by a scalar
        ComplexNumber result_scalar = num1.multiply(5);
        result_scalar.display();

        // testing multiply by another complex number
        ComplexNumber result_multiply = num1.multiply(num2);
        result_multiply.display();

        // testing the ToString method
        String string = result_multiply.toString();
        System.out.println("this is the ToString method"+ string);

        // testing equal method
        System.out.println("this is a check to see if they are equal "+ num1.equals(num2));

        ComplexNumber result = num1.multiply(num2); // Multiplication
        result.display(); // Output: -11.0 + 23.0i




    }
}