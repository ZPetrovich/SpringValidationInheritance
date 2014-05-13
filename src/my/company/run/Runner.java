package my.company.run;

import java.util.ArrayList;
import java.util.List;

import my.company.data.AbstractOrderEntry;
import my.company.data.Order;
import my.company.data.SDROrder;
import my.company.data.SDROrderEntry;
import my.company.validate.OrderValidation;


public class Runner
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Order order = new SDROrder();
		SDROrderEntry entry = new SDROrderEntry();
		entry.setReason("reason1");
		List<AbstractOrderEntry> entries = new ArrayList<>();
		entries.add(entry);
		order.setEntries(entries);

		OrderValidation orderValidation = new OrderValidation();
		orderValidation.validate(order);

	}
}
