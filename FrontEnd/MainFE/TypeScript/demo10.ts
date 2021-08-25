class Book{
    public title:string;
    public author:string;
    public price: number

public getBookInfo(){
    console.log(`Book: Title=${this.title},Author=${this.author},Price=${this.price}`)
}

}


let book1=new Book();
book1.title='my Title';
book1.author='my author'
book1.price=25;

let book2=new Book();
book2.title='my Title 2';
book2.author='my author 2'
book2.price=205;

book2.getBookInfo();
book1.getBookInfo();
