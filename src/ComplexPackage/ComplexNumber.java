package ComplexPackage;

/**
 * Represents a complex number with real and imaginary parts.
 * Provides methods for basic arithmetic operations on complex numbers.
 */
public class ComplexNumber {
    private double real;
    private double imaginary;

    /**
     * Default constructor that initializes the complex number to (0.0 + 0.0i).
     */
    public ComplexNumber() {
        this.real = 0.0;
        this.imaginary = 0.0;
        System.out.println("Complex number object is created with default values (0.0 + 0.0i)!");
    }

    /**
     * Constructor that initializes the complex number with the given real and imaginary parts.
     *
     * @param real      The real part of the complex number.
     * @param imaginary The imaginary part of the complex number.
     */
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * Constructor that initializes the complex number with integer values.
     *
     * @param real      The real part as an integer.
     * @param imaginary The imaginary part as an integer.
     */
    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * Copy constructor that creates a new complex number from an existing one.
     *
     * @param other The complex number to copy.
     */
    public ComplexNumber(ComplexNumber other) {
        this.real = other.real;
        this.imaginary = other.imaginary;
    }

    /**
     * Gets the real part of the complex number.
     *
     * @return The real part.
     */
    public double getReal() {
        return real;
    }

    /**
     * Gets the imaginary part of the complex number.
     *
     * @return The imaginary part.
     */
    public double getImaginary() {
        return imaginary;
    }

    /**
     * Sets the real part of the complex number.
     *
     * @param real The new real part.
     */
    public void setReal(double real) {
        this.real = real;
    }

    /**
     * Sets the imaginary part of the complex number.
     *
     * @param imaginary The new imaginary part.
     */
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    /**
     * Adds this complex number to another complex number.
     *
     * @param other The complex number to add.
     * @return A new ComplexNumber representing the sum.
     */
    public ComplexNumber sum(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    /**
     * Subtracts another complex number from this complex number.
     *
     * @param other The complex number to subtract.
     * @return A new ComplexNumber representing the difference.
     */
    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
    }

    /**
     * Multiplies this complex number by an integer scalar.
     *
     * @param v The scalar value.
     * @return A new ComplexNumber representing the product.
     */
    public ComplexNumber multiply(int v) {
        return new ComplexNumber(this.real * v, this.imaginary * v);
    }

    /**
     * Multiplies this complex number by another complex number.
     * Uses the formula: (a + bi) * (c + di) = (ac - bd) + (ad + bc)i
     *
     * @param other The complex number to multiply with.
     * @return A new ComplexNumber representing the product.
     */
    public ComplexNumber multiply(ComplexNumber other) {
        double realPart = (this.real * other.real) - (this.imaginary * other.imaginary);
        double imaginaryPart = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new ComplexNumber(realPart, imaginaryPart);
    }

    /**
     * Displays the complex number in a readable format.
     */
    public void display() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }

    /**
     * Returns a string representation of the complex number.
     *
     * @return A string in the format "ComplexNumber{real=a, imaginary=b}".
     */

    public String toString() {
        return "ComplexNumber{" + "real=" + real + ", imaginary=" + imaginary + '}';
    }

    /**
     * Checks if this complex number is equal to another complex number.
     *
     * @param other The complex number to compare.
     * @return True if the real and imaginary parts are equal, otherwise false.
     */
    public boolean equals(ComplexNumber other) {
        return (this.real == other.real) && (this.imaginary == other.imaginary);
    }
}
