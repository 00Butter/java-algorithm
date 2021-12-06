package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
/*
2-1

*/
/*
2-2
    public class Main {
        public int solution(int n,int[] arr){
            int answer = 1;
            int max = arr[0];
            for(int i=1;i<arr.length;i++){
                if(arr[i]>max) {
                    answer++;
                    max = arr[i];
                }
            }
            return answer;
        }
        public static void main(String[] args) {
            // write your code here
            com.company.Main T = new com.company.Main();
            Scanner in=new Scanner(System.in);
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n; i++){
                arr[i] = in.nextInt();
            }
            //for(int x:T.solution(n,arr)) System.out.print(x+" ");
            System.out.println(T.solution(n,arr));
        }
    }
*/
 /*   2-4
public int[] solution(int n){
    int[] answer = new int[n];
    answer[0] = 1;
    answer[1] = 1;
    for(int i=2;i<n;i++){
        answer[i] = answer[i-2]+answer[i-1];
    }
    return answer;
}*/
/*
2-5
    public class Main {
        public int solution(int n){
            int answer = 0;
            int[] ch = new int[n+1];
            for(int i=2;i<=n;i++){
                if(ch[i]==0){
                    answer++;
                    for(int j=i;j<=n;j=j+i){
                        ch[j] = 1;
                    }
                }
            }
            return answer;
        }
        public static void main(String[] args) {
            // write your code here
            com.company.Main T = new com.company.Main();
            Scanner in=new Scanner(System.in);
            int n = in.nextInt();

            System.out.println(T.solution(n));
        }
    }
*/
/*
2-6
    public class Main {
        //소수체크
        public boolean isPrime(int num){
            if(num==1) return false;
            for(int i=2; i<num; i++) {
                if(num%i==0) return false;
            }
            return true;
        }
        public ArrayList<Integer> solution(int n,int[] arr){
            ArrayList<Integer> answer = new ArrayList<>();
            //역수 구하기
            for(int i=0;i<n;i++){
                int tmp = arr[i];
                int res = 0;
                while(tmp>0){
                    int t = tmp %10;
                    res = res*10+t;
                    tmp = tmp/10;
                }
                if(isPrime(res)) answer.add(res);
            }
            return answer;
        }
        public static void main(String[] args) {
            // write your code here
            com.company.Main T = new com.company.Main();
            Scanner in=new Scanner(System.in);
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n;i++){
                arr[i] = in.nextInt();
            }
            System.out.println(T.solution(n,arr));
        }
    }*/


/*
    2-10
    public class Main {
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        public int solution(int n,int[][] arr){
            int answer = 0;

            for(int i=0;i<n;i++){
                int cnt =1;
                for (int j = 0; j < n; j++) {
                    boolean flag = true;
                    for (int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if(nx >=0 && nx<n && ny>=0 && ny<n && arr[nx][ny]>=arr[i][j]){
                            flag = false;
                            break;
                        }
                    }
                    if(flag) answer++;
                }
            }

            return answer;
        }
        public static void main(String[] args) {
            // write your code here
            com.company.Main T = new com.company.Main();
            Scanner in=new Scanner(System.in);
            int n = in.nextInt();
            int[][] arr = new int[n][n];
            for(int i=0; i<n;i++){
                for(int j=0;j<n;j++)    arr[i][j] = in.nextInt();
            }
            System.out.println(T.solution(n,arr));
        }
    }
*/

}
