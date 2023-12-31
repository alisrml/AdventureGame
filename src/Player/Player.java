package Player;

import java.util.Scanner;
import Character.*;
import Inventory.Inventory;
import Items.Weapon;
import Location.*;


public class Player {
    private int damage;
    private int health;
    private int orjinalHealth;
    private int money;
    private String name;
    private  String charName;
    private Inventory inventory;
    private Scanner input = new Scanner(System.in);

    public Player(String name){
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar(){
        System.out.println("Samuray\tID:1\tHasar:5\tSağlık:21\tPara:15");
        System.out.println("Okçu\tID:2\tHasar:7\tSağlık:18\tPara:20");
        System.out.println("Şovalye\tID:3\tHasar:8\tSağlık:24\tPara:5");
        System.out.print("Karatker ID giriniz: ");
        int k_no = input.nextInt();

        switch (k_no){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }
    }

    public void initPlayer(GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setOrjinalHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }

    public void printInfo(){
        System.out.println("Silahınız:"+this.getInventory().getWeapon().getName()+
                " Hasar: "+this.getTotalDamage()+
                " Zırh: "+this.getInventory().getArmor().getName()+
                " Engelleme: "+this.getInventory().getArmor().getBlock()+
                " Sağlık: "+this.getHealth()+
                " Para: "+this.getMoney());
    }

    public int getDamage() {
        return damage;
    }
    public int getTotalDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getOrjinalHealth() {
        return orjinalHealth;
    }

    public void setOrjinalHealth(int orjinalHealth) {
        this.orjinalHealth = orjinalHealth;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
