public class Main {
    public static void main(String[] args) {
        DemoClass obiect1 = new DemoClass();
        System.out.println(obiect1.x);
        obiect1.x =6;
        System.out.println(obiect1.x);
        obiect1.afiseazaText();
        DemoClass.afiseazaTextStatic();
        Human cristina = new Human();
        cristina.email = "cris@gmai.com";
        cristina.verify();
        cristina.sendEmail();
        Human john = new Human();
        john.email = "jjjj@gmail.com";
        System.out.println(john.email);
        System.out.println(john.address);
        Book carte2 = new Book();
        carte2.author = "Ion Creanga";
        carte2.title = "Amintiri din copilarie";
        System.out.println(carte2.afiseaza());
        System.out.println(carte2.price);
        Book book3 = new Book(150, "Marile sperante");
        cristina.planet = "Earth";
        john.planet = "Mars";
        System.out.println(cristina.planet + john.planet);
        System.out.println("---------------------------------------");
        //HW
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("Pisica","verde",false);
        animal1.mananca();
        animal1.doarme();
        System.out.println(animal1.method1());
        animal2.mananca();
        animal2.doarme();
        System.out.println(animal2.method1());


        Animal animal3 = new Animal();
        Animal animal4 = new Animal();
        Animal animal5 = new Animal();
        animal3.nume = "caine";
        animal4.nume = "papagal";
        animal5.nume = "caracatita";
        animal3.setNrPicioare(4);
        animal4.setNrPicioare(2);
        animal5.setNrPicioare(8);
        animal3.picioare();
        animal4.picioare();
        animal5.picioare();





    }
}
