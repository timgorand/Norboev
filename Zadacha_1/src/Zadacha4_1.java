public class Zadacha4_1 {
    class Book {
        private String Name;
        private String author;

        public Book(String title, String author) {
            this.Name = title;
            this.author = author;
        }

        public void info() {
            System.out.println(Name + " - " + author);
        }
    }

    static class Printed_Book extends Book {
        private int pages;

        public Printed_Book(String title, String author, int pages) {
            super(title, author);
            this.pages = pages;
        }

        public void info() {
            System.out.println("Печатная: " + pages + " стр.");
        }
    }

    static class E_Book extends Book {
        private int size;

        public E_Book(String title, String author, int size) {
            super(title, author);
            this.size = size;
        }

        public void info() {
            System.out.println("Электронная: " + size + " МБ");
        }
    }

    static class Library {
        private Book[] books;
        private int count;

        public Library(int size) {
            books = new Book[size];
        }

        public void add(Book b) {
            books[count++] = b;
        }

        public void showAll() {
            for (int i = 0; i < count; i++) {
                books[i].info();
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            Library library = new Library(2);
            library.add(new Printed_Book("Java", "Иванов", 300));
            library.add(new E_Book("Python", "Петров", 5));
            library.showAll();
        }
    }
}
