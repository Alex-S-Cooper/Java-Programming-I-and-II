import java.util.ArrayList;

public class Stack {
    private ArrayList<String> strings;
    
    public Stack() {
        this.strings = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        if (this.strings.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public void add(String value) {
        this.strings.add(value);
    }
    
    public ArrayList<String> values() {
        return this.strings;
    }
    
    public String take() {
        String topmost = this.strings.get(this.strings.size() - 1);
        this.strings.remove(this.strings.size() -1);  
        return topmost;
    }
}
