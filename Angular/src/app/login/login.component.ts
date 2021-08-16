import { Component, ElementRef, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from '../login.service';
import { User } from '../models/User';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  user: User = new User("", "", "", "", "");
  users: User[] = [];

  constructor(private service: LoginService, private router: Router) { }

  validate(): void {

    console.log(this.user.username + this.user.password);
    var uName = this.user.username;
    var pass = this.user.password;
    this.service.findAll().subscribe(allUsers => {
      this.users = allUsers;
      for(var i = 0, l = this.users.length; i < l; i++) {
        // console.log("Iteration " + i);
        // console.log(this.users[i].username + " " + this.users[i].password);
        // console.log(this.user.username + " " + this.user.password);
        if((this.users[i].username == uName) && (this.users[i].password == pass)) {
          console.log("Login Successful");
          sessionStorage.setItem('user', uName);
          sessionStorage.setItem('password', pass);
          this.router.navigate(['/Account']);
        }
      }

    });   

    console.log("End of loop");
    
  }

  ngOnInit(): void {
    console.log(sessionStorage.getItem('user'));
    console.log(sessionStorage.getItem('password'));
  }


}
