package payment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import product.ProductDto;

public class PaymentImpl implements PaymentService {

	@Override
	public void paymentView(ArrayList<ProductDto> list) {
		int i = 1;
		for(ProductDto dto : list) {
			System.out.println("i번째 상품: ");
			System.out.println("이름" + dto.getName());
			System.out.println("가격" + dto.getPrice());
			System.out.println("=============");
		}
	}

	@Override
	public ProductDto payment(ArrayList<ProductDto> list) {
		
		ProductDto dto = new ProductDto();
		Scanner sc = new Scanner(System.in);
		int a = 0;
		
		boolean flag = true;
		
		while (flag) {
			
			System.out.println("몇 번 상품을 고르시겠어요?");
			a = sc.nextInt();
			
			System.out.println(a + " 번 상품을 담겠습니다");			
			
			if (a > list.size()) {
				System.out.println("다시 골라주세요");
			}
			
			flag = false;
		}
	
		return list.get(a-1);
	}

}
