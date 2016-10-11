package java_16_2;

import java.io.IOException;
import java.util.Scanner;

public class QuickCoding3 {
	
	public static void main(String[] args) throws Exception{
		
		Scanner scan = new Scanner(System.in); 

		System.out.print("input number1: ");
		String input1 = scan.nextLine(); 
		System.out.print("input number2: ");
		String input2 = scan.nextLine(); 

		int num1,num2;
		int result;

		try{
			num1 = Integer.parseInt(input1);
			num2 = Integer.parseInt(input2);
			
			result= num1/num2;    
			System.out.println(result);
			if(num1>999||num2>999)
				throw new MyException();
		}
		catch(NumberFormatException ee){
			System.out.println("you must input number.");
		}
		catch(ArithmeticException ae){
			System.out.println("can not divided zero.");
		}
		
	}

}
class MyException extends Exception{
    
    public MyException(){
        super("3자리수를 넘을 수 없습니다.");
    }
}
