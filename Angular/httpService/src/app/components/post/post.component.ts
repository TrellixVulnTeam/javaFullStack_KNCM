import { Component, OnInit } from '@angular/core';
import { Ipost } from 'src/app/post.model';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit {

  public posts:Ipost[]=[];
  constructor(private dataService:DataService) {
this.dataService.getPosts().subscribe(data=>this.posts=data)

   }

  ngOnInit(): void {
  }

}
