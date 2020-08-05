import { Component, OnInit } from '@angular/core';
import { Data } from '../data';
import { UserService } from '../userservice';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-data-registration',
  templateUrl: './data-registration.component.html',
  styleUrls: ['./data-registration.component.css']
})
export class DataRegistrationComponent implements OnInit {
 
  
  data:Data=new Data();
  datas: Observable<Data[]>;
  submitted=false;
  myform:NgForm;
    constructor(private userService:UserService,private router:Router) { }
  
    ngOnInit(): void {
      this.reloadData();
    }
  
  
    save(){
      console.log("data");
      this.userService.addData(this.data).subscribe(data=>console.log(data),error=>console.log(error));
       this.router.navigate(['/logout']);
    }

    reloadData(){
    
      this.userService.getAllData().subscribe(data=>{this.datas=data},error=>console.error());    
      }
  onSubmit(){
    this.submitted=true;
    this.save();
    this.reloadData();

  }

 
  
  
}
