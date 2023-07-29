
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        Author lev = new Author ("Лев", "Толстой");
        Author michail = new Author ("Михаил", "Булгаков");
        Book warAndPeace = new Book("Война и мир", lev, 1964);
        Book theMasterAndMargarita = new Book("Мастер и Маргарита", michail,1927);
        System.out.println("Автор - " + warAndPeace.getAuthor().getFirstName() + " " +
                warAndPeace.getBookName().getSecondName());
        System.out.println("Название книги - " + warAndPeace.getBookName());
        System.out.println("Год публикации - " + warAndPeace.getPublishingYear());
        warAndPeace.setPublishingYear(1863);
        System.out.println("Год публикации - " + warAndPeace.getPublishingYear());
        System.out.println(" ");

        System.out.println("Автор - " + theMasterAndMargarita.getAuthor().getFirstName()+ " " +
                warAndPeace.getBookName().getSecondName());
        System.out.println("Название книги - " + theMasterAndMargarita.getBookName());
        System.out.println("Год публикации - " + theMasterAndMargarita.getPublishingYear());
        theMasterAndMargarita.setPublishingYear(1928);
        System.out.println("Год публикации - " + theMasterAndMargarita.getPublishingYear());

    }
}