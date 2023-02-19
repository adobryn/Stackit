import java.lang.reflect.Array;
import java.util.ArrayList;

public class SomeClass {
/*
[ -5, -1, -2, |3,| *8*, 10]

log(n)
1


 */
    int getIndex(ArrayList<Integer> arr, int element){
        int leftIndex = 0;
        int rightIndex = arr.size() - 1;

        while(leftIndex <= rightIndex) {
            //choose middle index
            int middleIndex = (rightIndex + leftIndex) / 2;

            if (element == arr.get(middleIndex)) {
                return middleIndex;
            }
            if (element < arr.get(middleIndex)) {
                //search in left part of the subarray
                rightIndex = middleIndex - 1;
            } else {
                //search in right part of the subarray
                leftIndex = middleIndex + 1;
            }
        }

        return -1;
    }

}


