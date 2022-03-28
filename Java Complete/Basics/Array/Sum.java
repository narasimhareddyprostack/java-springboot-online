// int[] a = {10,20,30,40};
class  Test{
    public static void main(String[] args){
        int[] a = {10,20,30,40}; //declaration, creation and initilization
        int total = 0;
        /* for(int value: a){
           total = total+value;
        } */
        for(int i=0; i<=a.length-1; i++){
            total=total +a[i];
        }
        System.out.print(total);
    }
}