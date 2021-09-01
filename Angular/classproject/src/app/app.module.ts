import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ShowOrHideComponent } from './show-or-hide/show-or-hide.component';
import { PipesComponent } from './pipes/pipes.component';
import { CustomePipesComponent } from './custome-pipes/custome-pipes.component';
import{TitlePipe} from './title.pipe';
import { InputOutputComponent } from './input-output/input-output.component'

@NgModule({
  declarations: [
    AppComponent,
    ShowOrHideComponent,
    PipesComponent,
    CustomePipesComponent,
    TitlePipe,
    InputOutputComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
