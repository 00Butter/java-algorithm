package com.company;
import java.util.*;


class Point implements Comparable<Point>{
    public int x, y;
    Point(int x, int y){
        this.x= x;
        this.y=y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x==o.x) return this.y-o.y;
        else return this.x-o.x;
    }
}


public class Main {
    static String answer = "NO";
    static int n, total = 0;
    boolean flag = false;
    public void dfs(int L,int sum, int[]arr){
        if(flag || sum>total/2) return;
        if(L==n){
            if((total-sum)==sum){
                answer = "YES";
                flag = true;
            }
        }else{
            dfs(L+1,sum+arr[L],arr);
            dfs(L+1,sum,arr);
        }
    }

    public String solution(int n, int[] arr ){
        HashSet<Point> pn = new HashSet<>();
        String answer = "";

        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=n;i++) q.offer(i);
        while(!q.isEmpty()){
            for(int i=1;i<k;i++) q.offer(q.poll());
            q.poll();
            if(q.size()==1) answer=q.poll();
        }
        Integer.bitCount()
        StringBuilder sb = new StringBuilder();
        String str = "";
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.get

        return answer;
    }
    public static void main(String[] args) {
	// write your code here
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        //int n = in.nextInt();
        String str = in.nextLine();
        System.out.println(T.solution(str));
    }
}
