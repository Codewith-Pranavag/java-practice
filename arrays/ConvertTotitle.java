class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();
        
        while (columnNumber > 0) {
            columnNumber--; // Adjust to 0-based indexing
            int remainder = columnNumber % 26;
            res.append((char) ('A' + remainder));
            columnNumber /= 26;
        }
        
        return res.reverse().toString();
    }
}

