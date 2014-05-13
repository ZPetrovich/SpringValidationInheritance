SpringValidationInheritance
===========================

Test for SpringValidation in order to rejectValues on Inheritance


I get Exception

org.springframework.beans.NotReadablePropertyException: Invalid property 'entries[0].reason' of bean class [my.company.data.SDROrder]: Bean property 'entries[0].reason' is not readable or has an invalid getter method: Does the return type of the getter match the parameter type of the setter?

from the following code snippet:

	Errors errors = new BeanPropertyBindingResult(new SDROrder(), "sdr");
	orderValidator.validate(order, errors);

for validator:
	public class OrderValidator implements Validator
	{

	    @Override
	    public boolean supports(Class<?> clazz)
	    {
	        return Order.class.isAssignableFrom(clazz);
	    }

	    @Override
	    public void validate(final Object target, final Errors errors)
	    {
	        errors.rejectValue("entries[0].reason", "Wrong Reason");
	    }

	}

where we have such data hierarchy

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

		public class SDROrder extends Order {}

		public class AbstractOrderEntry {}


		public class SDROrderEntry extends AbstractOrderEntry
		{
		    private String reason;

		    public String getReason()
		    {
		        return reason;
		    }

		    public void setReason(String reason)
		    {
		        this.reason = reason;
		    }
		}