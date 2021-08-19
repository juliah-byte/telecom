import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import Device from './models/Device';


@Injectable({
  providedIn: 'root'
})
export class DeviceService {

  url = 'http://localhost:62345/phone/username/b/password/a';

  url1 = 'http://localhost:62345/phone/number/';

  constructor(private httpClient: HttpClient) { }

  findAll(): Observable<string[][]>{
    return this.httpClient.get<string[][]>(this.url);
  }

  deletePhoneLine(d:String): Observable<string[]> {
    console.log(this.url1+d)
    return this.httpClient.delete<string[]>(this.url1+d);

  }

  
  
  
}
