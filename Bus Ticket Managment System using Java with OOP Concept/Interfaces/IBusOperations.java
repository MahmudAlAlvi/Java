package Interfaces;
import Classes.Bus;
import java.lang.*;
public interface IBusOperations
{
	public void bookBus(Bus b);
	public void cancelBus(Bus b);
	Bus getBus(String busNo);
	void showAllBuses();
}