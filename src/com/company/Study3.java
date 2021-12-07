package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Study3 {
    // 3-1 두배열 합치기
    //오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램 을 작성하세요.
    //  ▣ 입력설명
    //      첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다. 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
    //      세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다. 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
    //      각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
    //  ▣ 출력설명
    //      오름차순으로 정렬된 배열을 출력합니다.
    //  ▣ 입력예제
    //  3
    //  1 3 5
    //  5
    //  2 3 6 7 9
    //  ▣ 출력예제
    //  1 2 3 3 5 6 7 9
    static class Algorithm1 {
        public ArrayList<Integer> solution(int n,int m,int[] a, int[] b){
            ArrayList<Integer> answer = new ArrayList<>();
            int p1=0,p2=0;
            while(p1<n && p2<m){
                if(a[p1]<b[p2]) answer.add(a[p1++]);
                else answer.add(b[p2++]);
            }
            while(p1<n){
                answer.add(a[p1++]);
            }
            while(p2<m) answer.add(b[p2++]);

            return answer;
        }

        public void exec() {
            // write your code here
            com.company.Study3.Algorithm1 T = new com.company.Study3.Algorithm1();
            Scanner in=new Scanner(System.in);
            int n = in.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n; i++){
                a[i] = in.nextInt();
            }
            int m = in.nextInt();
            int[] b = new int[m];
            for(int i=0;i<n; i++){
                b[i] = in.nextInt();
            }
            for(int x:T.solution(n,m,a,b)) System.out.print(x+" ");
        }
    }

    /* 3-2 공통원소 찾기
     * A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로 그램을 작성하세요.
        ▣ 입력예제 1
        5
        13952
        5
        32578
        ▣ 출력예제 1
        235
     * */
    static class Algorithm2 {
        public ArrayList<Integer> solution(int n,int m,int[] a, int[] b){
            ArrayList<Integer> answer = new ArrayList<>();
            Arrays.sort(a);
            Arrays.sort(b);
            int p1=0,p2=0;
            while(p1<n && p2<m) {
                if (a[p1] == b[p2]) {
                    answer.add(a[p1++]);
                    p2++;
                } else {
                    if (a[p1] < b[p2]) p1++;
                    else p2++;
                }
            }
            return answer;
        }

        public void exec() {
            // write your code here
            com.company.Study3.Algorithm2 T = new com.company.Study3.Algorithm2();
            Scanner in=new Scanner(System.in);
            int n = in.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n; i++){
                a[i] = in.nextInt();
            }
            int m = in.nextInt();
            int[] b = new int[m];
            for(int i=0;i<n; i++){
                b[i] = in.nextInt();
            }
            for(int x:T.solution(n,m,a,b)) System.out.print(x+" ");
        }
    }
    /* 3-3 최대매출
        현수의 아빠는 제과점을 운영합니다. 현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속 된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
        만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
        12 15 11 20 25 10 20 19 13 15
        연속된 3일간의 최대 매출액은 11+20+25=56만원입니다. 여러분이 현수를 도와주세요.
        ▣ 입력예제 1
        10 3
        12 15 11 20 25 10 20 19 13 15
        ▣ 출력예제 1
        56
    * */
    static class Algorithm3 {
        public int solution(int n, int k, int[] arr) {
            int answer = 0, sum = 0;
            for (int i = 0; i < n; i++) {
                if (i < k) {
                    sum += arr[i];
                } else {
                    sum = sum + arr[i] - arr[i - k];

                }
                answer = Math.max(answer, sum);
            }
            return answer;
        }

        public void exec() {
            // write your code here
            com.company.Study3.Algorithm3 T = new com.company.Study3.Algorithm3();
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            System.out.print(T.solution(n, k, a) + " ");
        }
    }
    /* 3-4 연속 부분수열
        N개의 수로 이루어진 수열이 주어집니다.
        이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
        만약 N=8, M=6이고 수열이 다음과 같다면
        12131112
        합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
    * */
    static class Algorithm4 {
        public int solution(int n, int k, int[] arr) {
            int answer = 0, sum = 0, lt = 0;

            for (int rt = 0; rt < n; rt++) {
                sum += arr[rt];
                if (sum == k) answer++;
                while (sum >= k) {
                    sum -= arr[lt++];
                    if (sum == k) answer++;
                }
            }

            return answer;
        }

        public void exec() {
            // write your code here
            com.company.Study3.Algorithm4 T = new com.company.Study3.Algorithm4();
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            System.out.print(T.solution(n, k, a) + " ");
        }
    }
    /* 3-5 연속된 자연수의 합 (two pointers)
        N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
        만약 N=15이면
        7+8=15
        4+5+6=15
        1+2+3+4+5=15
        와 같이 총 3가지의 경우가 존재한다.
    * */
    static class Algorithm5 {
        public int solution(int n) {
            int answer = 0, sum = 0, m = n/2+1;
            int[] arr = new int[m];
            for(int i=0; i<m; i++) arr[i] = i+1;
            int lt=0;
            for (int rt = 0; rt<m; rt++) {
                sum += arr[rt];
                if (sum == n) answer++;
                while (sum >= n) {
                    sum -= arr[lt++];
                    if (sum == n) answer++;
                }
            }
            return answer;
        }

        public void exec() {
            // write your code here
            Algorithm5 T = new Algorithm5();
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            System.out.print(T.solution(n) + " ");
        }
    }
    /* 3-6 최대 길이 연속부분수열
        0과 1로 구성된 길이가 N인 수열이 주어집니다. 여러분은 이 수열에서 최대 k번을 0을 1로 변 경할 수 있습니다. 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.
        만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면 11001101101101
        여러분이 만들 수 있는 1이 연속된 연속부분수열은 1 1 0 0 1 1 1 1 1 1 1 1 0 1 이며 그 길이는 8입니다.

    * */
    static class Algorithm6 {
        public int solution(int n, int k, int[] arr) {
            int answer = 0, sum = 0,cnt =0, lt = 0;
            for (int rt = 0; rt < n; rt++) {
                if(arr[rt]>0) sum++;
                else{
                    cnt++;
                    sum++;
                    while (cnt > k) {
                        if(arr[lt]<1){
                            cnt--;
                        }
                        sum--;
                        lt++;
                    }
                }
                answer = Math.max(answer,sum);
            }
            return answer;
        }

        public void exec() {
            // write your code here
            Algorithm6 T = new Algorithm6();
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            System.out.print(T.solution(n, k, a) + " ");
        }
    }
}
