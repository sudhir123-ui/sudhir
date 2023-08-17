package Practice;

public class SS {

	public static void main(String[] args) {
		for (int i = 0; i <5; i++) {
			for (int j = 0; j <5; j++) {
				if (j==0) {
					System.out.print("1 ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
//||i==4||i==2||j==0&&i==1||j==4&&i==3