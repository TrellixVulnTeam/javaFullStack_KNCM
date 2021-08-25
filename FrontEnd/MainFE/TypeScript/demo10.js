var Book = /** @class */ (function () {
    function Book() {
    }
    Book.prototype.getBookInfo = function () {
        console.log("Book: Title=" + this.title + ",Author=" + this.author + ",Price=" + this.price);
    };
    return Book;
}());
var book1 = new Book();
book1.title = 'my Title';
book1.author = 'my author';
book1.price = 25;
var book2 = new Book();
book2.title = 'my Title 2';
book2.author = 'my author 2';
book2.price = 205;
book2.getBookInfo();
book1.getBookInfo();
