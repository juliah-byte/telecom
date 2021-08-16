import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BillTabComponent } from './bill-tab.component';

describe('BillTabComponent', () => {
  let component: BillTabComponent;
  let fixture: ComponentFixture<BillTabComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BillTabComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BillTabComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
