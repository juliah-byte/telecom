import { Component, ElementRef, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.css'],
})
export class AccountComponent implements OnInit {
  constructor(private router: Router) {}

  ngOnInit(): void {
    console.log("Account Page User: " + sessionStorage.getItem('user'));
    console.log("Account Page Password: " + sessionStorage.getItem('password'));
  }
}
