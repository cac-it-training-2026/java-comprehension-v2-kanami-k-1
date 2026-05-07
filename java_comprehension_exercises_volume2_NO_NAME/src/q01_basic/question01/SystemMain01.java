package q01_basic.question01;

/**
 * question01出力例
 * 詳細は問題ドキュメントを参照すること

---SHOW DATA---
***MEMBER DATA***
name:Miura Manabu
age:24
rank:1
*****************
***MEMBER DATA***
name:Sato Kensuke
age:36
rank:2
*****************

 * 
 */
public class SystemMain01 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member show1 = new Member();
		Member show2 = new Member();

		show1.name = "Miura Manabu";
		show1.age = 24;
		show1.rank = 1;

		show1.showMember();

		show2.name = "Sato Kensuke";
		show2.age = 36;
		show2.rank = 2;

		show2.showMember();

	}

}
