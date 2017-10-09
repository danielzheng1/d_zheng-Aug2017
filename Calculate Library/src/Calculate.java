/*Daniel Zheng
 * September 29, 2017
 * Our self written math library
 * It contains a series of methods to do basic math functions
 */
public class Calculate {
	
	//square the input
	public static int square (int operand) {
		return operand*operand;
	}
	//cube the input
	public static int cube (int operand) {
		return operand*operand*operand;
	}
	//average the two input
	public static double average (double number1, double number2) {
		return (number1+number2)/2;
	}
	//average the three input
	public static double average (double number1, double number2, double number3) {
		return (number1+number2+number3)/3;
	}
	//convert radians to degrees
	public static double toDegrees (double operand) {
		return (operand*180/3.14159) ;
	}
	//convert degrees to radians
	public static double toRadians (double operand) {
		return (operand*3.14159/180) ;
	}
	//return discriminant
	public static double discriminant (double number1, double number2, double number3) {
		return (number2*number2-4*number1*number3) ;
	}
	//convert mixed number to improper fraction
	public static String toImproperFrac (int number1, int number2, int number3) {
		return (number1*number3+number2 + "/" + number3) ;
	}
	//convert improper fraction to mixed number
	public static String toMixedNum (int number1, int number2) {
		return (number1/number2 +" " + number1%number2 + "/" + number2) ;
	}
	//foil
	public static String foil (int number1, int number2, int number3, int number4, String variable) {
		return ((number1*number3 + variable+("^2"))+"+"+(number1*number4 + number2*number3 + variable)+(number2*number4)) ;
	} 
	//determines whether integer is divisible by another
	public static boolean isDivisibleBy (int operand, int factor) {
		if(factor == 0) {
			throw new ArithmeticException();
		}
		if(operand%factor == 0) {
			return true;
		} else {
			return false;
		}
	}
	//determine absolute value
	public static double absValue (double operand) {
		if(operand >= 0) {
			return operand;
		} else {
			return operand*(-1);
		}
	}
	//determine maximum out of two numbers
	public static double max (double firstNumber, double secondNumber) {
		if(firstNumber>secondNumber) {
			return firstNumber;
		} else {
			return secondNumber;
		}
	}
	//find maximum out of three numbers
	public static double max (double firstNumber, double secondNumber, double thirdNumber) {
		if(firstNumber>secondNumber && firstNumber>thirdNumber) {
			return firstNumber;
		} else if(secondNumber>firstNumber && secondNumber>thirdNumber) {
			return secondNumber;
		} else {
			return thirdNumber;
		}
	}
	//determine minimum out of two numbers
	public static int min (int firstNumber, int secondNumber) {
		if(firstNumber<secondNumber) {
			return firstNumber;
		} else {
			return secondNumber;
		}
	}
	//round a number to 2 decimal places
	public static double round2 (double numero) {
		if(numero*1000%10<5) {
			return (numero*1000-(numero*1000%10))/1000;
		} else {
			return (numero*1000-((numero*1000%10))+10)/1000;
		}
	}
	//applying an exponent to a number
	public static double exponent(double base, int exponent) {
		if(exponent < 0) {
			throw new ArithmeticException();
		}
		double result = base;
			for(int i = 1; i < exponent; i++) {
				result *= base;
			}
			return result;
	}
	//determine factorial of input
	public static int factorial(int n) {
		if(n < 0) {
			 throw new ArithmeticException();
		}
		int product = 1;
			for(int i = 2; i <= n; i++) {
			product = product * i;
			}
			return product;
		}
	//determine whether or not integer is prime
	public static boolean isPrime(int n) {
		if(n<2) {
			return false;
		}
		for(int i = 2; i < n; i++) {
			if(isDivisibleBy(n, i)) {
				return false;
			}
		}
		return true;
	}
	//determine greatest common factor of two integers
	public static int gcf(int a, int b) {
		int i;
		for(i = b; !(isDivisibleBy(b, i) && isDivisibleBy(a, i)); i--) {
		}
		return i;
	}
	//square root an input
	public static double sqrt(double n) {
		if(n < 0) {
			throw new ArithmeticException();
		}
		double approx = n/2;
		double result = 0;
		while(result != (n/approx + approx)/2) {
			result = (n/approx + approx)/2;
			approx = result;
		}
		return round2(result);
	}
	//find real roots using quadratic formula
	public static String quadForm(int a, int b, int c) {
		if(discriminant(a, b, c) < 0) {
			return "no real roots";
		} else {
			double add = (-b + sqrt(discriminant(a, b, c)))/(2 * a);
			double subtract = (-b - sqrt(discriminant(a, b, c)))/(2 * a);
			
			if(add != subtract) {
				if(max(add, subtract) == add) {
					return round2(subtract) + " and " + round2(add);
				} else {
					return round2(add) + " and " + round2(subtract);
				}
			} else {
				return round2(add) + " ";
			}
		}
	}
}
	
		
	
	
	
	

	

