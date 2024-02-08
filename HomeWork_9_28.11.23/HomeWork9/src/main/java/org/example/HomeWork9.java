package org.example;

import java.util.Objects;

public class HomeWork9 {

    public class Book implements Comparable<Book> {
        private String name;
        private double price;
        private boolean isPresent;

        public Book(String name, double price, boolean isPresent) {
            this.name = name;
            this.price = price;
            this.isPresent = isPresent;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public boolean isPresent() {
            return isPresent;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return Double.compare(book.price, price) == 0 &&
                    isPresent == book.isPresent &&
                    Objects.equals(name, book.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, price, isPresent);
        }

        @Override
        public int compareTo(Book another) {
            return this.name.compareTo(another.getName());
        }
    }
}
