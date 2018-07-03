import { TestBed, inject } from '@angular/core/testing';

import { SeizureService } from './seizure.service';

describe('SeizureService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [SeizureService]
    });
  });

  it('should be created', inject([SeizureService], (service: SeizureService) => {
    expect(service).toBeTruthy();
  }));
});
