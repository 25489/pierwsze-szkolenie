public class Main {
    public static void main(String[] args) {
        //przykladDozadaniaDomowego();

        System.out.println("Hello world");

        Cat Cat1 = new Cat();
        Cat Cat2 = new Cat();
        Cat Cat3 = new Cat();


        Cat1.kolorsiersci = "biały";
        Cat2.znakszczegolny = "łatka";
        Cat3.imie = "plamka";
        System.out.println("Cat 1:" + Cat1.kolorsiersci);
        System.out.println("Cat 2:" + Cat2.znakszczegolny);
        System.out.println("Cat 3:" + Cat3.imie);






    }


    public static void przykladDozadaniaDomowego(){
        System.out.println("Hello world!");

        Osoba osoba1 = new Osoba();
        Osoba osoba2 = new Osoba();

        osoba1.kolorOczu = "niebieki";
        osoba2.kolorOczu = "brązowy";
        System.out.println("Osoba 1: " + osoba1.kolorOczu);
        System.out.println(osoba2.kolorOczu);
    }
}