package Assignment2;

public class File extends Component{
    public File(String name, String type){
        this.name = name;
        this.type = type;
    }

    @Override
    public String doubleClick() {
        return this.name + "." + this.type + " file is opended";
    }
}
