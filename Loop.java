package javaPractice;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		
		String shipment_type;
		double shipment_cost;
		double local_cost=0;
		double state_cost=0;
		double country_cost=0;
		String choice;
		Scanner sc=new Scanner(System.in);
        do
        {
        	System.out.println("enter type of shipment");
        	shipment_type= sc.nextLine();
            System.out.println("enter cost of shipment");
        	shipment_cost=sc.nextDouble();
        	sc.nextLine();
        	if(shipment_type.equals("L"))
        	{
        		local_cost=local_cost+shipment_cost;
        	}
        	else
        		if(shipment_type.equals("S"))
            	{
            		state_cost=state_cost+shipment_cost;
            	}
        	else{
        		country_cost=country_cost+shipment_cost;	
        	
        }
        	System.out.println("Do you wish to continue(Y/N)");
        	choice=sc.nextLine();
        }while(choice.equals("y"));
	
        System.out.printf("Local cost is: %.2f\n", local_cost);
        System.out.printf("State cost is: %.2f\n", state_cost);
        System.out.printf("country cost is: %.2f\n", country_cost);
        sc.close();
	}

}
