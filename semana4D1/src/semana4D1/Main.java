package semana4D1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hola mundo");
		
		int a=1;
		int b=81;
		int resultado =0;
		
		resultado = a+b;
		
		//Suma de 2 numeros//
		System.out.println("Suma:"+ resultado);
		
		float d = 3.14159678f;
		float c= 10.344444444444f;
		float resf = 0.0f;
		
		resf=d+c;
		System.out.print("Suma de flotantes:"+resf );
		System.out.println(d+b);
		
		//chicharronera
		double x1=((-b)+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/2*a;
		double x2=((-b)-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/2*a;
		
		System.out.println("Chicharronera: X1= "+x1+" , X2= "+x2);
		
		
		
		
		
	}
}
