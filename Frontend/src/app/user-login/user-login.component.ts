import { Component, OnInit } from '@angular/core';
import { Login } from '../login';
import { Router } from '@angular/router';
import { UserService } from '../userservice';

@Component({
  selector: 'app-user-login',
  templateUrl: './user-login.component.html',
  styleUrls: ['./user-login.component.css']
})
export class UserLoginComponent implements OnInit {
  user:Login=new Login();
  result:boolean;
  
  
  constructor(private userService:UserService,private router:Router) { }

  ngOnInit(): void {
  }
  login(){
    this.userService.validateLogin(this.user).subscribe(data=> {this.result=data});
    if(this.result){
      this.router.navigate(['/dataregistration']);
    }
    else if(this.result==false)
    {
      alert("Login Failed, Invalid Username or Password");
    }
  }
 onSubmit(){
   this.login();
  
 }
}
