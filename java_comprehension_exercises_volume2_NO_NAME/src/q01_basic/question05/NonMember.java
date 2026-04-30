package q01_basic.question05;

public class NonMember extends AbstMember {
	public NonMember(String name) {
		super();
	}

	@Override
	public void showMember() {
		name = "Sato Kensuke";
		System.out.println("***MEMBER DATA***");
		System.out.println(name + "is a non-member");

		System.out.println("*****************");

	}

	@Override
	public void buyItem() {
		name = "Sato Kensuke";
		System.out.println(name + " purchased the item at a fixed price");
	}

}
