package my.company.validate;

import my.company.data.AbstractOrderEntry;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


public class OrderValidator implements Validator
{

	@Override
	public boolean supports(Class<?> clazz)
	{
		return AbstractOrderEntry.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(final Object target, final Errors errors)
	{
		errors.pushNestedPath("entries[0]");
		errors.rejectValue("reason", "Wrong Reason");
		errors.popNestedPath();
	}

}
