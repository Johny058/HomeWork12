
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        Author warAndPeace = new Author("Лев Толстой");
        Book warAndPeace = new Book("Война и мир", 1964);
        System.out.println("Автор - " + warAndPeace.getAuthorName());
        System.out.println("Название книги - " + warAndPeace.getBookName());
        System.out.println("Год публикации - " + warAndPeace.getPublishingYear());
        warAndPeace.setPublishingYear(1863);
        System.out.println("Год публикации - " + warAndPeace.getPublishingYear());
        System.out.println(" ");

        Author theMasterAndMargarita = new Author("Михаил Булгаков");
        Book theMasterAndMargarita = new Book("Мастер и Маргарита", 1927);
        System.out.println("Автор - " + theMasterAndMargarita.getAuthorName());
        System.out.println("Название книги - " + theMasterAndMargarita.getBookName());
        System.out.println("Год публикации - " + theMasterAndMargarita.getPublishingYear());
        theMasterAndMargarita.setPublishingYear(1928);
        System.out.println("Год публикации - " + theMasterAndMargarita.getPublishingYear());

    }
}