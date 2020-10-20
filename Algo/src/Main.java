import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st = null;
	static StringBuilder sb = new StringBuilder();
	static StringBuilder tempword = new StringBuilder();

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		String S = st.nextToken();
		char[] arr = S.toCharArray();
		
		for(int i=arr.length-1;i>=0;i--) {
			tempword.append(arr[i]);
			sb.append(tempword.reverse()+",");
			tempword.reverse();
			System.out.println(sb);
			sb.delete(0, sb.length());
		}
		bw.write(sb+"\n");
		bw.flush();
		bw.close();

		
	}
}