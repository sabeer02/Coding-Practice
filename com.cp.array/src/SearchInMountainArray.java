public class SearchInMountainArray {
    static public int findInMountainArray(int target, MountainArray mountainArr) {
        //length
        int len = mountainArr.length()-1;
        //find peek
        int start =1;
        int end = len-1;

        while(start<end){
            int mid = start + (end - start)/2;

            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                end=mid;
            }else {
                start=mid+1;
            }
        }
        int peek = start;


        start =0;
        end = peek;
        while(start < end) {
            int mid = start + (end - start) / 2;

            if (mountainArr.get(mid)<target) {
                start = mid + 1;
            } else {
                end= mid;
            }
        }

        if (mountainArr.get(start) == target) {
            System.gc();
            return start;
        }

        start =peek+1;
        end = len;

        while(start < end) {
            int mid = start + (end - start) / 2;

            if (mountainArr.get(mid)>target) {
                start = mid + 1;
            } else {
                end= mid;
            }
        }
        if (mountainArr.get(start) == target) {
            System.gc();
            return start;
        }
        System.gc();
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,0};
        MountainArray mountainArr = new MountainArray() {};
        int res = findInMountainArray(2,mountainArr);
        System.out.println(res);
    }
}
