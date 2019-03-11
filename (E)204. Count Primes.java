/**
 * Count the number of prime numbers less than a non-negative number, n.

Example:

Input: 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 */
class Solution {
    public int countPrimes(int n) {
        int count = 0;
        for(int i=2;i<n;i++){
            if(checkPrime(i))
                count++;
        }
        return count;
    }
    
    public boolean checkPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
}