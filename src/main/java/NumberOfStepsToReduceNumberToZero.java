public class NumberOfStepsToReduceNumberToZero {
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num !=0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num -= 1;
            }
            ++steps;
        }
        return steps;
        /*
        int steps = 0;
        while (num != 0) {
            num = ((num & 1) == 0) ? num >> 1 : num - 1;
            steps++;
        }
        return steps;
         */
    }
}
