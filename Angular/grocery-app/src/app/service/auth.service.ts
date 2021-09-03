import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private ENDPOINTS = {
    Register_URL: 'http://apolis-grocery.herokuapp.com/api/auth/register',
    Login_URL: 'http://apolis-grocery.herokuapp.com/api/auth/login',
  };



  constructor(private http : HttpClient) { }


register(data : any): Observable<any>{
return this.http.post<any>(this.ENDPOINTS.Register_URL,data)
}

login(data: any){
  return this.http.post<any>(this.ENDPOINTS.Login_URL,data)
}

logout(){
  localStorage.clear
}

loggedIn(): boolean{
  if(localStorage.getItem('token')){
    return true;
  }else{
    return false;
  }
}

}
