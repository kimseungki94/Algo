package backjoon_backup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class bj_15665 {
	static int N, M;
	static int[] arr;
	static int[] result;
	static int[] list;
	static boolean[] visit;
	static int max = 0;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	static HashMap<String,Integer> hash = new HashMap<>();
	
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		list = new int[M];
		result = new int[M];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		visit = new boolean[N];
		Arrays.sort(arr);
		dfs(0);

		hash.forEach((key, value)
			    -> System.out.println(key));
//		Iterator<String> iter = hash.iterator();
//		while(iter.hasNext()) {
//			bw.write(iter.next()+"\n");
//		}
		bw.flush();
		bw.close();
	}

	private static void dfs(int count) {
		if (count == M) {
			for (int i = 0; i < list.length; i++) {
				sb.append(list[i] + " ");
			}
			System.out.println(sb);
			System.out.println("----");
			hash.put(sb.toString(), 1);
			System.out.println(hash);
			sb.delete(0, sb.length());
			return;

		}
		for (int i = 0; i < N; i++) {
			//if (visit[i] == false) {
				//visit[i] = true;
				list[count] = arr[i];
				dfs(count + 1);
				//visit[i] = false;
			//}
		}

	}
}