import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { TestComponent } from './test/test.component';
import { NgForTrackByComponent } from './ng-for-track-by/ng-for-track-by.component';

@NgModule({
  declarations: [
    AppComponent,
    TestComponent,
    NgForTrackByComponent,
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
