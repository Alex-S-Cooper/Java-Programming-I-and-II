public class Hideout<T> {
    private T hideout;
    
    public void putIntoHideout(T toHide) {
        this.hideout = toHide;
    }
    
    public T takeFromHideout() {
        T hideoutObject = this.hideout;
        this.hideout = null;
        return hideoutObject;
    }
    
    public boolean isInHideout() {
        if (this.hideout == null) {
            return false;
        } else {
            return true;
        }
    }
}
