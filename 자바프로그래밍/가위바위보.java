package ss;

import java.util.Scanner;

public class AA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int win = 0;
		int draw = 0;
		int lose = 0;
		int[] k = { 1, 2, 3 };
		int n = sc.nextInt();
		int[] playergbb = new int[n];

		for (int i = 0; i < n; i++) {
			int player = sc.nextInt();
			playergbb[i] = player;
		}
		for (int j = 0, a = 0; j < n; j++, a++) {
			if (a == 3) {
				a = 0;
			}
			if (k[a] == playergbb[j]) {
				draw++;
			} else if ((k[a] == 1 && playergbb[j] == 3) || (k[a] == 2 && playergbb[j] == 1)
					|| (k[a] == 3 && playergbb[j] == 2)) {
				win++;
			} else {
				lose++;
			}
		}

		System.out.println(win);
		System.out.println(draw);
		System.out.println(lose);
		sc.close();
	}

}
