
import { Component, OnInit } from '@angular/core';
import { User } from '../models/User';
import { PlanService } from '../plan.service';


@Component({
  selector: 'app-plan-tab',
  templateUrl: './plan-tab.component.html',
  styleUrls: ['./plan-tab.component.css']
})
export class PlanTabComponent implements OnInit {


  user: User = new User();

 
  constructor(private service: PlanService) { }

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


