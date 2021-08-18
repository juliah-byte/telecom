import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from './models/User';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PlanService {

  url = 'http://localhost:62345/plans';

  constructor(private httpClient: HttpClient) { }

  addBasicPlan(user: User) : Observable<User> {
    console.log("Plan service reached");
    return this.httpClient.post<User>(this.url, user);
  }
}
