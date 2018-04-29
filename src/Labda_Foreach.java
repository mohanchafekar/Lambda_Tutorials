import java.util.ArrayList;
import java.util.List;


public class Labda_Foreach {

	public static void main(String[] args) {
		
        List<String> list=new ArrayList<String>();  
		list.add("ankit");  
		list.add("mayank");  
		list.add("irfan");  
		list.add("jai");  

		// Lambda expression passed as an argument to the method
		list.forEach(
			(n)->System.out.println(n)
		);
	}

}
