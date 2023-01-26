package chap06.exam05;

public class ShopService {

	private static ShopService a = new ShopService();

	private ShopService() {

	}

	static ShopService getInstance() {
		return a;
	}

}
