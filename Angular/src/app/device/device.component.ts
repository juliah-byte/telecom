import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { DeviceService } from '../device.service';
import Device from '../models/Device';

@Component({
  selector: 'app-device',
  templateUrl: './device.component.html',
  styleUrls: ['./device.component.css'],
})
export class DeviceComponent implements OnInit {


  constructor(private service: DeviceService) {
   }

  deviceList: string[][] = [];
  
  
  ngOnInit(): void {
    this.service.findAll().subscribe((data) => {
      this.deviceList = data;
      console.log(this.deviceList);
    });
  }

  deletePhoneLine(d:String): void{
    this.service.deletePhoneLine(d).subscribe((data) =>{
      this.ngOnInit();
    });

  }

}
