import { Component, OnInit } from '@angular/core';
import { User } from '../models/User';
import { PlanService } from '../plan.service';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';


@Component({
  selector: 'app-plan-tab',
  templateUrl: './plan-tab.component.html',
  styleUrls: ['./plan-tab.component.css']
})
export class PlanTabComponent implements OnInit {


  user: User = new User();
  closeResult: string = '';

 
  constructor(private service: PlanService, private modalService: NgbModal) { }

  openBasic(content:any) {
    this.modalService.open(content, {ariaLabelledBy: 'modal-basic-title'}).result.then((result) => {
      this.closeResult = `Closed with: ${result}`;
    }, (reason) => {
      this.closeResult = `Dismissed ${this.getDismissReason(reason)}`;
    });
  }

  openPremium(content:any) {
    this.modalService.open(content, {ariaLabelledBy: 'modal-basic-title'}).result.then((result) => {
      this.closeResult = `Closed with: ${result}`;
    }, (reason) => {
      this.closeResult = `Dismissed ${this.getDismissReason(reason)}`;
    });
  }

  openDeluxe(content:any) {
    this.modalService.open(content, {ariaLabelledBy: 'modal-basic-title'}).result.then((result) => {
      this.closeResult = `Closed with: ${result}`;
    }, (reason) => {
      this.closeResult = `Dismissed ${this.getDismissReason(reason)}`;
    });
  }

  private getDismissReason(reason: any): string {
    if (reason === ModalDismissReasons.ESC) {
      return 'by pressing ESC';
    } else if (reason === ModalDismissReasons.BACKDROP_CLICK) {
      return 'by clicking on a backdrop';
    } else {
      return  `with: ${reason}`;
    }
  }
  
  ngOnInit(): void {
    this.user.username = sessionStorage.getItem('user');
    this.user.password = sessionStorage.getItem('password');

  }

  selectBasic() : void {
    // console.log("selectBasic called");

    this.service.addBasicPlan(this.user).subscribe((data) => {
      window.alert("Basic Plan Added!");
      
    });
    console.log(this.user);
  }

  selectPremium() : void {
    this.service.addPremiumPlan(this.user).subscribe((data) => {
      window.alert("Premium Plan Added!");
      
    });
  }

  selectDeluxe() : void {
    this.service.addDeluxePlan(this.user).subscribe((data) => {
      window.alert("Deluxe Plan Added!");
    });
  }


}


