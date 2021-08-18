import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
;

@Component({
  selector: 'app-plan-tab',
  templateUrl: './plan-tab.component.html',
  styleUrls: ['./plan-tab.component.css']
})
export class PlanTabComponent implements OnInit {

  postId: any;

  constructor() { }

  ngOnInit(): void {}
}
