package my.company.validate;

import my.company.data.Order;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


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
