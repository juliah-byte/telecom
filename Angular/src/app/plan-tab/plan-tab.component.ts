
import { Component, OnInit } from '@angular/core';
import { User } from '../models/User';
import { PlanService } from '../plan.service';
//import { BsModalRef } from 'ngx-bootstrap/modal';
//import { BsModalService } from 'ngx-bootstrap/modal';
//import { ViewChild, ElementRef } from '@angular/core';

@Component({
  selector: 'app-plan-tab',
  templateUrl: './plan-tab.component.html',
  styleUrls: ['./plan-tab.component.css']
})
export class PlanTabComponent implements OnInit {
  //bsModalRef!: BsModalRef;

  user: User = new User();

  //private modalService : BsModalService
  constructor(private service: PlanService) { }

  ngOnInit(): void {
    // console.log("Plan Session User: " + sessionStorage.getItem('user'));
    // console.log("Plan Session Password: " + sessionStorage.getItem('password'));
    this.user.username = sessionStorage.getItem('user');
    this.user.password = sessionStorage.getItem('password');
    console.log("Plan Page User: " + this.user.username);
    console.log("Plan Page Password: " + this.user.password);
  }

  selectBasic() : void {
    console.log("selectBasic called");

    this.service.addBasicPlan(this.user).subscribe((data) => {
      window.alert("Basic Plan Added!")
      
    });
    console.log(this.user);

  }

 /**@ViewChild('template')
  elementView!: ElementRef;
    openModalWithComponent() {    
      this.bsModalRef = this.modalService.show(this.elementView);
    }
 */
}


