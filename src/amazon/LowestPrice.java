package amazon;

import java.util.HashMap;
import java.util.Map;

public class LowestPrice {
    public static void main(String[] args) {
        String[][] products = {{"10","d0","d1"},{"15","EMPTY","EMPTY"},{"20","d1","EMPTY"}};
        String[][] discounts = {{"d0","1","27"},{"d1","2","5"}};

        Map<String,Discount> dm = new HashMap<>();
        for(String[] d : discounts){
            dm.put(d[0],new Discount(d[0],d[1],Integer.parseInt((d[2]))));
        }
        dm.put("EMPTY",new Discount("","",0));
        int totalPrice = 0;
        for(int i=0;i<products.length; i++){
            int min = Integer.MAX_VALUE;
            int price = Integer.parseInt(products[i][0]);
            for(int j=1; j<products[i].length; j++){
                Discount discount = dm.get(products[i][j]);
                if(discount.type.equals("1")){
                    min = Math.min(min,Math.round(price - (price * (((float)discount.amount /100)))));
                }else if(discount.type.equals("2")){
                    min = Math.min(min,price - discount.amount);
                }else{
                    min = Math.min(min,price-0);
                }
            }
            totalPrice += min;
        }

        System.out.println(totalPrice);
    }

    static class Discount{
        String tag;
        String type;
        Integer amount;
        Discount(String tag, String type, Integer amount){
            this.tag = tag;
            this.type = type;
            this.amount = amount;
        }
    }
}
