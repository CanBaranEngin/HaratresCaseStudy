import java.util.*;

import static java.lang.String.valueOf;


public class NearestNumberCase {

    public static String[] createNearestNumberList(int[] numberArray){
        if(numberArray.length<1 || numberArray.length>1000){
            throw new RuntimeException("Please enter valid int array !! ");

        }
        else {
            for (int number: numberArray) {
                if(number<-20000 || number>20000){
                    throw new RuntimeException("Please enter valid int array!! ");
                }
            }
        }
        int checkValue=0;
        int count =0;
        List<Integer> checkValueList = new ArrayList<>();
        List<Integer> indexList = new ArrayList<>();
        List<String> resultList = new ArrayList<>();

        Arrays.sort(numberArray);
        for (int i = 0; i < numberArray.length-1; i++) {
            checkValue=numberArray[i+1]-numberArray[i];
            if(checkValue==0){
                checkValue=19000;
            }
            checkValueList.add(checkValue);
        }
        int minValue=Collections.min(checkValueList);
        for (int j=0;j<checkValueList.size(); j++) {
            if(checkValueList.get(j)==minValue){
                indexList.add(j);
                count++;
            }
        }

        for (int indexValue:indexList) {
            resultList.add(numberArray[indexValue] + " " + numberArray[indexValue + 1]);
        }

        String[] resultArr = new String[resultList.size()];
        resultArr = resultList.toArray(resultArr);

        return resultArr;
    }
}
