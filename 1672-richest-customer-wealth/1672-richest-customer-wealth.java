class Solution {
    public int maximumWealth(int[][] accounts) {
        // maximum wealth found so far
        int maxWealth = 0;
        
        // Iterate iover accounts 
        for (int i = 0; i < accounts.length; i++) {
            
            // Initialize wealth of the current customer
            int curWealth = 0;
            // Sum of all the money the current customer has
            for (int j = 0; j < accounts[i].length; j++) {
                curWealth += accounts[i][j];
            }
            // Update if current current customer has more wealth than we have so far
            if (curWealth > maxWealth) {
                maxWealth = curWealth;
            }  
            
        }
        return maxWealth; 
    }
}