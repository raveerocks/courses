package io.github.raveerocks;
import java.util.ArrayList;

public class Solution {
    
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        
        ArrayList<Interval> mergedInterval = new ArrayList();
        
        mergedInterval.add(intervals.get(0));
        
        int n = intervals.size();
        
        // Each interval is merged with the existing non-overlapping intervals
        
        for(int i=1 ; i<n; i++){
            insert(mergedInterval,intervals.get(i));
        }
        
        return mergedInterval;
    }
    
    public void insert(ArrayList<Interval> intervals, Interval newInterval) {


        // Finding the position where 'newInterval' has to be inserted
        int i = 0;
        while(i<intervals.size() && intervals.get(i).start < newInterval.start){
            i++;
        }

        // 'newInterval' inserted
        intervals.add(i,newInterval);


        int min = newInterval.start;
        int max = newInterval.end;


        // Traversing to the left to merge all overlapping intervals to the left
        while(i>0 && intervals.get(i-1).end>=newInterval.start){
            i = i-1;
            min = Math.min(min,intervals.get(i).start);
            max = Math.max(max,intervals.get(i).end);
            intervals.remove(i);
        }



        // Traversing to the right to merge all overlapping intervals to the right
        i = i+1;
        while(i<intervals.size() && intervals.get(i).start<=newInterval.end){
            max = Math.max(max,intervals.get(i).end);
            intervals.remove(i);
        }

        max = newInterval.end>max?newInterval.end:max;


        // Updating min and max of the new interval accordingly
        i = i-1;
        intervals.get(i).start=min;
        intervals.get(i).end=max;

    }
    
    
}
