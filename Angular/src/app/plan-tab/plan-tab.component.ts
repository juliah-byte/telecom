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
      
    });
    console.log(this.user);

  }

}
