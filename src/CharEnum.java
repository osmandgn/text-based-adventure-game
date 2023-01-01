public enum CharEnum {

    SAMURAI(1, 21, 5, 15),
    ARCHER(2,18,7, 20),
    PALADIN(3,24,8,25),
    GIANT(4, 40, 12, 40);


    private int id;
    private int health;
    private int damage;
    private int price;

    CharEnum(int id, int health, int damage, int price){
        this.health = health;
        this.damage = damage;
        this.price = price;
    }

    CharEnum(int id, int damage){
        this.id = id;
        this.damage = damage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
