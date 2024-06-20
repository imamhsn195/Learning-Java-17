public class Main {
    public static void main(String[] args) {
        // This is how your code will be called.
        // You can edit this code to try different testing cases.

        String bookName = "Best Software Developer Tips";
        Book book = new Book(bookName);
        String result = book.getName();
        System.out.println(result);
        assert result.equals("Best Software Developer Tips");
    }
}