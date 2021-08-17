import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DeviceService {

  url = 'http://localhost:62345/telecom/phones';
  constructor(private httpClient: HttpClient) { }

  findAll(): Observable<Device[]>{
    return this.httpClient.get<Device[]>(this.url)
  }
  
  
  
}
