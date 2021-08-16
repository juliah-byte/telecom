import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './models/User';


@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  url = 'http://localhost:62345/register';

  constructor(private httpClient: HttpClient) { }

  save(user: User) : Observable<User> {
    return this.httpClient.post<User>(this.url, user);
  }
}
