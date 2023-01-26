package productData;

import java.util.ArrayList;
import productData.outerProduct;

public class outerProductRepository {	// 아우터 상품 세부 저장소
	
	private ArrayList<outerProduct> listOfProducts = new ArrayList<outerProduct>();
	
	public outerProductRepository() {
		
		outerProduct outer1 = new outerProduct("KKQWCPD500M", "KIRSH", 179000);
		outer1.setOuterProductDescription("체리 후드 롱 패딩");
		outer1.setOuterProductSize("1ONE SIZE");
		outer1.setOuterProductYear(2022);
		outer1.setOuterProductSex("여");
		
		outerProduct outer2 = new outerProduct("C21FCT02V-BLK", "COOR", 329000);
		outer2.setOuterProductDescription("MTR 발마칸 코트");
		outer2.setOuterProductSize("M");
		outer2.setOuterProductYear(2022);
		outer2.setOuterProductSex("남");
		
		outerProduct outer3 = new outerProduct("1510582", "NATIONALGEOGRAPHIC", 149000);
		outer3.setOuterProductDescription("여성 헤론 덕다운점퍼");
		outer3.setOuterProductSize("L");
		outer3.setOuterProductYear(2022);
		outer3.setOuterProductSex("여");
		
		listOfProducts.add(outer1);
		listOfProducts.add(outer2);
		listOfProducts.add(outer3);
		
	}
	
	public ArrayList<outerProduct> getAllProducts(){	// 전체 정보를 가져오는 메소드
		return listOfProducts;
	}
	
	public outerProduct getProductById(String productID) {
		
		outerProduct productByID = null;
		
		for(int i = 0; i < listOfProducts.size(); i++) {
			outerProduct product = listOfProducts.get(i);
			if(product.getOuterProductID() != null && product != null
					&& product.getOuterProductID().equals(productID)) {
				productByID = product;
			}
		}
		return productByID;
	}
	
}
