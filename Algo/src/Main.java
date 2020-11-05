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
	static int[] arr;
	static boolean[] visit = new boolean[1000001];
	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int before=Integer.parseInt(st.nextToken());
		int startbefore=before;
		int after = Integer.parseInt(st.nextToken());
		
		int count=0;
		st = new StringTokenizer(br.readLine());
		arr = new int[Integer.parseInt(st.nextToken())];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<arr.length;i++) {
			if(arr.length-i-1==0) {
				count+=Integer.parseInt(st.nextToken());
			}else {
				count+=(arr.length-i-1)*Integer.parseInt(st.nextToken())*before;
				before=before*startbefore;
			}
		}
		System.out.println(count);
		
		bw.flush();
		bw.close();
	}

}