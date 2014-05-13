package my.company.data;

import java.util.List;


public class Order
{
	private List<AbstractOrderEntry> entries;

	public List<AbstractOrderEntry> getEntries()
	{
		return entries;
	}

	public void setEntries(List<AbstractOrderEntry> entries)
	{
		this.entries = entries;
	}
}
