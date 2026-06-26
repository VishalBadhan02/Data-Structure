public class CountofSmallerNumbersAfterSelf {
    public static void main(String[] args) {
        int [] a ={5,2,6,1};
        int count =0;
        int newArr[] = new int [a.length -1];

        for(int i=0; i<a.length-1;i++){
            for(int j=0; j<a.length-1;j++){
                if(a[i]<a[j]){
                    count++;
                }
            }
        }
         for (int num : newArr) {
            System.out.print(num + " ");
        }
    }

    
}
