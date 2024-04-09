package q10845;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());

		Queue queue = new Queue();

		for (int i = 0; i < N; i++) {
			String[] command = br.readLine().split(" ");

			switch (command[0]) {
			case "push":
				queue.push(Integer.parseInt(command[1]));
				break;
			case "pop":
				bw.write(queue.pop() + "\n");
				break;
			case "size":
				bw.write(queue.size() + "\n");
				break;
			case "empty":
				bw.write(queue.empty() + "\n");
				break;
			case "front":
				bw.write(queue.front() + "\n");
				break;
			case "back":
				bw.write(queue.back() + "\n");
				break;
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}

	static class Queue {
		LinkedList<Integer> queue = new LinkedList<>();

		void push(int number) {
			queue.addLast(number);
		}

		int pop() {
			return queue.isEmpty() ? -1 : queue.pollFirst();
		}

		int size() {
			return queue.size();
		}

		int empty() {
			return queue.isEmpty() ? 1 : 0;
		}

		int front() {
			return queue.isEmpty() ? -1 : queue.getFirst();
		}

		int back() {
			return queue.isEmpty() ? -1 : queue.getLast();
		}
	}
}
