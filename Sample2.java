package javaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of containers:");
		Integer con=Integer.parseInt(br.readLine());
		System.out.println("Enter the item number:");
		Integer item=Integer.parseInt(br.readLine());
		Integer rem=1;
		if(item>con)
		{
		rem= item%con;

	    }
		else
			if(item<=con)
			{
				rem= item;
			}
		System.out.println("Item number" +  " " +item + " " +"is in container" + " " +rem);  
	}
	
}
