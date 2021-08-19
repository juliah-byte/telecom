import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';


@Injectable({
  providedIn: 'root'
})
export class PlanTabService {

    url = 'http://localhost:62345/plan'

  constructor(private httpClient: HttpClient) {

  }




}
