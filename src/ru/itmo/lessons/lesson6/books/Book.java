package ru.itmo.lessons.lesson6.books;

// Book классы именуем в единственном числе
// Book и Author наход в одном пакете
public class Book { // ru.itmo.lessons.lesson6.books
// private - доступ только из текущего класса
    private String title;
    private Author author;

    // методы
    // устан знач св-ва title

    public void setTitle(String bookTitle){
        // проверка входящих данных
        if (bookTitle == null || bookTitle.length() < 3) {
            throw new IllegalArgumentException("title не менее 3 символов");

        }
        title = bookTitle;

        /*if (bookTitle != null && bookTitle.length() >=3){
            title = bookTitle;
        }*/

        // устанавливает значение свойства author

        public void setAuthor(){

        }
        if (author == null) {
            throw new IllegalArgumentException("author не мб null ")
        }
        // this - ссылка на текущий объект
        this.author = author;
    }

}
