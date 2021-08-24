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
  accountId: number = 0;
  user: User = new User('', '', '', '', '', 0);

  accountList : string[][] = [];
  planList : string[] = [];



  name = sessionStorage.getItem('user');
  


  ngOnInit(): void {
    this.service.getBalance().subscribe((balance) => {
      this.bill = balance;
      
      
    });

    this.service.getName().subscribe((data) => {
      this.planList = data;
      console.log(this.planList)
    });

    this.service.findDetails().subscribe((data)=>{
      this.accountList = data;
      console.log(this.accountList)
    });

    this.service.getId().subscribe((data)=>{
      this.accountId = data
      console.log(this.accountId)
    });
    
  }
}
