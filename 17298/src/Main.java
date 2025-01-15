//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//	
//	//public static List<Integer> result = new ArrayList<>();
//	
////	public static int getNge(int count) {
////		if(count == result.size()-1) {
////			//result.set(count, -1);
////			return -1;
////		}
////		
////		for(int i=count + 1;i<result.size();i++) {
////			if(result.get(i)> result.get(count)) {
////				//result.set(count, result.get(i));
////				return result.get(i);
////			}
////		}
////		
////		//result.set(count, -1);
////		return -1;
////	}
//
//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int n = Integer.parseInt(br.readLine());
//		String[] input = br.readLine().split(" ");
//		
//		int[] arr = new int[n];
//
//		for(int i=0;i<n; i++) {
//			//result.add(Integer.parseInt(input[i]));
//			arr[i] = Integer.parseInt(input[i]);
//		}
//		
//		for(int i=0;i<input.length; i++) {
//			//getNge(i);
//			bw.append(getNge(i) + " ");
//		}
//		
//		bw.flush();
//		bw.close();
//		
//	}
//
//}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        
        int[] arr = new int[n];
        int[] nge = new int[n]; // 다음 큰 수를 저장할 배열
        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
            nge[i] = -1; // 기본값은 -1 (다음 큰 수가 없으면 -1)
        }
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            // 스택이 비어있지 않고, 현재 값이 스택의 top 값보다 크면
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int idx = stack.pop();
                nge[idx] = arr[i];
            }
            stack.push(i);
            //System.out.println(stack.push(i));
        }
        
        // 결과 출력
        for (int i = 0; i < n; i++) {
            bw.append(nge[i] + " ");
        }
        
        bw.flush();
        bw.close();
    }
}
