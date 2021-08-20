import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from './models/User';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PlanService {

  basicUrl = 'http://localhost:62345/plans/addBasic';
  premiumUrl = 'http://localhost:62345/plans/addPremium';
  deluxeUrl = 'http://localhost:62345/plans/addDeluxe';

  constructor(private httpClient: HttpClient) { }

  addBasicPlan(user: User) : Observable<User> {
    console.log("Plan service reached");
    return this.httpClient.post<User>(this.basicUrl, user);
  }

  addPremiumPlan(user: User) : Observable<User> {
    return this.httpClient.post<User>(this.premiumUrl, user);
  }

  addDeluxePlan(user: User) : Observable<User> {
    return this.httpClient.post<User>(this.deluxeUrl, user);
  }
}
