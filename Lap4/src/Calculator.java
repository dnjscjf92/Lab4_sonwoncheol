
public class Calculator {
	
	public double add(double x, double y){
		
		
		return x+y;
	}
	
	public double sub(double x,double y){
		
		return x-y;
	}
	
	public double div(double x, double y){
		
		double div = x/y;
		if(y==0){
		System.out.println("!!!!ERROR!!!!");
		div = -1;
		}
		
		return div;
	}
	
	public double mul(double x, double y){
		
		return x*y;
	}
	
	public double remainder(double x, double y){
		
		
		return x%y; 
	}
	
	public String toString(){
	String a = "LeeHakSeung,201221014,ChoiJungonyg,201221764,Sonwoncheol,201220598,https://github.com/hakseunglee/lap4_calculator.git";
	
	return a;
	}
}
