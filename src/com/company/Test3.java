package com.company;

import java.util.Scanner;

public class Test3 {
/*
    public class Main {

        public int solution(int n,int m,int[][] arr){
            int answer = 0;

            // 경우의 수 n*n
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    int cnt = 0;
                    for(int k=0; k<m; k++){
                        int pi=0, pj=0; //등수정보
                        for(int s=0;s<n;s++){
                            if(arr[k][s] ==i) pi = s;
                            if(arr[k][s] ==j) pj = s;
                        }
                        if(pi>pj) cnt++;
                    }
                    if(cnt==m) answer++;
                }
            }

            return answer;
        }
        public static void main(String[] args) {
            // write your code here
            com.company.Main T = new com.company.Main();
            Scanner in=new Scanner(System.in);
            int n = in.nextInt();
            int m = in.nextInt();
            int[][] arr = new int[n][m];
            for(int i=0; i<n;i++){
                for(int j=0;j<n;j++)    arr[i][j] = in.nextInt();
            }
            System.out.println(T.solution(n,m,arr));
        }
    }*/

/*
    public class Main {

        public int solution(int n){
            //case1
            int answer = 0;
            int m = n/2+1;
            int lt = 0,sum=0;
            int[] arr = new int[m];
            for(int i=0;i<m;i++) arr[i] = i+1;
            for(int rt=0;rt<m;rt++){
                sum+=arr[rt];
                if(sum==n) answer++;
                while(sum>=n){
                    sum-=arr[lt++];
                    if(sum==n) answer++;
                }
            }
            // case 2
            int answer = 0,cnt=1;
            n--;
            //연속된 자연수의 개수 cnt 1부터 cnt만큼 뺏값을 cnt 로 나눠 떨어지면 참
            while(n>0){
                cnt++;  // 1,2 초기설정
                n = n-cnt;
                if(n%cnt==0) answer++;
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
    }*/
}
