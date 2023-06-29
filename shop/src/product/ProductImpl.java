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
		System.out.println("상품명: ");
		String name = input.next();
		System.out.println("상품가격: ");
		int price = input.nextInt();
		
		ProductDto result = register(name, price);
		if(result != null) {
			System.out.println("등록되었습니다.");
		}else
			System.out.println("문제가 발생했습니다.");
		return result;
	}

	public void view(ArrayList<ProductDto> proList) {
		for(int i=0; i<proList.size(); i++) {
			System.out.println(i + "번째 상품은 "+proList.get(i).getName() + ", 가격은 " + proList.get(i).getPrice() + "입니다.");

		}
	}

}
