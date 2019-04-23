package GUI;
import Backend.*;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

import java.util.Scanner;

public class Main {
	private String username = "username";
    private String password = "password";
    private String Q = "Q";
    private FileWriter writer;
    private ArrayList<Customer> Cust_array = new ArrayList<Customer>();;
    c_list = Cust_array;
    
    //Customer cus = new Customer ();
    //int index =  getSelectedIndex()
    
    
   

    public static void cls(){
        try{
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }catch(Exception E)
        {
            System.out.println(E);
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.print("Loading...");
        System.out.flush();
    }

    public void showCustomers(){
        SalesRep x = new SalesRep("Tai","White","csdc132");
        x.showall();
    }
    
    public void createCustomer() {
    	
        ///TODO these below here, I'm not sure if they should have CUtomer and vehicle info but 
        ///they need (each variable needs to be added to the array list for cumtomers, I'm Dying I really am dying because)
        
    	 Scanner cust = new Scanner(System.in);
         System.out.print("Customer's Firstname: ");
         String fn = cust.nextLine();//.replaceAll("\\s+","");
         System.out.print("Customer's Lastname: ");
         String ln = cust.nextLine();
         System.out.print("Customer's Bank Account number: ");
         String actnm = cust.nextLine();
         System.out.print("Customer's License Plate Number");
         String lpltnum = cust.nextLine();
         System.out.print("Vehicle Colour");
         String color = cust.nextLine();
         System.out.print("Vehicle Type [Car, Truck, Motorcycle]");
         String vtype = cust.nextLine();
         System.out.print("Vehicle's Registration Number");
         String Vreg = cust.nextLine();
         System.out.print("Vehicle Owner");
         String owner = cust.nextLine();
         
         SimpleDateFormat dformat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
     	 String todayz = dformat.format(new Date());
         
         writer = new FileWriter("Login Data for "+todayz+".csv", true);
		 writer.write("Number,First Name, Last Name,Points,Fieldgoals Made,Fieldgoals Taken,FieldGoal Percentage,"
					+ "3 Point Shots Made,3 Point Shots Taken,3 Point Shot Percentage,Free Throws Made,Free Throws Taken,"
					+ "Free Throw Percentage,Blocks,Assists,Steals,Fouls,Rebounds\n");

	     for (Customer p : c_list) // loops through Customers to update info
		{ // written with comma separator cause DUh CSV
				writer.write(p.getFname() + "," + p.getLname() + "," + p.getBankAccountNum() );
			}

			writer.flush();
			writer.close();
         
    	
    }

    public void login(){
        Scanner in = new Scanner(System.in);
        System.out.print("Username: ");
        String u = in.nextLine().replaceAll("\\s+","");
        System.out.print("Password: ");
        String p = in.nextLine();
        if(!(username.equals(u) && password.equals(p))){
            login();
        }
        else {
        	
        	SimpleDateFormat dformat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
        	String todayz = dformat.format(new Date());
        	
        	SimpleDateFormat tformat = new SimpleDateFormat("HH:mm:ss");
        	String todayzTime = tformat.format(new Date());
            
            writer = new FileWriter("Login Data for "+todayzTime+".csv", true);
   		    writer.write("Usernames" + "," + todayzTime + "\n");

   	    // written with comma separator cause DUh CSV
   		 writer.write(u  + "," + todayzTime );
   			

   			writer.flush();
   			writer.close();
        	
        	
        	
            SRmenu();
        }
    }

    public void SRmenu(){
        String A = "A";
        String B = "B";
        Scanner choice = new Scanner(System.in);
        String Screen = "|---------------------------|\n"+
                        "|   SALES REPRESENTITIVE    |\n"+
                        "|---------------------------|\n"+
                        "Select: \n"+
                        "[A] View Customers\n"+
                        "[B] Find Customer\n"+
                        "[C] Create Customers\n"+
                        "[D] \n"+
                        "[E]\n"+
                        "[Q] Quit to Log in\n";

        System.out.println(Screen);
        String letter = (choice.nextLine()).toUpperCase();
        if (letter.equals("Q") ){
            login();
        } 
        
        else if (letter.equals("A") ) {
            showCustomers();
        }
        
        else if (letter.equals("B") ) {
        	
        } 
        
        else if(letter.equals("C") ) {
        	createCustomer();       	
        }
    }

    public static void main(String[] args){
        Main mm = new Main();

       mm.login();

    }
}

