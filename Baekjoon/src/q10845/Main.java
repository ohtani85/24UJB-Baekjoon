package q10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = br.readLine();
			int n = Integer.parseInt(line);
			SJQueue q = new SJQueue(10000);
			for (int i = 0; i < n; i++) {
				line = br.readLine();
				StringTokenizer st = new StringTokenizer(line);

				String cmd = "";
				String value = "";

				if (st.countTokens() == 2) {
					cmd = st.nextToken();
					value = st.nextToken();
				} else {
					cmd = st.nextToken();
				}

				switch (cmd) {
				case "push":
					int v = Integer.parseInt(value);
					q.push(v);
					break;
				case "pop":
					q.pop();
					break;
				case "front":
					q.front();
					break;
				case "back":
					q.back();
					break;
				case "size":
					int size = q.size();
					System.out.println(size);
					break;
				case "empty":
					q.empty();
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class SJQueue {
	private int[] ar;
	private int front;
	private int back;

	public SJQueue(int size) {
		ar = new int[size];
		front = -1;
		back = -1;
	}

	public void push(int x) {
		if (front == -1) {
			front++;
			ar[++back] = x;
		} else {
			ar[++back] = x;
		}
	}

	public void pop() {
		if (size() == 0) {
			System.out.println("-1");
		} else if (size() == 1) {
			System.out.println(ar[front++]);
			front = -1;
			back = -1;
		} else {
			System.out.println(ar[front++]);
		}
	}

	public int size() {
		if (front == -1 && back == -1) {
			return 0;
		} else
			return back - front + 1;
	}

	public boolean empty() {
		if (size() == 0) {
			System.out.println("1");
			return true;
		} else {
			System.out.println("0");
			return false;
		}
	}

	public void front() {
		if (size() == 0) {
			System.out.println("-1");
		} else {
			System.out.println(ar[front]);
		}
	}

	public void back() {
		if (size() == 0) {
			System.out.println("-1");
		} else {
			System.out.println(ar[back]);
		}
	}
}