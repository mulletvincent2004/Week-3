public class App {
    public static void main(String[] args) {

        // Character Class
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();

        // Enemy Class
        Enemy boss = new Enemy();

        boss.damage = 50;
        boss.health = 500;
        boss.armor = 100;
        boss.hasMagicImmunity = true;
        boss.name = "Roshan";
        boss.enemyDialogue();

        Enemy skeleton = new Enemy();

        skeleton.damage = 5;
        skeleton.health = 10;
        skeleton.armor = 5;
        skeleton.hasMagicImmunity = false;
        skeleton.name = "Common Skeleton Warrior";
        skeleton.enemyDialogue();

        Enemy dragon = new Enemy();

        dragon.damage = 40;
        dragon.health = 400;
        dragon.armor = 75;
        dragon.hasMagicImmunity = false;
        dragon.name = "Ancient Wyvern";
        dragon.enemyDialogue();

        Weapon Rifle = new Weapon();

        Rifle.name = "M4A1";
        Rifle.damage = 180;
        Rifle.weight = 3.2f;
        Rifle.rarity = "Legendary";
        Rifle.description = "The M4A1 is a gas-operated, rotating bolt, magazine fed carbine. The M4A1 is an automatic variant of the M4 carbine, which is limited to semi-automatic and 3-round burst fire modes. The M4A1 was designed from the M4 and was adopted by the US Army in 2012. ";
        
        Rifle.displayWeaponDescription();
        Rifle.showAllAttributes();

        // Gear Class

        Gear  Helm = new Gear();

        Helm.nametype = "Stahlhelm";
        Helm.rarity = "Common";
        Helm.weight = 4.2f;
        Helm.description = "The Stahlhelm is a community-created promotional cosmetic item for the Soldier. It is a rimmed steel German army helmet, adorned with a team-colored Team Fortress 2 emblem on the side in a shield decal, instead of the red, white, and black national colors.";

        Helm.displayGearDescription();
        Helm.showAllAttributes();

        Gear BulletProof = new Gear();

        BulletProof.nametype = "Bullet Proof Vest";
        BulletProof.rarity = "Common";
        BulletProof.weight = 62.5f;
        BulletProof.description = "Made to stop bullets from going through";

        BulletProof.displayGearDescription();
        BulletProof.showAllAttributes();





    





        


    }
}