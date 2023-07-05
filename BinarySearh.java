public class BinarySearh {
    public static void main(String[] args) {

        int [] arrays = {1,2,6,6,7,8,9,11,13,16};
        System.out.println(binarySearcAlgorithm(arrays,9));
    }
    public static int binarySearcAlgorithm(int []arr,int value){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){

            int middlePosition = (low+high)/2;
            int middleNumber = arr[middlePosition];

            if(value == middleNumber){
                return middlePosition;
            }
            if(value<middleNumber){
               high = middlePosition -1;
            }else{
                low = middlePosition+1;
            }

        }
        return -1;

    }
}
