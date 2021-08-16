import { Injectable } from '@angular/core';
import { HttpClient, HttpEventType } from '@angular/common/http';
import { User } from './models/User';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  url = 'http://localhost:62345/login';
  users: User[] = [];
  constructor(private httpClient: HttpClient) { }

  findAll() : Observable<User[]> {
    // console.log("Inside Service");
    return this.httpClient.get<User[]>(this.url);    
  };
  
}
