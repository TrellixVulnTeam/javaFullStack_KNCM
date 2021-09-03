import { Component, OnInit } from '@angular/core';
import { AuthService } from 'src/app/service/auth.service';
import { User } from 'src/app/user.model';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  message=''

  countries = ['USA', 'UK', 'BAN']

  userModel = new User('md', 'm@yahoo.com', '3474561230', '1254ss', 'USA', 'male', true);
  

  constructor(private authService: AuthService) { }

  ngOnInit(): void {
  }
  onFormSubmit(){
    this.authService.register(this.userModel).subscribe(response=>{
      console.log(response)
      this.message=response.message;
    })
    
  }
}
