package leetCode;


//1.排序
//2.比较s,e
//Given a collection of intervals, merge all overlapping intervals.
//
//Example 1:
//
//Input: [[1,3],[2,6],[8,10],[15,18]]
//Output: [[1,6],[8,10],[15,18]]
//Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
//Example 2:
//
//Input: [[1,4],[4,5]]
//Output: [[1,5]]
//Explanation: Intervals [1,4] and [4,5] are considered overlapping.
/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntevals {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1) return intervals;
        List<int[]> ans= new ArrayList<>();

        // Sort by ascending starting point
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        int []newIntervals=intervals[0];
        ans.add(newIntervals);
        for(int[] i:intervals){
            if(i[0]<newIntervals[1]){

            }
        }

    }
}
*/