package nested;

public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    public void addBook(String title, String author) {
        if (bookCount >= books.length) {
            System.out.println("no more books!");
            return;
        }
        books[bookCount++] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println("== Book List ==");
        for (int i = 0; i < bookCount; i++) {
            Book book = books[i];
            System.out.println("title: " + book.title + ", author: " + book.author);
        }
    }

    private static class Book {
        private final String title;
        private final String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
