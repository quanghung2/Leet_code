package althorithm1;

public class DuplicateNumber {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 4, 5, 7, 8, 8};
        System.out.printf("index: ", removeDuplicateNumber(nums));
    }

    public static int removeDuplicateNumber(int[] numbers) {
        int index=1;
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]!=numbers[i-1]){
                numbers[index++]=numbers[i];
            }
        }
        return index;
    }

}


