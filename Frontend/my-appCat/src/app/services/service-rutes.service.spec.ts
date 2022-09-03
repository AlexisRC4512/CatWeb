import { TestBed } from '@angular/core/testing';

import { ServiceRutesService } from './service-rutes.service';

describe('ServiceRutesService', () => {
  let service: ServiceRutesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ServiceRutesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
