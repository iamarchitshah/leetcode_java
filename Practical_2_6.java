class Practical_2_6 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int maxCandies = Integer.MIN_VALUE;
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }
        List<Boolean> result = new ArrayList<>();
         for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);

         }
         return result;

    }
}