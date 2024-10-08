import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {

        Arrays.sort(people);

        int l = 0;
        int r = people.length - 1;
        int boats = 0;

        while (l <= r) {

            if (people[l] + people[r] <= limit) {
                l++;
            }
            r--;

            boats++;
        }

        return boats;
    }
}