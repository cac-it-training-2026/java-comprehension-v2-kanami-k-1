package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		Member member1 = Member.getInstance(1, "Passw0rd", "Miura Manabu", 28, 2);

		Member member2 = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);

		ConsoleReader cr = new ConsoleReader();

		List<Member> member = new ArrayList<>();

		member.add(member1);
		member.add(member2);

		System.out.println("===会員情報を表示します===");

		MemberManager.showAllMembers(member);

		System.out.println("===パスワードを変更します===");

		int targetId;
		String newPassword;

		try {
			System.out.println("input target id>>");
			targetId = cr.inputNumber();
			System.out.println("input new password>>");
			newPassword = cr.inputString();

		} catch (IOException e) {

			e.printStackTrace();
			return;

		} catch (NumberFormatException e) {
			System.out.println("不正な入力です");
			e.printStackTrace();
			return;
		}

		MemberManager.updatePassword(member, targetId, newPassword);
		System.out.println("---SHOW DATE---");
		MemberManager.showAllMembers(member);
	}
}
