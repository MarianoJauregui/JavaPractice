package generalPractices.streamPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CostAverage {
    //Find the minimum cost for each project and the average between minimum costs.
    private static final Map<Integer, ArrayList<Integer>> myHashMap = new HashMap<>();
    private static final Map<Integer, Integer> simpleHashMap = new HashMap<>();

    public static void main(String[] args) {
        int[] projects = {0, 1, 2, 1, 2, 0};
        int[] bids = {67,1,3,7,8,5};
        double res = minimumCost(8,projects,bids);
        System.out.println("Result -> " + res);

    }

    public static double minimumCost(double nProjects, int[] projects, int[] bids){
        ArrayList tempList;
        for(int i=0; i<bids.length; i++){
            if(myHashMap.containsKey(projects[i])){
                tempList = myHashMap.get(projects[i]);
                if(tempList == null){
                    tempList = new ArrayList();
                }
                tempList.add(bids[i]);
            } else {
                tempList = new ArrayList();
                tempList.add(bids[i]);
            }
            Collections.sort(tempList);
            myHashMap.put(projects[i], tempList);
            simpleHashMap.put(projects[i], (Integer) tempList.get(0));
        }
        int sumValue = simpleHashMap.values().stream().mapToInt(Integer::intValue).sum();
        return sumValue/nProjects;
    }
}
