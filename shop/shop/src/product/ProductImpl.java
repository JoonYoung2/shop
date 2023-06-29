package product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductImpl implements ProductService {
	
	
	private ProductDto register(String name, int price) {
		ProductDto dto = new ProductDto();
		dto.setName(name);
		dto.setPrice(price);
		
		return dto;
	}
	public ProductDto register() {
		Scanner input = new Scanner(System.in);
		System.out.println("상품의 이름: ");
		String name = input.next();
		System.out.println("상품의 가격: ");
		int price = input.nextInt();
		ProductDto result = register(name, price);
		if(result != null)
			System.out.println("등록 완료");
		else
			System.out.println("다시 시도하세요");
		return result;
	}
	
	public void view(ArrayList<ProductDto> list) {
		for(int i=0; i<list.size(); i++) {
			System.out.println(i +"번 상품 이름 : " + list.get(i).getName()+", 가격 : "+ list.get(i).getPrice()+"원 입니다." );

		}
	}

}
