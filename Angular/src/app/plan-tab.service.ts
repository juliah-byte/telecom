import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PlanTabService {

    url = 'http://localhost:62345/plan'

  constructor(private httpClient: HttpClient) {

  }

  save(id:BigInteger){
    return null;
  }

}
