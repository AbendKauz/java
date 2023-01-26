package sec01.exam02;

public class DmbCellPhoneExample {

	public static void main(String[] args) {

		DmbCellPhone dmbCell = new DmbCellPhone("자바폰", "검정", 10);

		// 상위 CellPhone 클래스로부터 상속받은 필드
		System.out.println("모델 : " + dmbCell.model);
		System.out.println("색상 : " + dmbCell.color);

		// 하위 DmbCellPhone 클래스의 필드
		System.out.println("채널 : " + dmbCell.channel);

		// 상위 CellPhone 클래스로부터 상속받은 메소드
		dmbCell.powerOn();
		dmbCell.bell();
		dmbCell.sendVoice("여보세요.");
		dmbCell.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		dmbCell.sendVoice("아~예 반갑습니다.");
		dmbCell.hangUp();

		// 하위 DmbCellPhone 클래스의 메소드
		dmbCell.turnOnDmb();
		dmbCell.changeChannelDmb(12);
		dmbCell.turnOffDmb();

	}

}
