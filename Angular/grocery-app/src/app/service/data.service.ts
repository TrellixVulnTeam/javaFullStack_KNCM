import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class DataService {





  private ENDPOINT={
    catagory_url:'http://apolis-grocery.herokuapp.com/api/category',
    subCategory_url:'http://apolis-grocery.herokuapp.com/api/subcategory/',
    PRODUCT_BY_SUB_URL: 'http://apolis-grocery.herokuapp.com/api/products/sub/',
    PRODUCT_BY_CAT_URL: 'http://apolis-grocery.herokuapp.com/api/products/cat/',

  }
  constructor(private http:HttpClient) { }

  getCatagory(): Observable<any>{
    return this.http.get<any>(this.ENDPOINT.catagory_url)
  }

  getSubCategoryByCatId(catId: number){
    return this.http.get(`${this.ENDPOINT.subCategory_url + catId}`)
  }


  getProductByCatId(catId: number){

return this.http.get(`${this.ENDPOINT.PRODUCT_BY_CAT_URL + catId}`)


  }
getProducrBySubId(subId: number){
return this.http.get(`${this.ENDPOINT.PRODUCT_BY_SUB_URL +subId}`)
}

}
