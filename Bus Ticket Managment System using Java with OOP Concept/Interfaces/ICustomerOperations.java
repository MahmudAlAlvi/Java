package Interfaces;
import Classes.Customer;
import java.lang.*;
public interface ICustomerOperations
{
	public void addCustomer(Customer c);
	public void removeCustomer(Customer c);
	public void showAllCustomers();
	Customer getCustomer(int customerPhone);
}