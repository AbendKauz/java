package sec01.exam05;

public class CheckExample {

	public static void main(String[] args) {

		CheckBox checkBox = new CheckBox();
		checkBox.setOnSelectListener(new BackgroundChangeListener());
		checkBox.select();

	}

}
