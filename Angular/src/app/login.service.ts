import { Injectable } from '@angular/core';
import { HttpClient, HttpEventType } from '@angular/common/http';
import { User } from './models/User';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  user: User = new User("", "", "", "", "");
  users = [];
  url = 'http://localhost:62345/login';

  constructor(private httpClient: HttpClient) { }

  validate(user: User) : Observable<User[]> {
    this.user = user;  
    console.log(user.username + user.password);
    return this.httpClient.get<User[]>(this.url);
    
  };
  
}
