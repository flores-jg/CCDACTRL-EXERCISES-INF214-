public class App {
    public static void main(String[] args) throws Exception {
        Weapon Rapier = new Weapon();
        Rapier.damage = 150;
        Rapier.weight = 10;
        Rapier.description = "A divine rapier";
        Rapier.rarity = "Legendary";
        Rapier.name = "Rapier";

        Weapon Crystalys = new Weapon();
        Crystalys.damage = 32;
        Crystalys.weight = 5.5;
        Crystalys.description = "A blade forged from rare crystals, it seeks weak points in enemy armor.";
        Crystalys.rarity = "Rare";
        Crystalys.name = "Crystalys";

        Weapon Desolator = new Weapon();
        Desolator.damage = 50;
        Desolator.weight = 7.5;
        Desolator.description = "A wicked weapon, used in torturing political criminals.";
        Desolator.rarity = "Legendary";
        Desolator.name = "Desolator";
        
    }
}
