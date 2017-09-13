/*Daniel Zheng
 * September 6, 2017
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
		if(operand%factor==0) {
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
	//dtermine maximum out of two numbers
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
}

	

