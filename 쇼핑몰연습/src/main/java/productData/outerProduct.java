package productData;

import java.io.Serializable;

public class outerProduct implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String outerProductID;			// �ƿ��� ��ǰ ��ǰ ID
	private String outerProductCompany;		// �ƿ��� ��ǰ ����ȸ��
	private int outerProductCost;			// �ƿ��� ��ǰ ����
	private String outerProductDescription;	// �ƿ��� ��ǰ ����
	private String outerProductSize;		// �ƿ��� ��ǰ ������
	private int outerProductYear;			// �ƿ��� ��ǰ ��������
	private String outerProductSex;			// �ƿ��� ��ǰ ����
	
	public outerProduct() {
		super();
	}
	
	public outerProduct(String outerProductID, String outerProductCompany, int outerProductCost) {
		this.outerProductID = outerProductID;
		this.outerProductCompany = outerProductCompany;
		this.outerProductCost = outerProductCost;
	}

	public String getOuterProductID() {
		return outerProductID;
	}

	public void setOuterProductID(String outerProductID) {
		this.outerProductID = outerProductID;
	}

	public String getOuterProductCompany() {
		return outerProductCompany;
	}

	public void setOuterProductCompany(String outerProductCompany) {
		this.outerProductCompany = outerProductCompany;
	}

	public int getOuterProductCost() {
		return outerProductCost;
	}

	public void setOuterProductCost(int outerProductCost) {
		this.outerProductCost = outerProductCost;
	}

	public String getOuterProductDescription() {
		return outerProductDescription;
	}

	public void setOuterProductDescription(String outerProductDescription) {
		this.outerProductDescription = outerProductDescription;
	}

	public String getOuterProductSize() {
		return outerProductSize;
	}

	public void setOuterProductSize(String outerProductSize) {
		this.outerProductSize = outerProductSize;
	}

	public int getOuterProductYear() {
		return outerProductYear;
	}

	public void setOuterProductYear(int outerProductYear) {
		this.outerProductYear = outerProductYear;
	}

	public String getOuterProductSex() {
		return outerProductSex;
	}

	public void setOuterProductSex(String outerProductSex) {
		this.outerProductSex = outerProductSex;
	}
	
}
