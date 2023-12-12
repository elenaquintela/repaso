public class Fafafa {
    public int radio;

    public Fafafa(int rad) {
        radio = rad;
    };

    public int hashCode() {
        return radio;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Fafafa outro = (Fafafa) obj;
        if (radio != outro.radio) {
            return false;
        } 
        return true;
    }

    
    
    
}
