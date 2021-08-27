import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { InterpolatioAppComponent } from './interpolatio-app/interpolatio-app.component';

@NgModule({
  declarations: [
    AppComponent,
    InterpolatioAppComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
