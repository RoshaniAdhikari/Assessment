package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class VehicleShowroomMain {
	static 	Scanner sc=new Scanner(System.in);

public static void main(String[] args) {
	List<VehicleShowroom>show=new ArrayList<VehicleShowroom>();
	int count=0;
	while(true)
	{
		if(count!=0)
		{
			System.out.println("Do You Want To Continue, Then Press 'Yes'");
			String s=sc.next();
			if(s.equalsIgnoreCase("yes")){	
			}
			else
			{
				System.exit(0);
			}
		}	
		count++;
		System.out.println();
        System.out.println("Menu In Vehicle Management System :");
        System.out.println();
        System.out.println("1. Add Vehicle To Library");
        System.out.println("2. Update List Of Vehicle ");
        System.out.println("3. Display Vehicle Data");            
        System.out.println("4. Delete Vehicle Data");
        System.out.println("5. Search Vehicle");
        System.out.println("6. Exit");
        System.out.println();
        System.out.print("Enter Your Choice: ");
        System.out.println();
        int choice = sc.nextInt();
        switch (choice) {
		case 1: 
			VehicleShowroom sho=VehicleShowroomActivity.addVehicle();
			show.add(sho);
			System.out.println("Vehicle Data Is Added");
		    break;
		case 2:
			
			VehicleShowroomActivity.updateVehicle(show);
			break;
		case 3:
			VehicleShowroomActivity.displayVehicle(show);
			break;
		case 4:
			VehicleShowroomActivity.deleteVehicle(show);
			break;
		case 5:
			VehicleShowroomActivity.searchVehicle(show);
			break;

		default:
            System.out.println("Invalid Choice. Please Enter A Valid Option.");
            break;
		}

	}
}
}
