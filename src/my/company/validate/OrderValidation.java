package my.company.validate;

import my.company.data.Order;
import my.company.data.SDROrder;

import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;


public class OrderValidation
{
	private OrderValidator orderValidator = new OrderValidator();

	public void validate(Order order)
	{
		Errors errors = new BeanPropertyBindingResult(new SDROrder(), "sdr");
		orderValidator.validate(order, errors);
	}
}
