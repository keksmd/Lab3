package Items;

import Enums.ItemSeize;

public class Food extends Item{
    public Food(int c, ItemSeize i,String n){
        super(i,n);
        if(c>0){
            this.calories = c;
        }else{
            this.calories = 0;
        }
    }
    private int calories;

    public int getCalories() {
        return calories;
    }

}
