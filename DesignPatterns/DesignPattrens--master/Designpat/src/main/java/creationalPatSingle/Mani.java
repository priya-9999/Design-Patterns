package creationalPatSingle;

public class Mani {
	public static void main(String[] args) {
        SingClass singClass = SingClass.getInstance();
        System.out.println(singClass.showMessage());
    }

}
