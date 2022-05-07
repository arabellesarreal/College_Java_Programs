public class ComplexNumber
{
	private double real_number = 0;
	private double imaginary_number = 0;
	public double getReal_number()
	{
		return real_number;
	}
	public void setReal_number(double real_number)
	{
		this.real_number = real_number;
	}
	public double getImaginary_number()
	{
		return imaginary_number;
	}
	public void setImaginary_number(double imaginary_number)
	{
		this.imaginary_number = imaginary_number;
	}
	ComplexNumber(double real_number , double imaginary_number)
	{
		this.real_number = real_number;
		this.imaginary_number = imaginary_number;
	}
	public void read()
	{
		
	}
	public ComplexNumber add(ComplexNumber other)
	{
		ComplexNumber result = new ComplexNumber(
				(real_number + other.real_number),
				(imaginary_number + other.imaginary_number));
		return result;
	}
	public ComplexNumber subtract(ComplexNumber other)
	{
		ComplexNumber result = new ComplexNumber(
				(real_number - other.real_number),
				(imaginary_number - other.imaginary_number));
		return result;	
	}
	public ComplexNumber multiply(ComplexNumber other)
	{
		ComplexNumber result = new ComplexNumber(
				(real_number * other.real_number - imaginary_number * other.imaginary_number),
				(real_number * other.real_number + imaginary_number * other.imaginary_number));
		return result;
	}
	public ComplexNumber divide(ComplexNumber other)
	{
		ComplexNumber result = new ComplexNumber(
				((real_number * other.real_number + imaginary_number * other.imaginary_number)/
						((other.real_number*other.real_number)+(other.imaginary_number*other.imaginary_number)))
				,((real_number * other.real_number - imaginary_number * other.imaginary_number)/
						((other.real_number*other.real_number)+(other.imaginary_number*other.imaginary_number))));
		return result;
	}
	public boolean equals(ComplexNumber other)
	{
		if(real_number == other.real_number && imaginary_number == other.imaginary_number)
			return true;
		else
			return false;
	}
	public String toString()
	{
		return real_number + " + " + imaginary_number + "i";
	}

}
