package Classes;
import Interfaces.*;
import java.lang.*;
public class Customer implements IBusOperations
{
	private String customerName;
	private int customerPhone;
	Bus buses[]=new Bus[10];
	
	public void setCustomerName(String customerName)
	{
		this.customerName=customerName;
	}
	public String getCustomerName()
	{
		return customerName;
	}
	public void setCustomerPhone(int customerPhone)
	{
		this.customerPhone=customerPhone;
	}
	public int getCustomerPhone()
	{
		return customerPhone;
	}
	
	public void bookBus(Bus b)
	{
		int f1=0;
		for(int i=0; i< buses.length; i++)
		{
			if(buses[i]==null)
			{
				buses[i]=b;
				f1=1;
				break;
			}
		}
		if(f1==1)
		{
			System.out.println("The bus is booked");
		}
		else
		{
			System.out.println("The bus is not booked");
		}
	
	}
	
	public void cancelBus(Bus b)
	{
		int f1=0;
		for(int i=0; i< buses.length; i++)
		{
			if(buses[i]==b)
			{
				buses[i]=null;
				f1=1;
				break;
			}
		}
		if(f1==1)
		{
			System.out.println("The bus is cancelled");
		}
		else
		{
			System.out.println("The bus is not cancelled");
		}
		
	}
		
		public Bus getBus(String busNo)
		{
			Bus b=null;
			for(int i=0; i< buses.length; i++)
			{
				if(buses[i]!=null)
				{
					if(buses[i].getBusNo().equals(busNo))
					{
						b=buses[i];
						break;
					}
				}
			}
			if(b!=null)
			{
				System.out.println("Bus is found");
			}
			else
			{
				System.out.println("Bus is not found");
			}
			return b;
		}
		public void showAllBuses()
		{
			for(Bus b : buses)
				if(b!=null)
					{
						b.showBusDetails(); 
					}
		}
	}
