class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] output = new int[temperatures.length];
        Stack<Integer> tempStack = new Stack<>();
        int t, poppedIndex;

        for (int i=0; i < temperatures.length; i++) {
            t = temperatures[i];
            while (!tempStack.isEmpty() && t > temperatures[tempStack.peek()]) {
                poppedIndex = tempStack.pop();
                output[poppedIndex] = i - poppedIndex;
            }
            tempStack.push(i);
        }
        return output;
    }
}
