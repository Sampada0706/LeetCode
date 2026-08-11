class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       int max=0;
       for(int i=0;i<candies.length;i++){
        if(max<candies[i]){
            max=candies[i];
        }
       }
       List<Boolean> arr = new ArrayList<>();

        for(int i=0;i<candies.length;i++){
            int candy=candies[i]+extraCandies;
            if(candy>=max){
                arr.add(true);
            }
            else if(candy<max){
                arr.add(false);
            }

        }
        return arr;
    }
}