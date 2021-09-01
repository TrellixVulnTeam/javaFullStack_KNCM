import { Component, OnInit } from '@angular/core';
import { Iphoto } from 'src/app/photo.model';
import { DataService } from 'src/app/services/data.service';

@Component({
  selector: 'app-photos',
  templateUrl: './photos.component.html',
  styleUrls: ['./photos.component.css']
})
export class PhotosComponent implements OnInit {

  public photos:Iphoto[]=[];
  constructor(private dataService: DataService) {
    this.dataService.getPhotos().subscribe(data=>this.photos=data)

   }

  ngOnInit(): void {
  }

}
