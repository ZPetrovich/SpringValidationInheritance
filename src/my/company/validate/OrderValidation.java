package my.company.validate;

import my.company.data.AbstractOrderEntry;

import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;


public class OrderValidation
{
	private OrderValidator orderValidator = new OrderValidator();

	public void validate(AbstractOrderEntry entry)
	{
		Errors errors = new BeanPropertyBindingResult(entry.getOrder(), "sdr");
		orderValidator.validate(entry, errors);
	}
}
