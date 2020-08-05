import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DataRegistrationComponent } from './data-registration.component';

describe('DataRegistrationComponent', () => {
  let component: DataRegistrationComponent;
  let fixture: ComponentFixture<DataRegistrationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DataRegistrationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DataRegistrationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
