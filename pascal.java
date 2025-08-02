class Solution {
    public List<List<Integer>> generate(int numRows) {
        List results = new ArrayList<ArrayList<Integer>>();
        List row1 = new ArrayList<Integer>();
        row1.add(1);
        List row2 = new ArrayList<>();
        row2.add(1);
        row2.add(1);
        if(numRows == 1){
            results.add(row1);
        } else if(numRows == 2){
            results.add(row1);
            results.add(row2);
        } else {
            results.add(row1);
            results.add(row2);
            for(int i=3; i<numRows+1; i++){
                List toBeAdded = new ArrayList<>();
                for(int j=0; j<i; j++){
                    if(j==0 || j == i-1){
                        toBeAdded.add(1);
                    } else {
                        List<Integer> listToCheck = (List) results.get(i - 2);
                        int numberToAdd = (int) listToCheck.get(j) + (int) listToCheck.get(j-1);
                        toBeAdded.add(numberToAdd);
                    }

                }
                results.add(toBeAdded);
            }
        }
        return results;
    }
}
