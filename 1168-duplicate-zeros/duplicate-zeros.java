class Solution {
    public void duplicateZeros(int[] arr) {
        int a[]=new int[arr.length];
         int index=0;
        for(int i=0;i<a.length && index<a.length;i++){
            if(arr[i]==0){
                index+=2;
            }else{
                a[index]=arr[i];
                index++;
            }
        }
        for(int i=0;i<a.length;i++){
            arr[i]=a[i];
        }
    }
}