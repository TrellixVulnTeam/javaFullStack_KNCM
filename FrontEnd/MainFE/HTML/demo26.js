const employee={
    fName:'md',
    lName: 'uddin',
    getFullName: function(){

        {

        console.log(this)
        return this.fName+ ''+ this.lName;
    }

    }

}
employee.getFullName();

// to run on the terminal write "node demo26"