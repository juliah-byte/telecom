import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  url = 'http://localhost:62345/register';

  constructor(private httpClient: HttpClient) { }

  validate() {
    
  }
}
