package delta;

import java.util.Scanner;

public class Delta {
	
		Scanner read = new Scanner(System.in);

		private Integer a;
		private Integer b;
		private Integer c;
		private Double delta;
		
		public Delta(Integer a, Integer b, Integer c) {
			this.a=a;
			this.b=b;
			this.c=c;	
	}

		public Integer getA() {
			return a;
		}

		public void setA(Integer a) {
			this.a = a;
		}

		public Integer getB() {
			return b;
		}

		public void setB(Integer b) {
			this.b = b;
		}

		public Integer getC() {
			return c;
		}

		public void setC(Integer c) {
			this.c = c;
		}
		
		public void numeroDeRaizes() {
			
			System.out.println("Digite o valor de A, B e C: respectivamente: ");
			a = Integer.parseInt(read.next());
			b = Integer.parseInt(read.next());
			c = Integer.parseInt(read.next());
			
			delta = (double) ((b*b)+ (-4 * (a*c)));
			
			if(delta > 0) {
				System.out.println("2 raízes");
			}else if(delta == 0) {
				System.out.println("1 raiz");
			}else {
				System.out.println("0 raiz");
			}
			
		}
		
		public static void main(String[] args) {
		}
				

}
