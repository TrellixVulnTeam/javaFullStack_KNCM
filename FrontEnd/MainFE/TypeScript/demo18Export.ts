
//if you not using default keyword infront of class
//import {User,A,B} from './demo17Export'

//if you  using default keyword infront of a User class
import User,{A,B} from './demo17Export'

let userObj=new User('Md','M@yahoo.com')
userObj.getNameEmail();

