/**
 * 
There are N children standing in a line. Each child is assigned a rating value.

You are giving candies to these children subjected to the following requirements:

Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
What is the minimum candies you must give?

Example 1:

Input: [1,0,2]
Output: 5
Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
Example 2:

Input: [1,2,2]
Output: 4
Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
             The third child gets 1 candy because it satisfies the above two conditions.
 */
class Solution {
    public int candy(int[] ratings) {
        int len=ratings.length;
        if(len==0)
            return 0;
        int count = 1;
        int up=0, down=0, peak=0;
        for(int i=1; i<len; i++){
            if(ratings[i-1]<ratings[i]){
                peak = ++up;
                down = 0;
                count += up+1;
            }
            else if(ratings[i]==ratings[i-1]){                
                peak = 0;
                up = 0;
                down = 0;
                count += 1;                
            }
            else{
                up = 0;
                down++;
                count += 1 + down + (peak >= down ? -1 : 0);
            }
        }
        return count;
    }
}