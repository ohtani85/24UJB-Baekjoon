package q10828;

import java.io.BufferedReader;
//import java.util.Stack;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class SJStack {
	int[] ar;
	int top;

	public SJStack() {
		ar = new int[100];
		top = -1;
	}

	public void push(int param) {
		ar[++top] = param;
	}

	public int size() {
		return top + 1;
	}

	public int pop() {
		return ar[top--];
	}

	public void empty() {
		if (top == -1) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

	public void top() {
		if (top == -1) {
			System.out.println(-1);
		} else {
			System.out.println(ar[top]);
		}
	}
}

public class Main {
	public static void main(String[] args) throws Exception {
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		Stack<Integer> stk = new Stack<Integer>();
		SJStack stk = new SJStack();

//		int N = sc.nextInt();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
//			String cmd = sc.next();
			String cmd = br.readLine();
			// "push 3"
			// "pop"

			StringTokenizer st = new StringTokenizer(cmd);
			int value = 0;
			if (st.countTokens() == 2) {
				String cmd2 = st.nextToken();
				value = Integer.parseInt(st.nextToken());
				cmd = cmd2;
			} else {
				cmd = st.nextToken();
			}

			switch (cmd) {
			case "push":
//				int param = sc.nextInt();
//				stk.push(param);
				stk.push(value);
				break;
			case "pop":
				if (stk.size() == 0) {
					System.out.println("-1");
				} else {
					int ret = stk.pop();
					System.out.println(ret);
				}
				break;
			case "size":
				System.out.println(stk.size());
				break;
			case "empty":
				if (stk.size() == 0) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
				break;
			case "top":
				if (stk.size() == 0) {
					System.out.println(-1);
				} else {
					stk.top();
				}
				break;
			}
		}
//		sc.close();
	}
}