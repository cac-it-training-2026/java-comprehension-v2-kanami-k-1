package q01_basic.question06;

public class Member extends AbstMember {
	private int age;
	private int rank;
	private int id;
	private String password;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Member() {
		super();
	}

	public Member(int id, String password, String name, int age, int rank) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;

	}

	@Override
	public void buyItem() {
		if (rank == 2) {
			System.out.println(name + "purchased the item at 50% off");
		} else {
			System.out.println(name + "purchased the item");
		}
	}

	@Override
	public void showMember() {

		System.out.println("***MEMBER DATA***");
		System.out.println("id:" + id);
		System.out.println("password:" + password);
		System.out.println("name:" + name);
		System.out.println("age:" + age++);
		System.out.println("rank:" + rank++);
		System.out.println("*****************");
	}

}
