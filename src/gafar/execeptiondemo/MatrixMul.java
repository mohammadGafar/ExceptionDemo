package gafar.execeptiondemo;

public class MatrixMul {
	int a[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
	int b[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
	int c[][] = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };

	/*
	 * int r1=3,c1=3; int r2=3,c2=3; int r3=3,c3=3;
	 */
	void calculate() {

		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				for (int k = 0; k < 3; k++)
					c[i][j] += a[i][k] * b[k][j];

		display();

	}

	private void display() {
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++)
				System.out.print(" "+c[i][j]);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		MatrixMul obj = new MatrixMul();
		obj.calculate();
		
	}

}
