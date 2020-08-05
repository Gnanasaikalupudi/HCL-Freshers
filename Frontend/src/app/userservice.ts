import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Login } from './login';
import { Data } from './data';


@Injectable({
    providedIn: 'root'
  })
  export class UserService {
    
    private baseUrl='http://localhost:9090';
  
    constructor(private http:HttpClient) { }
   
    validateLogin(user:Login):Observable<boolean>{
      console.log("service"+user.userName);
      return this.http.post<boolean>(`${this.baseUrl}`+`/employees/member/login`,user);
    }
    
    addData(data:Data):Observable<Data> {
      return this.http.post<Data>(`${this.baseUrl}`+`/admin/adddata`,data);
    }

    getAllData():Observable<any>{
      return this.http.get(`${this.baseUrl}`+`/admin/list`);
    }
}