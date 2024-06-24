import java.util.*;

class SampleCode{

	public static void main(String [] args){

		String name_1 = "sabeer";
		String name_2 = "sabeer";
		if(name_1 == name_2){
			System.out.println("Yes");
		}

		String name_3 = new String("sabeer");
		String name_4 = new String("sabeer");
		if(name_4 == name_3){
			System.out.println("Yes");
		}else{
			System.out.println("No, couldn't compare using ==");
		}

		System.out.println("Checking using equals method");
		if(name_4.equals(name_3)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
