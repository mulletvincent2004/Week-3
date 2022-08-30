public class Weapon {
    
    //Properties/Attributes
    String name;
    int damage;
    String rarity;
    float weight;
    String description;
    

    // Method
    public void displayWeaponDescription() {
        System.out.println("Description: " + description);
}

public void showAllAttributes() {
    System.out.println("Name: " + name);
    System.out.println("Damage: " + damage);
    System.out.println("Rarity: " + rarity);
    System.out.println("Weight: " + weight);
   
}

}