package Game.Shields;

public class Assault  extends Shield{
    public Assault(int size, int armorReserve) {
        super(size, armorReserve);
    }

    @Override
    public String toString() {
        return "Assault{" +
                "armorReserve=" + armorReserve +
                '}';
    }
}
