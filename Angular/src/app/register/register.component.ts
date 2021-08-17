import { Component, OnInit } from '@angular/core';
import { User } from '../models/User';
import { FormControl, FormBuilder, Validators } from '@angular/forms';
import { RegisterService } from '../register.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css'],
})
export class RegisterComponent implements OnInit {
  user: User = new User('', '', '', '', '');

  constructor(
    private formBuilder: FormBuilder,
    private service: RegisterService
  ) {}

  save(): void {
    this.service.save(this.user).subscribe((data) => {
      console.log(data);
    });
    console.log(this.user);
  }

  ngOnInit(): void {}
}
