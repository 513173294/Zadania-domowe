public class Projekt {

    public static void main(String[] args) {
        Zwierze zwierze1 = new Zwierze("Brytyjski", 5, "Kot", "Filip", "srebrzysty", 5.0, "agresywny");



        Zwierze zwierze2 = new Zwierze( "Syberyjski", 3,"Kot", "Danvir", "biały", 6.0,  "łagodny");

        System.out.println(zwierze1.imie);
        System.out.println(zwierze1.rasa);
        System.out.println(zwierze1.plec);
        System.out.println(zwierze1.wiek);
        System.out.println(zwierze1.umaszczenie);
        System.out.println(zwierze1.waga);
        System.out.println(zwierze1.charakter);

        System.out.println(zwierze2.imie);
        System.out.println(zwierze2.rasa);
        System.out.println(zwierze2.plec);
        System.out.println(zwierze2.wiek);
        System.out.println(zwierze2.umaszczenie);
        System.out.println(zwierze2.waga);
        System.out.println(zwierze2.charakter);



}}