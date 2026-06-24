public class count_inversion{
    public static void main(String[] args) {
        int [] a = {2,4,1,3,5};

        System.out.println(1/2);
        int count =0;
        for(int i=0; i<a.length-1;i++){
            for(int j=i+1; j<a.length-1; j++){
                if(a[i]>a[j]){
                    count++;
                }
            }
            
        }
        System.out.println(count);
    }
}