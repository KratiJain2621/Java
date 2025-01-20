public class distinctElement{
    public static void main(String[] args) {
        int N = 4;
        int[][] M = {
            {2, 1, 4, 3},
            {1, 2, 3, 2},
            {3, 6, 2, 3},
            {5, 2, 5, 3}
        };
        
        // Calling the function to get the count of common distinct elements
        System.out.println(countCommonDistinctElements(M, N));
    }

    public static int countCommonDistinctElements(int[][] M, int N) {
        // Step 1: Sort the first row to facilitate comparison
        java.util.Arrays.sort(M[0]);
        
        int count = 0;
        
        // Step 2: Iterate through each element of the first row
        for (int i = 0; i < N; i++) {
            int element = M[0][i];
            
            // Step 3: Check if this element is present in every row
            boolean isCommon = true;
            for (int row = 1; row < N; row++) {
                boolean found = false;
                // Check if element exists in the current row
                for (int col = 0; col < N; col++) {
                    if (M[row][col] == element) {
                        found = true;
                        break;
                    }
                }
                
                // If the element is not found in this row, it's not common
                if (!found) {
                    isCommon = false;
                    break;
                }
            }
            
            // If the element is common in all rows, increase the count
            if (isCommon) {
                count++;
                
                // Skip duplicate elements in the first row to avoid counting them multiple times
                while (i < N - 1 && M[0][i] == M[0][i + 1]) {
                    i++;
                }
            }
        }
        
        return count;
    }
}
