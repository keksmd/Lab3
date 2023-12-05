package Utilites;

abstract public class Ownable {
    private String name;

    public Ownable(String n) {
        this.name = n;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Ownable o){
        if(this.toString().split("@")[0].equals(o.toString().split("@")[0])){
            if(this.name.equals(o.name)){
                return true;
            }
        }
        return false;
    }

}
