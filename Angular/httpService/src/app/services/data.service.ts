import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Ipost } from '../post.model';
import { Iphoto } from '../photo.model';


@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http: HttpClient) { }

  getPosts(): Observable<Ipost[]>{

    return this.http.get<Ipost[]>('https://jsonplaceholder.typicode.com/posts')
  }
getPhotos(): Observable<Iphoto[]>{
return this.http.get<Iphoto[]>('https://jsonplaceholder.typicode.com/photos')
}


}
