package Items;

import Enums.ItemSeize;
import Utilites.Ownable;

public class Item {
    public boolean isFood(){
        return this.toString().split("@")[0].equals("Items.Food");
    }
    public Item(ItemSeize i,String n){
        this.seize = i;
        this.name = n;
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private ItemSeize seize;
    private Ownable owner;

    public Ownable getOwner() {
        return owner;
    }

    public void setOwner(Ownable owner) {
        this.owner = owner;
    }

    public ItemSeize getSeize() {
        return seize;
    }

    public void setSeize(ItemSeize seize) {
        this.seize = seize;
    }
}
