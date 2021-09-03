import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { DataService } from 'src/app/service/data.service';

@Component({
  selector: 'app-catagory',
  templateUrl: './catagory.component.html',
  styleUrls: ['./catagory.component.css']
})
export class CatagoryComponent implements OnInit {

  public categories: any;
  public img_url='http://rjtmobile.com/grocery/images/'

  constructor(private dataService: DataService,private router: Router) { }

  ngOnInit(): void {
this.dataService.getCatagory().subscribe((data)=>this.categories=data.data)
  }

  onCategorySelected(category: any){
    this.router.navigate(['/products',category.catName,category.catId])
  }
}
