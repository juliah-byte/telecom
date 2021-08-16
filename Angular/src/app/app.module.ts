import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
//import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { SummaryComponent } from './summary/summary.component';
import { RegisterComponent } from './register/register.component';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { AccountComponent } from './account/account.component';
import { PlanTabComponent } from './plan-tab/plan-tab.component';
import { BillTabComponent } from './bill-tab/bill-tab.component';
import { DeviceComponent } from './device/device.component';
import { NavigationComponent } from './navigation/navigation.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SummaryComponent,
    RegisterComponent,
    AccountComponent,
    PlanTabComponent,
    BillTabComponent,
    DeviceComponent,
    NavigationComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
