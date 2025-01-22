class SmallestInfiniteSet {
    private byte[] a;
    private int minIndex;

    public SmallestInfiniteSet() {
        this.a = new byte[1001];
        this.minIndex = 0;
    }
    
    public int popSmallest() {
        while(a[minIndex++] == 1);
        a[minIndex - 1] = 1;

        return minIndex;
    }
    
    public void addBack(int num) {
        a[num - 1] = 0;
        minIndex = Math.min(minIndex, num - 1);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */