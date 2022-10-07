class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> result = new ArrayList<String>(n);
        
        for (int i = 1; i <= n; i++) {
            
            String current = "";
            
            if (i % 3 == 0) {
                current += "Fizz";
            } 
            
            if (i % 5 == 0) {
                current += "Buzz";
            } 
            
            if (current.isEmpty()) {
                current += Integer.toString(i);
            }
            
            result.add(current);
        }
        return result;
    }
}