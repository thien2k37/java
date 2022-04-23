package School;

public class BlockC extends StudentManager{

    public BlockC() {
    }

    public BlockC(String name, String address, int priority) {
        super(name, address, priority);
    }

    @Override
    public String toString() {
        return "Block C: Literary, History, Geography; "  + super.toString();
    }
}
