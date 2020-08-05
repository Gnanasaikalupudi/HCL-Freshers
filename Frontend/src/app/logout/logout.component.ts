import { Component, OnInit,ViewChild, ElementRef } from '@angular/core';

import { UserService } from '../userservice';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Data } from '../data';
import * as XLSX from 'xlsx'; 
import { Login } from '../login';


@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css']
})
export class LogoutComponent implements OnInit {
  

  constructor(private userService:UserService,private route: ActivatedRoute,private router: Router) {}

  ngOnInit() {
     this.data = this.route.snapshot.params['data'];
     this.reLoadData();
    }


  fileName='datatable.xlsx';
  data:Data=new Data();
  user:Login=new Login();
 
  datas: Observable<Data[]>;
  
  
   reLoadData(){
    
      this.userService.getAllData().subscribe(data=>{this.datas=data},error=>console.error());    
      }


    exportToExcel(): void 
    {
       /* table id is passed over here */   
       let element = document.getElementById('excel-table'); 
       const ws: XLSX.WorkSheet =XLSX.utils.table_to_sheet(element);

       /* generate workbook and add the worksheet */
       const wb: XLSX.WorkBook = XLSX.utils.book_new();
       XLSX.utils.book_append_sheet(wb, ws, 'Sheet1');

       /* save to file */
       XLSX.writeFile(wb, this.fileName);
			
    }
}
  


