package java_16_2;

import java.util.Scanner;

public class searching {

	private static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3, 1, 88, 24, 62, 21, 72, 33, 56, 31};
		
		for(int i=0;i<array.length;i++){
			for(int j=0; j<array.length;j++){
				if(array[j]>array[i]){
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		
		scan = new Scanner(System.in);
		int num;
		System.out.print("찾을 숫자를 입력해 주세요 : ");
		num = scan.nextInt();
		
		int start=0;
		int end=array.length-1;
		int res=0;
		while(start!=end){
			int avg = (start+end)/2;
	
			if(array[avg]==num){
				System.out.println(num + "가 존재합니다.");
				res=1;
				break;
			}
			else if( array[avg]<num){
				start = (start+end)/2+1;
			}
			else if(array[avg]>num){
				end = (start+end)/2;
			}
		}
		if(res==0)
			System.out.println(num + "가 존재하지 않습니다.");
		
	}
}
