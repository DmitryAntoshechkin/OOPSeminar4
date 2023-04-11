
    public class Sword implements Weapon{
        @Override
        public int damage() {
            return 10;
        }

        @Override
        public String toString() {
            return String.format("Меч-кладенец (макс.урон %d)", this.damage());
        }
    }

