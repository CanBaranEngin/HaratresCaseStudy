import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingCartCase {
    public static String findProductsNotDiscountedList (int[] productArray){
        //Exception Handling Process
        if(productArray.length<1 || productArray.length>100){
            throw new RuntimeException("Please enter valid int array !! ");

        }
        else {
            for (int number: productArray) {
                if(number<0 || number>2000){
                    throw new RuntimeException("Please enter valid int array!! ");
                }
            }
        }
        List<Integer> productCostList = new ArrayList<>();
        List<Integer> productsNotDiscountedList = new ArrayList<>();
        //Create ArrayList from int array
        for (int i = 0; i < productArray.length; i++) {
            productCostList.add(productArray[i]);
        }
        //Apply discount, update Arraylist and find list of non-discounted products
        for (int j = 0; j < productCostList.size()-1; j++) {
            if(productCostList.get(j)>productCostList.get(j+1)){
                productCostList.set(j,productCostList.get(j)-productCostList.get(j+1));
            }
            else{
                productsNotDiscountedList.add(productCostList.get(j));
            }

        }
        //Add the last value of Arraylist in non-discount product list and sort that list
        productsNotDiscountedList.add(productCostList.get(productCostList.size()-1));
        Collections.sort(productsNotDiscountedList);
        //Print Result
        int totalCost = productCostList.stream()
                .reduce(0, Integer::sum);
        String result = "Total Cost: " + totalCost + " \nList of non-discounted products: " + productsNotDiscountedList.toString();

        return result;
    }

}

