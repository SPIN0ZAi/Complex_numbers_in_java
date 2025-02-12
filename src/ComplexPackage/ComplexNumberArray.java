package ComplexPackage;

public class ComplexNumberArray {
    ComplexNumber[] Numbers;

    // simple constructor to initialize an empty array
    public ComplexNumberArray() {
        this.Numbers = new ComplexNumber[0];
    }
    // since we are not initializing the Array the values would be 0

    public ComplexNumberArray(int size) {
        this.Numbers = new ComplexNumber[size];
        for (int i = 0; i < size; i++) {
            this.Numbers[i] = new ComplexNumber(); // Initialize each element with default (0.0 + 0.0i)
        }
    }

    public ComplexNumber[] getNumbers() {
        return Numbers;
    }

    public void setNumbers(ComplexNumber[] numbers) {
        Numbers = numbers;
    }


    // Method to sum all the complex numbers in the array
    public static ComplexNumber sumArray(ComplexNumber[] numbers) {
        ComplexNumber sum = new ComplexNumber(0, 0);

        for (ComplexNumber number : numbers) {
            sum = sum.sum(number); // Corrected to sum each individual complex number
        }
        return sum;
    }

    public void ToString(ComplexNumber[] numbers){

        for (ComplexNumber number : numbers) {
            number.display();

        }



    }

}



