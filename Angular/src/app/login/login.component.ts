import { Component, OnInit } from '@angular/core';
import { LoginService } from '../login.service';
import { User } from '../models/User';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  user: User = new User("", "", "", "", "");

  constructor(private service: LoginService) { }

  validate(): void {

    console.log(this.user.username + this.user.password);
    this.service.validate(this.user);
    
  }

  ngOnInit(): void {
  }

}
