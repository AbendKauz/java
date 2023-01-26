package sec01.exam01;

public class Member {

	public String id;

	public Member(String id) {
		this.id = id;
	}

	// equals() 메소드 재정의
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			// 매개값이 Member타입인지 확인
			Member member = (Member) obj;
			// Member타입으로 강제타입변환
			if (id.equals(member.id)) {
				// id필드값이 동일한지 검사
				return true;
				// 동일하다면 true 리턴
			}
		}
		return false;
		// 매개값이 Member타입이 아니거나
		// id의 필드값이 다른 경우 false 리턴
	}

}
