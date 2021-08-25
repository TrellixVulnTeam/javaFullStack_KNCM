function doSomething(){
    for(var i=0;i<5;i++){

        console.log(i)
    }
    console.log('out side scope: '+i)
}

doSomething();

// to run on the terminal write "node demo23"