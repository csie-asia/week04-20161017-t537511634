package hw;

import java.util.Scanner;

public class hw03_1050210XX {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while(true){
			int n= scn.nextInt(),m= scn.nextInt();
			for(int i = 1;i <=n;i++){
				for(int f = 1;f <=m;f++){
					System.out.print(i+"*"+f+"="+i*f+"\t");
				}
				System.out.println();
			}
				System.out.println("是否繼續(Y/n)");
				char a =scn.next().charAt(0);
				if(a=='N'&& a!='n'){
					System.out.println("程式已結束");
					break;
					
				}
		}
		// TODO Auto-generated method stub

	}

}
