import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserLoginComponent } from './user-login/user-login.component';
import { DataRegistrationComponent } from './data-registration/data-registration.component';
import { LogoutComponent } from './logout/logout.component';



const routes: Routes = [
  {path:'',redirectTo: 'login', pathMatch: 'full' },
  {path:'login',component:UserLoginComponent},
  {path:'dataregistration',component:DataRegistrationComponent},
{path:'logout',component:LogoutComponent}]


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
