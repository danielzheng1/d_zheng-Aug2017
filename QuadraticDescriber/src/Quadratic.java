//Daniel Zheng
public class Quadratic {
	public static String quadrDescriber(double a, double b, double c) {
		System.out.println("Description of the graph of:\n" + "y = " + a + " x^2 + " + b + " x + " + c + "\n");
		String open = "Opens: ";
		String aos = "Axis of Symmetry: " + (-b / (2 * a) + "\n");
		double xvertex = -b / (2 * a);
		double yvertex = (a * (xvertex * xvertex)) + (b * xvertex) + c;
		String xroots = ("x-intercept(s): " + quadForm(a,b,c) + "\n");
		String yroots = ("y-intercept: (0, " + c + ")\n");
		String vertex = "Vertex: (" + xvertex + ", " + yvertex+ ")\n";
		
		if (a > 0) {
			open += "Up\n";
		} else {
			open += "Down\n";
		}
		
		return  open + aos + vertex + xroots + yroots ;
	}
	public static double round2(double numero) {
		
		if(numero*1000%10<5) {
			return (numero*1000-(numero*1000%10))/1000;
		} else {
			return (numero*1000-((numero*1000%10))+10)/1000;
		}
	}
	public static double discriminant(double a,double b, double c) {
		
		return ((b * b) - 4 * a * c);
	}
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
	public static String quadForm(double a, double b,double c) {
		if (discriminant(a,b,c) < 0) {
			return "None";
		}
		else if(discriminant(a,b,c) > 0) {
			double max = round2((-b + sqrt(discriminant(a,b,c))/(2 * a)));
			double min = round2((-b - sqrt(discriminant(a,b,c))/(2 * a)));
			return "roots at " + min + " and " + max;
		}
		else {
			return "(" + -b / (2 * a) + ", 0)";
		}
		
	}
	
}
