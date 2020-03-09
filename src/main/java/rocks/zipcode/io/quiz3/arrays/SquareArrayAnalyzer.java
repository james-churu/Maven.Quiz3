package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {

        int count = 0;
        for(int x = 0; x <=  inputArray.length -1; x++){
            Integer num = inputArray[x];
            for(int z = 0; z<= inputArray.length -1; z++){
                if(squaredValues[z] == num * num){
                    count++;
                    break;
                }
            }
        }

        if(count == inputArray.length){
            return true;
        }else {
            return false;
        }
    }
}
