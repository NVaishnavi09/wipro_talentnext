package java_fundamentals;


public class Question_13 {
	

		public static void main(String[] args) {
			int n=3;
			int row=1;
			while(row<=n) {
				for(int i=1;i<=row;i++) {
					System.out.print("*");
				}
				System.out.println();
				row++;
			}
		}

	}

