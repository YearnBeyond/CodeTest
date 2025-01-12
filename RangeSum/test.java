package RangeSum;

import java.util.*;
import java.io.*;

public class test {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		long S[] = new long[a+1];
		st = new StringTokenizer(br.readLine());
		
		for (int i = 1; i<=a; i++) {
			S[i] = S[i-1] + Integer.parseInt(st.nextToken());
		}
		
		for (int j = 0; j < b ; j++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			System.out.println(S[x] - S[y-1]);
		}
	}
}