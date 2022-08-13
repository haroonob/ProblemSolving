package com.problem.solving.practice.maxarea;

public class MaxContainerArea {
    public int getMaxAreaBruthForce(int height[]){
     //formula to calculate it min(a,b)*(bi-ai)
     int maxArea=0;
     for(int i=0;i<height.length;i++){
         for (int j=i+1;j<height.length;j++){
             int tempArea=Math.min(height[i],height[j])*(j-i);
             maxArea=Math.max(tempArea,maxArea);
         }
     }

     return maxArea;
     }

    public int getMaxAreaTwoPointer(int height[]){
        //formula to calculate it min(a,b)*(bi-ai)
        int maxarea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int width = right - left;
            maxarea = Math.max(maxarea, Math.min(height[left], height[right]) * width);
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxarea;
    }



    public static void main(String[] args) {
        MaxContainerArea maXContainerAreaBruthForce=new MaxContainerArea();
        int array[] = {7, 2, 4, 7, 10};
        System.out.print(maXContainerAreaBruthForce.getMaxAreaBruthForce(array));
    }
}
