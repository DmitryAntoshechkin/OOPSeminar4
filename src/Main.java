public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Thief> thiefTeam = new Team<>();
        archers.addPers(new Archer("Робин", 100, new Bow(20)))
                .addPers(new Archer("Гуд", 100, new Bow(15)));
        thiefTeam.addPers(new Thief("Джек", 150, new Knife(), new Buckler()))
                .addPers(new Thief("Потрошитель", 150, new Knife(), new Buckler()));
        System.out.println(archers);
        System.out.println();
        System.out.println(thiefTeam);


        Team<Knight> knights = new Team <>();
        knights.addPers(new Knight("Richard", 250, new Sword(), new LargeShield()))
                .addPers(new Knight("Lancelot", 200, new Sword(), new LargeShield()));
        System.out.println(knights);

        Knight richard = new Knight("Richard", 250, new Sword(), new LargeShield());
        Thief jack = new Thief("Джек", 150, new Knife(), new Buckler());
        Battle fight = new Battle(richard,jack);
        fight.run();

    }
}