import { Component, ElementRef, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AccountService } from '../account.service';
import { User } from '../models/User';

@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.css'],
})
export class AccountComponent implements OnInit {
  constructor(private router: Router, private service: AccountService) {}
  bill: number = 0;
  user: User = new User('', '', '', '', '', 0);

  accountList : string[][] = [];

  name = sessionStorage.getItem('user');
  


  ngOnInit(): void {
    // console.log("Account Page User: " + sessionStorage.getItem('user'));
    // console.log("Account Page Password: " + sessionStorage.getItem('password')); 
    this.service.getBalance().subscribe((balance) => {
      this.bill = balance;
      // console.log(this.name + " " + this.bill);
      
    });

    this.service.findDetails().subscribe((data)=>{
      this.accountList = data;
      console.log(this.accountList)
    });
    
  }
}
