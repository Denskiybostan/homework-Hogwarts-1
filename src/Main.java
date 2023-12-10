public class Main {
    public static void main(String[] args) {

                Griffindor harry = new Griffindor("Гарри поттер", 15, 10, 15, 10, 25);
                Griffindor hermiona = new Griffindor("Гермиона Грейнджер", 10, 20, 30, 10,10);
                Griffindor ron = new Griffindor("Рон Уизли", 15,15,15,15,15);


                Kogtevran chjou = new Kogtevran("Чжоу Чанг", 15, 10,10, 10,10,10);
                Kogtevran padma = new Kogtevran("Падма Патил", 10,10,10,10,10,10);
                Kogtevran marcus = new Kogtevran("Маркус Белби", 13,12,12,14,11,10);


                Slizerin drako = new Slizerin("Драко Малфой", 14,14,14,14,14,14,11);
                Slizerin graham = new Slizerin("Грэхэм Монтегю", 13,13,13,13,13,13,13);
                Slizerin gregory = new Slizerin("Грэгори Гойл", 12,12,12,12,12,12,12);

                Puffendui zakhariya = new Puffendui("Захария Смитт", 10,12,11,10, 10);
                Puffendui sedrik = new Puffendui("Седрик Диггори", 9, 8, 10,12,11);
                Puffendui justin = new Puffendui("Джастин Фитч-Флетчли", 10,12,13,10, 9);


                System.out.println(harry.sum());
        harry.compare(ron);
        chjou.compare(marcus);
        drako.compare(graham);
        zakhariya.compare(sedrik);
        System.out.println(harry.toString());
        System.out.println();
        System.out.println(chjou.toString());
        System.out.println();
        System.out.println(drako.toString());
        System.out.println();
        System.out.println(zakhariya.toString());


    }
        
    }
