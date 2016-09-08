package java_16_2;

public class Sorting {
	public static void main(String[] args){
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
		
		for(int i=0;i<array.length ; i++){
			System.out.print(array[i]+" ");
		}
	}

}
