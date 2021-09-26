package Assignment2;

public abstract class Component {
    public String name = "";
    public String type="";
    public String singleClick( ){
        return "Name: "+this.name +", "+"Type: "+ this.type;
    }
    public abstract String doubleClick();
}
