import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './models/User';


@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  url = 'localhost:8080';

  constructor(private httpClient: HttpClient) { }

  findAll() : Observable<User[]>{

    return this.httpClient.get<User[]>(this.url);

  }
  save(user: User) : Observable<User> {
    return this.httpClient.post<User>(this.url, user);
  }
}
