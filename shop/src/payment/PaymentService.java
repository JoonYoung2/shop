package payment;

import java.util.ArrayList;

import product.ProductDto;

public interface PaymentService {
	
	public void paymentView(ArrayList<ProductDto> list);
	
	public ProductDto payment(ArrayList<ProductDto> list);
	
}
