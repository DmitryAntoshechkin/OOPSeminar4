public class Buckler implements Shield{
    @Override
    public int blockedDamage() {
        return 5;
    }

    @Override
    public String toString() {
        return String.format("Баклер (блокирует %d урона)", this.blockedDamage());
        }
    }

