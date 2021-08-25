class Book {
  

    constructor(public title: string,public author: string,public price: number) {
      
    }


    public getBookInfo() {
        console.log(`Book: Title=${this.title},Author=${this.author},Price=${this.price}`)
    }

}


const book1 = new Book('my title1','md',150);
let book2 = new Book('my title 2','mahi',96);

book1.getBookInfo();
book2.getBookInfo();
