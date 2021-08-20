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

  url1 = 'http://localhost:62345/plan/username/b/password/a'
  
  constructor(private httpClient: HttpClient) { }

  getBalance() : Observable<any> {

    return this.httpClient.get<any>(this.url);

  }

  findDetails(): Observable<string[][]>{
    console.log("AccountPage")
    console.log(this.url1);
    return this.httpClient.get<string[][]>(this.url1);
  }
}
