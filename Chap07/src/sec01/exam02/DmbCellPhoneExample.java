package sec01.exam02;

public class DmbCellPhoneExample {

	public static void main(String[] args) {

		DmbCellPhone dmbCell = new DmbCellPhone("�ڹ���", "����", 10);

		// ���� CellPhone Ŭ�����κ��� ��ӹ��� �ʵ�
		System.out.println("�� : " + dmbCell.model);
		System.out.println("���� : " + dmbCell.color);

		// ���� DmbCellPhone Ŭ������ �ʵ�
		System.out.println("ä�� : " + dmbCell.channel);

		// ���� CellPhone Ŭ�����κ��� ��ӹ��� �޼ҵ�
		dmbCell.powerOn();
		dmbCell.bell();
		dmbCell.sendVoice("��������.");
		dmbCell.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���.");
		dmbCell.sendVoice("��~�� �ݰ����ϴ�.");
		dmbCell.hangUp();

		// ���� DmbCellPhone Ŭ������ �޼ҵ�
		dmbCell.turnOnDmb();
		dmbCell.changeChannelDmb(12);
		dmbCell.turnOffDmb();

	}

}
