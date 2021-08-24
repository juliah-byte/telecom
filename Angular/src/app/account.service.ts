import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './models/User';


@Injectable({
  providedIn: 'root'
})
export class AccountService {

  url = 'http://localhost:62345/account';
  user: User[] = [];

  url1 = 'http://localhost:62345/plan/username/'

  url2 = 'http://localhost:62345/user/username/'

 

  username = sessionStorage.getItem('user');
  password = sessionStorage.getItem('password');

  // userId = sessionStorage.setItem()
  
  constructor(private httpClient: HttpClient) { }


  getBalance() : Observable<any> {
    return this.httpClient.post<any>(this.url, sessionStorage.getItem('user'));
  }

  findDetails(): Observable<string[][]>{
    console.log("AccountPage")
    console.log(this.url1 + this.username + '/password/' + this.password);
    return this.httpClient.get<string[][]>(this.url1 + this.username + '/password/' + this.password);
  }

  getName(): Observable<any>{
    
    return this.httpClient.get<any>(this.url2 + this.username)
  }

  getId(): Observable<any>{
     return this.httpClient.get<any>(this.url2+this.username)
  }

}
