package lesson6;

public class Demo {
    public static void main(String[] args) {
        Autor autor = new Autor(105, "Test");
        Article article = new Article(1, "Header", "test test", autor);
    }
}
