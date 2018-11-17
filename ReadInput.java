package javaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInput {

	public static void main(String[] args) throws IOException {

     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter the agent details");
     System.out.println("Enter Agent name");
     String name= br.readLine();
     System.out.println("Enter identification number");
     Integer id=Integer.parseInt(br.readLine());
     System.out.println("Enter credit limit");
     Double cr=Double.parseDouble(br.readLine());
     
     System.out.println("Agent details are:");
     System.out.println("Name:" + name);
     System.out.println("Id Number:" + id);
     System.out.println("Credit Limit:" + cr);

	}

}
