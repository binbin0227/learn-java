public class p02_BlockSearchPlus {
    public static void main(String[] args) {
        int[] arr = new int[]{20, 27, 22, 30, 40, 36, 13, 19, 16, 7, 10, 43, 50, 48};
        Block block1 = new Block(22, 40, 0, 4);
        Block block2 = new Block(13, 20, 5, 8);
        Block block3 = new Block(7, 10, 9, 10);
        Block block4 = new Block(43, 50, 11, 13);
        Block[] arrBlock = new Block[]{block1, block2, block3, block4};
        System.out.println(blockSearchPlus(arrBlock,arr,7));
    }

    public static int blockSearchPlus(Block[] arrBlock,int[] arr, int num) {
        if(SearchBlock(num, arrBlock)==-1){
            return -1;
        }
        for(int i=arrBlock[SearchBlock(num, arrBlock)].getStartIndex();i<=arrBlock[SearchBlock(num, arrBlock)].getEndIndex();i++){
            if (num==arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static int SearchBlock(int num, Block[] arrBlock) {
        for (int i = 0; i < arrBlock.length; i++) {
            if (num >= arrBlock[i].getMin() && num <= arrBlock[i].getMax()) {
                return i;
            }
        }
        return -1;
    }
}

class Block {
    private int min;
    private int max;
    private int startIndex;
    private int endIndex;

    public Block() {
    }

    public Block(int min, int max, int startIndex, int endIndex) {
        this.min = min;
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     *
     * @return min
     */
    public int getMin() {
        return min;
    }

    /**
     * 设置
     *
     * @param min
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * 获取
     *
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     *
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     *
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     *
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     *
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     *
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{min = " + min + ", max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}