package School;

public class BlockB extends StudentManager{

    public BlockB() {
    }

    public BlockB(String name, String address, int priority) {
        super(name, address, priority);
    }

    @Override
    public String toString() {
        return "Block B: Math, Chemistry, Biological; " + super.toString() ;
    }
}
