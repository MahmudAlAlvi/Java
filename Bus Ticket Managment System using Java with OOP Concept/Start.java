import LogIn.*;
import Classes.*;
import Interfaces.*;
import java.util.*;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import fileio.*;


public class Start
{
	public static void main(String args[])
	{
		LogIn logIn=new LogIn();
		logIn.welcome();
		logIn.systemLogIn();
		System.out.println("\n\t\t*** WELCOME TO SOPTOBODI BUS TICKET SERVICES ***");
		Scanner pc= new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		FileReadWriteDemo frwd= new FileReadWriteDemo();
		String n,bl;
		BusReservation br=new BusReservation();
		
		System.out.println("\t\t==============================================");
		System.out.println("\nTICKET RESERVATION OF SOPTOBODI TRAVELS");
		System.out.println("=======================================");
		
		boolean again=true;
		while(again)
		{
			System.out.println();
			System.out.println("\nHere are some options for you");
			System.out.println("=============================");
			
			System.out.println("=============================");
			System.out.println("1. Bus Ticket Managment");
			System.out.println("2. Customer Managment");
			System.out.println("3. Customer Ticket Managment");
			System.out.println("4. Payment");
			System.out.println("5. Exit The Application");
			System.out.println("=============================");
			
			System.out.println("\nWhat do you want to do?");
			
			
			System.out.println("************************");
			System.out.print("\nEnter your choice:");
			try
			{ // try 1
			int choice=pc.nextInt();
			System.out.println("************************");
			
			
			
			
			switch(choice)
			{
			    case 1:
				System.out.println("\t\t****************************************");
				System.out.println("\t\t  You have selected Bus Ticket Managment");
				System.out.println("\t\t****************************************");
				System.out.println();
				System.out.println("Here are some options for you:");
				
				
				System.out.println("=============================");
			    System.out.println("1. Add Bus Ticket");
			    System.out.println("2. Delete Bus Ticket");
			    System.out.println("3. See All Bus Tickets");
			    System.out.println("4. Go Back");
			    System.out.println("=============================");
				
				System.out.println("\n************************");
				System.out.print("Enter Your Option:");
				int option1=pc.nextInt();
				System.out.println("************************");
				
				
				switch(option1)
				{
					case 1:
					try
					{ // try 2
					System.out.println("\t\t********************************");
					System.out.println("\t\tYou Have selected Add Bus Ticket");
					System.out.println("\t\t********************************");
					System.out.println();
					
					System.out.print("Enter Bus Type:");
					String busType= pc.next();
					System.out.print("\nEnter Bus No:");
					String busNo= pc.next();
					System.out.print("\nEnter Boarding:");
					String boarding= pc.next();
					System.out.print("\nEnter Dropping:");
					String dropping= pc.next();
					System.out.print("\nEnter Date:");
					String date= pc.next();
					System.out.print("\nEnter Departuretime:"); 
					String departureTime= pc.next();
					System.out.print("\nEnter Ticket Price:");
					double ticketPrice= pc.nextDouble();
					System.out.print("\nEnter Ticket No:");
					int ticketNo= pc.nextInt();
					System.out.print("\nEnter Available ticket Quantity:");
					int ticketAvailableQuantity= pc.nextInt();
					
					
					
					 
					
					BusTicket bt=new BusTicket();
					bt.setBusType(busType);
					bt.setBusNo(busNo);
					bt.setBoarding(boarding);
					bt.setDropping(dropping);
					bt.setDate(date);
					bt.setDepartureTime(departureTime);
					bt.setTicketPrice(ticketPrice);
					bt.setTicketNo(ticketNo);
					bt.setTicketAvailableQuantity(ticketAvailableQuantity);
					System.out.println();
					System.out.println("=============================");
					br.addBusTicket(bt);
					System.out.println("=============================");
					} // try 2
					
					catch(InputMismatchException ime)
					{
						System.out.println("=============================");
						System.out.println(ime.getMessage());
						System.out.println("Input a double value for Ticket Price");
						System.out.println("Input an Interger value for Ticket No");
						System.out.println("Input an Interger value for Ticket Available Quantity");
						pc.next();
						
					}
					catch(Exception e)
						{
							
							System.out.println("Something went wrong.");
						}
					
					break;
					
					
					case 2:
					System.out.println("\t\t***********************************");
					System.out.println("\t\tYou Have selected Delete Bus Ticket");
					System.out.println("\t\t***********************************");
					
					System.out.print("Enter Bus No:");
					
					
				
					
					br.deleteBusTicket(br.getBusTicket(pc.next()));
					System.out.println("=============================");
					
					break;
					
					
					case 3:
					System.out.println("\t\t*************************************");
					System.out.println("\t\tYou Have selected See All Bus Tickets");
					System.out.println("\t\t*************************************");
					br.showAllBusTickets();
					break;
					
					
					case 4:
					System.out.println("\t\t**********");
					System.out.println("\t\tGoing Back");
					System.out.println("\t\t**********");
					
					System.out.println();
					break;
					
					default:
					System.out.println("\t\t**************");
					System.out.println("\t\tInvalid Option");
					System.out.println("\t\t**************");
					break; 
				}//switch(option1)
			   
				
			break; //choice case 1	
				
			
			case 2:
			
		
			        System.out.println("\t\t************************************");
					System.out.println("\t\tYou have selected Customer Managment");
					System.out.println("\t\t************************************");
					System.out.println();
					System.out.println("Here are some options for you");
				
					System.out.println("===============================");
					System.out.println("1.  Add New Customer");
					System.out.println("2.  Remove Customer");
					System.out.println("3.  Show All Customers");
					System.out.println("4.  Go Back");
					System.out.println("===============================");
					
					System.out.println("***********************");
					System.out.print("Enter Your choice:");
					int option2=pc.nextInt();
					System.out.println("***********************");
					
				switch(option2)
				{
					case 1:
					try
					{ // try 3
					System.out.println("\t\t******************************");
					System.out.println("\t\tYou have selected Add Customer");
					System.out.println("\t\t******************************");
					System.out.println();
					
					System.out.print("Enter Customer Name:");
					String customerName=pc.next();
					System.out.print("\nEnter Customer Phone Number:");
					int customerPhone=pc.nextInt();
					
					Customer c= new Customer();
					c.setCustomerName(customerName);
					c.setCustomerPhone(customerPhone);
					System.out.println("===============================");
					br.addCustomer(c);
					System.out.println("===============================");
					} // try 3
					
					catch(InputMismatchException ime)
					{
						System.out.println("=============================");
						System.out.println(ime.getMessage());
						System.out.println("Input an Integer value for Customer Phone Number");
						pc.next();
					}
					
					catch(Exception e)
						{
							
							System.out.println("Something went wrong.");
						}
					break;
					
					case 2:
					try{ // try 4
					System.out.println("\t\t*********************************");
					System.out.println("\t\tYou have selected Remove Customer");
					System.out.println("\t\t*********************************");
					
					
					System.out.print("\nEnter Customer Phone Number:");
					br.removeCustomer(br.getCustomer(pc.nextInt()));
					System.out.println("===============================");
					} // try 4
					
					catch(InputMismatchException ime)
					{
						System.out.println("=============================");
						System.out.println(ime.getMessage());
						System.out.println("Input an Integer value for Customer Phone Number");
						pc.next();
					}
					
					catch(Exception e)
						{
							
							System.out.println("Something went wrong.");
						}
					
					
					
					
					
					break;
					
					case 3:
					System.out.println("\t\t************************************");
					System.out.println("\t\tYou have selected Show All Customers");
					System.out.println("\t\t************************************");
					System.out.println();
					br.showAllCustomers();
					
					break;
					
					
					case 4:
					System.out.println("\t\t**********");
					System.out.println("\t\tGoing Back");
					System.out.println("\t\t**********");
				
					System.out.println();
					break;
					
					default:
					System.out.println("\t\t**************");
					System.out.println("\t\tInvalid Option");
					System.out.println("\t\t**************");
					break; 
					
					
					
					
						
				}// switch(option2)
				
				break; //case 2
				
				case 3:
				    System.out.println("\t\t*******************************************");
					System.out.println("\t\tYou have selected Customer Ticket Managment");
					System.out.println("\t\t*******************************************");
					System.out.println();
					System.out.println("Here are some options for you");
					
					System.out.println("================================");
					System.out.println("1.  Book a Ticket for a Customer");
					System.out.println("2.  Cancel a Ticket for a Customer");
					System.out.println("3.  Show All Booked Tickets");
					System.out.println("4.  Go Back");
					System.out.println("================================");
					
					System.out.println("************************");
					System.out.print("Enter YOur Choice:");
					int option3=pc.nextInt();
					System.out.println("************************");
					
					switch(option3)
					{
						case 1:
						Bus b= null;
						
						System.out.println("\nHere are some options for you");
					
					    System.out.println("===============================");
					    System.out.println("1.  Ac Bus Service");
					    System.out.println("2.  Non Ac Bus Service");
						System.out.println("3.  Go Back");
						System.out.println("===============================");
						System.out.println();
						System.out.println("Which service do you want?");
						
						int type=pc.nextInt();
					try { // try 5	
					System.out.print("Enter Bus Type:");
					String busType= pc.next();
					System.out.print("\nEnter Bus No:");
					String busNo= pc.next();
					System.out.print("\nEnter Boarding:");
					String boarding= pc.next();
					System.out.print("\nEnter Dropping:");
					String dropping= pc.next();
					System.out.print("\nEnter Date:");
					String date= pc.next();
					System.out.print("\nEnter Departuretime:"); 
					String departureTime= pc.next();
					System.out.print("\nEnter Ticket Price:");
					double ticketPrice= pc.nextDouble();
					System.out.print("\nEnter Ticket No:");
					int ticketNo= pc.nextInt();
					System.out.print("\nEnter Available ticket Quantity:");
					int ticketAvailableQuantity= pc.nextInt();
					
					if(type==1)
					{
						AcBus ac=new AcBus();
					ac.setBusType(busType);
					ac.setBusNo(busNo);
					ac.setBoarding(boarding);
					ac.setDropping(dropping);
					ac.setDate(date);
					ac.setDepartureTime(departureTime);
					ac.setTicketPrice(ticketPrice);
					ac.setTicketNo(ticketNo);
					ac.setTicketAvailableQuantity(ticketAvailableQuantity);
					b=ac;
					}
					
					else if(type==2)
					{
						NonAcBus nac=new NonAcBus();
					nac.setBusType(busType);
					nac.setBusNo(busNo);
					nac.setBoarding(boarding);
					nac.setDropping(dropping);
					nac.setDate(date);
					nac.setDepartureTime(departureTime);
					nac.setTicketPrice(ticketPrice);
					nac.setTicketNo(ticketNo);
					nac.setTicketAvailableQuantity(ticketAvailableQuantity);
					b=nac;
						
					}
					
					else if(type==3)
					{
					System.out.println("\t\t**********");
					System.out.println("\t\tGoing Back");
					System.out.println("\t\t**********");
					}
					
					else
					{
					System.out.println("\t\t**************");
					System.out.println("\t\tInvalid Option");
					System.out.println("\t\t**************");
					}
					
					if(b!=null)
					{
						System.out.print("\nEnter Customer Phone Number:");
						int customerPhone1=pc.nextInt();
						br.getCustomer(customerPhone1).bookBus(b);
						System.out.println("===============================");
					}
					
					} // try 5
					
					catch(InputMismatchException ime)
					{
						System.out.println("=============================");
						System.out.println(ime.getMessage());
						System.out.println("Input a double value for Ticket Price");
						System.out.println("Input an Interger value for Ticket No");
						System.out.println("Input an Interger value for Ticket Available Quantity");
						System.out.println("Input an Integer value for Customer Phone Number");
						pc.next();
					}
					
					catch(Exception e)
						{
							
							System.out.println("Something went wrong.");
						}
					break;
						
						case 2:
						try{ // try 6
						System.out.println("\t\t===============================================");
						System.out.println("\t\tYou have selected  Cancel a Ticket for Customer");
						System.out.println("\t\t===============================================");
						
						System.out.print("\nEnter Customer Phone Number:");
						int customerPhone2=pc.nextInt();
						System.out.print("\nEnter Bus No:");
						String busNo2=pc.next();
						br.getCustomer(customerPhone2).cancelBus(br.getCustomer(customerPhone2).getBus(busNo2));
						System.out.println("===============================");
						} // try 6
						catch(InputMismatchException ime)
					{
						System.out.println("=============================");
						System.out.println(ime.getMessage());
						System.out.println("Input an Integer value for Customer Phone Number");
						pc.next();
					}
					
					catch(Exception e)
						{
							
							System.out.println("Something went wrong.");
						}
						
						break;
						
						case 3:
						try {//6.5
						System.out.println("\t\t======================================");
						System.out.println("\t\tYou have selected Show All Book Ticket");
						System.out.println("\t\t======================================");
						
						System.out.print("\nEnter Customer Phone Number:");
						int customerPhone3=pc.nextInt();
						br.getCustomer(customerPhone3).showAllBuses();
						}// try 6.5
						catch(InputMismatchException ime)
					{
						System.out.println("=============================");
						System.out.println(ime.getMessage());
						System.out.println("Input an Integer value for Customer Phone Number");
						pc.next();
					}
					
					catch(Exception e)
						{
							
							System.out.println("Something went wrong.");
						}
						
						break;
						
						case 4:
					System.out.println("\t\t**********");
					System.out.println("\t\tGoing Back");
					System.out.println("\t\t**********");
					
					System.out.println();
					break;
					
					default:
					System.out.println("\t\t**************");
					System.out.println("\t\tInvalid Option");
					System.out.println("\t\t**************");
					break; 
					
						
					}//switch(option3)
					
				
					break;
					
					case 4:
					    System.out.println("\t\t============================");
						System.out.println("\t\tYou have selected Payment");
						System.out.println("\t\t============================"); 
						System.out.println();
						System.out.println("Here are some options for you");
						System.out.println("===============================");
						System.out.println("1. Credit Card");
						System.out.println("2. Debit Card"); 
						System.out.println("3. Bkash/Nagad ");
						System.out.println("4. Exit");
						System.out.println("===============================");
					    System.out.println();
						
						System.out.println("************************");
						System.out.print("Enter YOur Option:");
						int option4=pc.nextInt();
						System.out.println("************************");
						
						switch(option4)
						{
							case 1:
							try{ // try 7
							System.out.print("Enter Credit Card number: ");
							int cc=pc.nextInt();
							System.out.print("\nEnter Credit Card Pin: ");
							int ccp=pc.nextInt();
							System.out.print("\nEnter Amount: ");
							double amt=pc.nextDouble();
							System.out.println("\nVerifying.....");
							System.out.println("Payment Successful!");
							System.out.println("Thank you.");
							System.exit(0);
							} // try 7
							catch(InputMismatchException ime)
							{
								System.out.println("=============================");
						System.out.println(ime.getMessage());
						System.out.println("Input an Integer value for Credit Card  Number");
						System.out.println("Input an Integer value for Credit Card  Pin");
						System.out.println("Input a double value for Amount");
						pc.next();
								
							}
							catch(Exception e)
						{
							
							System.out.println("Something went wrong.");
						}
							break;
							
							case 2:
							try {// try 8
							System.out.print("Enter Debit Card number: ");
							int dc=pc.nextInt();
							System.out.print("\nEnter Debit Card Pin: ");
							int dcp=pc.nextInt();
							System.out.print("\nEnter Amount: ");
							double amt1=pc.nextDouble();
							System.out.println("\nVerifying.....");
							System.out.println("Payment Successful!");
							System.out.println("Thank you.");
							System.exit(0);
							}// try 8 
							
							catch(InputMismatchException ime)
							{
								System.out.println("=============================");
						System.out.println(ime.getMessage());
						System.out.println("Input an Integer value for Debit Card  Number");
						System.out.println("Input an Integer value for Debit Card  Pin");
						System.out.println("Input a double value for Amount");
						pc.next();
								
							}
							catch(Exception e)
						{
							
							System.out.println("Something went wrong.");
						}
							
							break;
							
							case 3:
							try{ // try 9
							System.out.print("Enter Bkash/Nagad number: ");
							int bn=pc.nextInt();
							System.out.print("\nEnter Bkash/Nagad Card Pin: ");
							int bnp=pc.nextInt();
							System.out.print("\nEnter Amount: ");
							double amt2=pc.nextDouble();
							System.out.println("\nVerifying.....");
							System.out.println("Payment Successful!");
							System.out.println("Thank you.");
							System.exit(0);
							} // try 9
							catch(InputMismatchException ime)
							{
								System.out.println("=============================");
						System.out.println(ime.getMessage());
						System.out.println("Input an Integer value for  Bkash/Nagad  Number");
						System.out.println("Input an Integer value for  Bkash/Nagad  Pin");
						System.out.println("Input a double value for Amount");
						pc.next();
								
							}
							catch(Exception e)
						{
							
							System.out.println("Something went wrong.");
						}
							
							
							break;
							
							case 4:
							System.out.println("\t\t===========");
							System.out.println("\t\tGoing Back.");
							System.out.println("\t\t===========");
							
							
							break;
							
							
						}// switch(option4)
						
			break; // case 4
			
			               case 5:
						  System.out.println("\t\t=========================================");
						   System.out.println("\t\tSpecial Thanks for using our application");
						  System.out.println("\t\t=========================================");
						 again=false;
						   break;
			 
                           default:
						   System.out.println("\t\t*****************");
						   System.out.println("\t\tInvalid Selection");
						   System.out.println("\t\t*****************");
						   
						   break;
						   
						   
						   
			
				
			}//switch(choice)
			
			} //Try 1
			
			catch(InputMismatchException ime)
			{
				System.out.println("=========================================");
				System.out.println(ime.getMessage());
				System.out.print("Please Input An Integer:");
				pc.next();
			}
			
			catch(Exception e)
			{
				System.out.println("=========================================");
				
				System.out.println("Something went wrong");
			}
		}// while
	}// static void main
	
}//class