import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { SummaryComponent } from './summary/summary.component';
import { AccountComponent } from './account/account.component';

const routes: Routes = [
  {path : '', component: LoginComponent},
  {path: 'Register', component: RegisterComponent},
  {path: 'Account', component: AccountComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes), FormsModule],
  exports: [RouterModule]
})
export class AppRoutingModule { }
