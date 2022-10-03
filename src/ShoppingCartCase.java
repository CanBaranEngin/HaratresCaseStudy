import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingCartCase {

    //public static String sumShoppingCost(){

    //}

    public static List<Integer> findProductsDiscountedList (int[] productArray){
        List<Integer> productCostList = new ArrayList<>();
        List<Integer> productsNotDiscountedList = new ArrayList<>();
        for (int i = 0; i < productArray.length; i++) {
            productCostList.add(productArray[i]);
        }

        for (int j = 0; j < productCostList.size()-1; j++) {
            if(productCostList.get(j)>productCostList.get(j+1)){
                productCostList.set(j,productCostList.get(j)-productCostList.get(j+1));
            }
            else{
                productsNotDiscountedList.add(productCostList.get(j));
            }

        }
        productsNotDiscountedList.add(productCostList.get(productCostList.size()-1));
        Collections.sort(productsNotDiscountedList);

        return productsNotDiscountedList;

    }
}
