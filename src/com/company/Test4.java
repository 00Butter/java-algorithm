package com.company;

import java.util.*;

public class Test4 {


/*
    public int solution(int n,String str){
        char answer =' ';
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch: str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int max = Integer.MIN_VALUE;

        for(char x:map.keySet()){
            if(map.get(x)>max){
                max = map.get(x);
                answer=x;
            }
        }
        return answer;
    }*/

/*
    //아나그램
    public String solution(String s1,String s2){
        String answer = "YES";
        HashMap<Character,Integer> map = new HashMap<>();
        //s1 채우고
        for(char ch: s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        //s2 비우기
        for(char ch:s2.toCharArray()){
            if(!map.containsKey(ch)|| map.get(ch)==0){
                return "NO";
            }else{
                map.put(ch,map.get(ch)-1);
            }
        }
        return answer;
    }*/

/*
    //연속된 매출 종류
    public ArrayList<Integer> solution(int n, int k,int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<k-1; i++) hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);

        int lt=0;
        for(int rt = k-1; rt<n;rt++){
            hm.put(arr[rt],hm.getOrDefault(arr[rt],0)+1);
            answer.add(hm.size());
            hm.put(arr[lt],hm.get(arr[lt])-1);
            if(hm.get(arr[lt])==0) hm.remove(arr[lt]);
            lt++;
        }

        return answer;
    }*/

/*
    //모든 아나그램 찾기
    public int solution(String s1,String s2){
        int answer = 0;
        HashMap<Character,Integer> am = new HashMap<>();
        HashMap<Character,Integer> bm = new HashMap<>();
        int k = s2.length()-1;
        for(char x:s2.toCharArray()) am.put(x,am.getOrDefault(x,0)+1);
        for(int i=0; i<k;i++){
            bm.put(s1.charAt(i),bm.getOrDefault(s1.charAt(i),0)+1);
        }
        int lt=0;
        for(int rt = k; rt<s1.length();rt++){
            bm.put(s1.charAt(rt),bm.getOrDefault(s1.charAt(rt),0)+1);
            if(am.equals(bm)) answer++;

            bm.put(s1.charAt(lt),bm.get(s1.charAt(lt))-1);
            if(bm.get(s1.charAt(lt))==0) bm.remove(s1.charAt(lt));
            lt++;
        }
        return answer;
    }*/

/*
    //모든 아나그램 찾기
    public int solution(int[] arr,int n, int k){
        int answer = 0;
        TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
                for(int l=j+1;l<n;l++)
                    ts.add(arr[i]+arr[j]+arr[l]);
        int cnt = 0;
        for(int x: ts){
            cnt++;
            if(cnt==k) return x;
        }

        return answer;
    }*/
}
