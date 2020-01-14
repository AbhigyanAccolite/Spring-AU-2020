import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsComponentComponent } from './components/forms-component/forms-component.component';
import { ReactiveFormsModule, FormsModule} from '@angular/forms';
import { ViewFormComponent } from './components/view-form/view-form.component';
import { PageNotFoundComponent } from './components/page-not-found/page-not-found.component';

const appRoutes: Routes = [
  { path: 'form', component: FormsComponentComponent },
  { path: 'view', component: ViewFormComponent },  
  { path: '', redirectTo: '/view', pathMatch: 'full'},  
  { path: '**', component: PageNotFoundComponent }
];

@NgModule({
  declarations: [
    AppComponent,
    FormsComponentComponent,
    ViewFormComponent,
    PageNotFoundComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
