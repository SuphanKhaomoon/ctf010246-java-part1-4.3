package CTF01.Java.part1.No4_3;

public class SwitchCase
{

	public static void main(String[] args)
	{
//		สร้างโปรแกรมตัดเกรด โดยที่
//			a. เกรด A ถ้าคะแนน = 80
//			b. เกรด B ถ้าคะแนน = 70
//			c. เกรด C ถ้าคะแนน = 60
//			d. เกรด D ถ้าคะแนน = 50
//			e. เกรด F ถ้าคะแนน = 40
//			f. เกรด E ถ้าคะแนนเป็นค่าอื่น

		int score = 75;
		switch (score)
		{
		case 80:
			System.out.println("เกรด A");
			break;
		case 70:
			System.out.println("เกรด B");
			break;
		case 60:
			System.out.println("เกรด C");
			break;
		case 50:
			System.out.println("เกรด D");
			break;
		case 40:
			System.out.println("เกรด F");
			break;
		default:
			System.out.println("เกรด E");
		}

	}
}
