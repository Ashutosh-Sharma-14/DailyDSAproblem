// https://leetcode.com/problems/sort-characters-by-frequency/description/

package Medium;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    public static void main(String[] args) {

    }

    static String frequencySort(String s){
        String res = "";
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        PriorityQueue<Character> maxheap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        maxheap.addAll(map.keySet());

        while(!maxheap.isEmpty()){
            char c = maxheap.poll();
            for(int i = 0; i < map.get(c);i++){
                res+=c;
            }
        }
        return res;
    }
}
