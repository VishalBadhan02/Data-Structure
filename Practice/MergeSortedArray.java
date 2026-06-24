// public class merge_sorted_array {
//     public static void main(String[] args) {
//         int [] a = {1,2,3,0,0,0};
//         int [] b = {2,5,6};
//         int m = 3;
//         int n= 3;

//         int [] newArr = new int [m+n];

//         for(int i=0; i<a.length;i++){
//             for(int j=0; j<b.length;j++){
//                 if(a[i]<b[j]){
//                     newArr[i] = a[i];
//                 } else {
//                     newArr[i] = b[i];
//                 }
//             }    
//         }
//         for(int i=0; i<newArr.length;i++){
//             System.err.println(newArr[i]);
//         }
//     }
// }


public class MergeSortedArray {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 0, 0, 0};
        int[] b = {2, 5, 6};

        int m = 3;
        int n = 3;

        int i = m - 1;
        int j = n - 1;

        for (int k = m + n - 1; j >= 0; k--) {
            if (i >= 0 && a[i] > b[j]) {
                a[k] = a[i];
                i--;
            } else {
                a[k] = b[j];
                j--;
            }
        }

        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}