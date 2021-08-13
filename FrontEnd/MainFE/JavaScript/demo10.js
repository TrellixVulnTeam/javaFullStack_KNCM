class Book{



    constructor(title,author,price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    getBookInfo(){
        console.log('Book: title:'+this.title +', Author: '+this.author+', Price '+this.price);
    }
}

const book=new Book('102','Md',1000);

book.getBookInfo();