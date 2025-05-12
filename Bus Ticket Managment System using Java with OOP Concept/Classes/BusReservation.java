package Classes;
import Interfaces.*;
import java.lang.*;
public class BusReservation implements ICustomerOperations, IBusTicketOperations
{
	private Customer customers[]=new Customer[50];
	private BusTicket tickets[]=new BusTicket[50];
	
	public BusReservation()
	{
		
	}
	
	public void addCustomer(Customer c)
	{
		int f=0;
		for(int i=0; i<customers.length ; i++)
		{
			if(customers[i]==null)
			{
				customers[i]=c;
				f=1;
				break;
			}
		}
		if(f==1)
		{
			System.out.println("Customer is added");
		}
		else
		{
		   System.out.println("Customer is not added");	
		}
	}
	
	public Customer getCustomer(int customerPhone)
	{
		Customer c=null;
		for(int i=0; i<customers.length;i++)
		{
			if(customers[i]!=null)
			{
				if (customers[i].getCustomerPhone()==customerPhone)
				{
					c=customers[i];
					break;
				}
			}
		}
		if(c!=null)
		{
			System.out.println("===============================");
			System.out.println("Customer is found");
			System.out.println("===============================");
		}
		else
		{
			System.out.println("===============================");
			System.out.println("Customer is not found");
			System.out.println("===============================");
		}
		return c;
		}
		
		public void removeCustomer(Customer c)
		{
			int f=0;
			for(int i=0; i<customers.length; i++)
			{
				if(customers[i]==c)
				{
					customers[i]=null;
					f=1;
					break;
				}
			}
			if(f==1)
			{
				System.out.println("===============================");
				System.out.println("Customer is Removed");
			}
			else
			{
				System.out.println("===============================");
				System.out.println("Customer is not Removed");
			}
		}
		
		public void showAllCustomers()
		{
			for(Customer c : customers)
			{
				if(c!=null)
				{
					System.out.println("==================================");
					System.out.println("Customer Name:"+c.getCustomerName());
					System.out.println("Customer Phone Number:"+c.getCustomerPhone());
					System.out.println("==================================");
					c.showAllBuses();
					System.out.println("");
				}
					
			}
		}
	public void addBusTicket(BusTicket bt)
	{
		int f=0;
		for(int i=0; i<tickets.length; i++)
	{
		if (tickets[i]==null)
		{
			tickets[i]=bt;
			f=1;
			break;
		}
	}
	if(f==1)
	{
		System.out.println("The bus ticket is added");
	}
	else
	{
		System.out.println("The bus ticket is not added");
	}
	}
	
	public void deleteBusTicket(BusTicket bt)
	{
		int f=0;
		for(int i=0; i<tickets.length; i++)
		{
			if(tickets[i]==bt)
			{
				tickets[i]=null;
				f=1;
				break;
			}
		}
		if(f==1)
		{
			System.out.println("=============================");
			System.out.println("The Bus ticket is deleted");
		}
		else
		{
			System.out.println("=============================");
			System.out.println("The Bus ticket is not deleted");
		}
	}
	
	
	public BusTicket getBusTicket(String busNo)
	{
		BusTicket bt=null;
		for(int i=0; i<tickets.length; i++)
		{
			if (tickets[i]!=null)
			{
				if(tickets[i].getBusNo().equals(busNo))
				{
					bt=tickets[i];
					break;
				}
			}
		}
		if(bt!=null)
		{
			System.out.println("=============================");
			System.out.println("Bus Ticket is Found");
			System.out.println("=============================");
		}
		else
		{
			System.out.println("=============================");
			System.out.println("Bus Ticket is not Found");
			System.out.println("=============================");
		}
		return bt;
	}
	
	public void showAllBusTickets()
	{
		System.out.println("===================================");
		for(BusTicket bt: tickets)
		{
			if(bt!=null)
			{
				System.out.println("Bus Type:"+bt.getBusType());
				System.out.println("Bus No:"+bt.getBusNo());
				System.out.println("Boarding:"+bt.getBoarding());
				System.out.println("Dropping:"+bt.getDropping());
				System.out.println("Date:"+bt.getDate());
				System.out.println("DepartureTime:"+bt.getDepartureTime());
				System.out.println("Ticket Price:"+bt.getTicketPrice());
				System.out.println("Ticket No:"+bt.getTicketNo());
				System.out.println("Tickt Available Quantity:"+bt.getTicketAvailableQuantity());
				System.out.println("===================================");
			}
		}
	}
}