import { Component, OnInit } from '@angular/core';
import { User } from '../models/User';
import { RegisterService } from '../register.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  users: User[] = [];
  user: User = new User("", "", "", "", "");

  constructor(private service: RegisterService) { }

  save(): void {
    this.service.save(this.user).subscribe(data => {
      console.log(data);
    });
    console.log(this.user);
  }
  ngOnInit(): void {
    this.service.findAll().subscribe((data) => {
      this.users = data;
      console.log(this.users);
    });
    
  }

}
