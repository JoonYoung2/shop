package shop;

import java.util.ArrayList;
import java.util.Scanner;

import payment.PaymentImpl;
import product.ProductDto;
import product.ProductImpl;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<ProductDto> proList = new ArrayList<>();
		ArrayList<ProductDto> payList = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		PaymentImpl pay = new PaymentImpl();
		ProductImpl prdt = new ProductImpl();
		
		while(true) {
			System.out.println("1.상품등록 2.상품목록 3.상품구매 4.구매상품보기");
			System.out.print(">>> ");
			int num = in.nextInt();
			
			switch(num) {
			case 1:
				ProductDto dto = prdt.register();
				proList.add(dto);
				break;
			case 2:
				prdt.view(proList);
				break;
			case 3:
				ProductDto proDto = pay.payment(proList);
				payList.add(proDto);
				break;
			case 4:
				pay.paymentView(payList);
				break;
			default:
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}
	}
}
