import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { AccountComponent } from './account/account.component';
import { PlanTabComponent } from './plan-tab/plan-tab.component';
import { DeviceComponent } from './device/device.component';

const routes: Routes = [
  {path : '', component: LoginComponent},
  {path: 'Register', component: RegisterComponent},
  {path: 'Account', component: AccountComponent},
  {path: 'Plan', component: PlanTabComponent},
  {path: 'Device', component: DeviceComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes), FormsModule],
  exports: [RouterModule]
})
export class AppRoutingModule { }
