public class LargeShield implements Shield{
    @Override
    public int blockedDamage() {
        return 8;
    }

    @Override
    public String toString() {
        return String.format("Большой щит (блокирует %d урона)", this.blockedDamage());
    }
}

