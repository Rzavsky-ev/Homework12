public class Main {
    public static void main(String[] args) {

        Author tolstoy = new Author("Лев", "Толстой");
        Author sholohov = new Author("Михаил", "Шолохов");

        Book voinaMir = new Book(tolstoy, "Война и мир", 1865);
        Book tihiyDon = new Book(sholohov, "Тихий дон", 1928);


        voinaMir.setYearPublication(1870);
        tihiyDon.setYearPublication(1929);
        System.out.println(voinaMir.getYearPublication() + " " + tihiyDon.getYearPublication());
    }

}