public interface MountainArray {
    int[] arr = {0,1,2,0};
    public default int get(int index) {
        return arr[index];
    };
    public default int length() {
        return arr.length;
    }
}
