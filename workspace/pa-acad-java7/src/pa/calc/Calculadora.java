package pa.calc;

public class Calculadora {

	public static void main(String[] args) {
		// OperEx Example
		OperEx opEx = new OperEx();
		double resEx = opEx.oper(1, 3);
		System.out.println(resEx);
		
		// Oper02 - Solution
		Oper02 op02 = new Oper02();
		double res02 = op02.oper(10, 2);
		System.out.println(res02);

	}

	public static double adicionar(double número1, double número2){

	    return número1 + número2;
    }

    public static double subtrair(double número1, double número2){

	    return número1 - número2;
    }

//este comentário serve só para testar a ver se isto funciona, don't mind me

}
