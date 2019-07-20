package leetCode;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        if(height.length==0||height.length==1){
            return 0;
        }
        int maxArea=Integer.MIN_VALUE;
        while(i<j){
            int lower=Math.min(height[i],height[j]);
            maxArea=Math.max(maxArea,lower*(j-i));
            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return maxArea;
    }
}
