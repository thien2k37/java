package School;

public class BlockA extends StudentManager {



    public BlockA() {
    }

    public BlockA(String name, String address, int priority) {
        super(name, address, priority);
    }

    @Override
    public String toString() {
        return  "Block A: Math, Physical, Chemistry; " +  super.toString();
    }
}
