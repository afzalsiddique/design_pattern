package Assignment2;

import java.util.ArrayList;

public class Folder extends Component {
    ArrayList<Component> list = new ArrayList<Component>();
    public Folder(String name, String type){
        this.name = name;
        this.type = type;
    }
    @Override
    public String doubleClick() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(" folder is opened \nContents:\n");
        for (Component x: list) {
            sb.append(x.singleClick());
            sb.append('\n');
        }
        return sb.toString();
    }
    public void add(Component component){
        this.list.add(component);
    }
    public void remove(Component component){
        this.list.remove(component);
    }
}
