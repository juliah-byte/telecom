import { TestBed } from '@angular/core/testing';

import { PlanTabService } from './plan-tab.service';

describe('PlanTabService', () => {
  let service: PlanTabService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PlanTabService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
