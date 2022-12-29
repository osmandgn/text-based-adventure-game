public class Test {
    public static void test2(){
        System.out.println(CharEnum.ARCHER.getDamage());
    }

    public static void test(){
        CharEnum.ARCHER.setDamage(10);
        System.out.println(CharEnum.ARCHER.getDamage());
    }

    public static void main(String[] args) {

    }
}
