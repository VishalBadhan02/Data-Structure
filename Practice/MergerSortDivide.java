public class MergerSortDivide {
    public void Divide(int left, int right){
        if(left < right){
        System.out.println("divide(" + left + "," + right + ")");

            int mid = (right + left) /2;
            int count =0;
            // for the left half
            System.out.println(count);
            Divide(left, mid);
            count++;
            System.out.println(count);
            // for the right half
            Divide( mid+1, right);
        }
    }
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,5};
        MergerSortDivide msg = new MergerSortDivide();
        msg.Divide(0, a.length-1);
    }
}
