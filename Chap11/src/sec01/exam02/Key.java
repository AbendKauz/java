package sec01.exam02;

public class Key {

	public int number;

	public Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			// obj를 Key타입으로 강제변환
			if (this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}

	// hashCode()의 리턴값을 number필드값으로 했기 때문에
	// 저장할 때의 new Key(1)과 읽을 때의 new Key(1)로
	// 같은 해시코드가 리턴됨
	@Override
	public int hashCode() {
		return number;
	}

}
