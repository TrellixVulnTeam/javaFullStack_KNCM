import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { DataService } from 'src/app/service/data.service';


@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  public catId: any;
  public catName: any;
  public subId: number=1;
  public subCategory:any;
  public products: any;

  public Img_url='http://rjtmobile.com/grocery/images/'

  constructor(private dataService:DataService,private route:ActivatedRoute) { 

    this.catName=this.route.snapshot.paramMap.get('catName');

    this.catId=this.route.snapshot.paramMap.get('catId');

  }
  ngOnInit(): void {
    this.dataService.getSubCategoryByCatId(this.catId).subscribe(
      data => this.subCategory = data
    )

    this.dataService.getProductByCatId(this.catId).subscribe(
      data => {
        this.products = data;
        console.log(data)
      }
      
    )
  }



  onSubCategorySelected(sub: any){
    this.dataService.getProducrBySubId(sub.subId).subscribe(
      data => this.products = data
    )
  }

}
