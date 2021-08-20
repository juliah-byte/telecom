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
  constructor(private httpClient: HttpClient) { }

  getBalance() : Observable<any> {
    return this.httpClient.post<any>(this.url, sessionStorage.getItem('user'));
  }
}
