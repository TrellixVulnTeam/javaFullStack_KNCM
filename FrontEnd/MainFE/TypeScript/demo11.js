var Book = /** @class */ (function () {
    function Book(title, author, price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    Book.prototype.getBookInfo = function () {
        console.log("Book: Title=" + this.title + ",Author=" + this.author + ",Price=" + this.price);
    };
    return Book;
}());
var book1 = new Book('my title1', 'md', 150);
var book2 = new Book('my title 2', 'mahi', 96);
book1.getBookInfo();
book2.getBookInfo();
