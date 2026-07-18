class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n=deck.length;
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<n;i++){
            queue.add(i);
        }
        Arrays.sort(deck);
        int[]p=new int[n];
        for(int i=0;i<n;i++){
            p[queue.poll()]=deck[i];
            queue.add(queue.poll());
        }
        return p;
    }
}