import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NpDetailsComponent } from './np-details.component';

describe('NpDetailsComponent', () => {
  let component: NpDetailsComponent;
  let fixture: ComponentFixture<NpDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NpDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NpDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
