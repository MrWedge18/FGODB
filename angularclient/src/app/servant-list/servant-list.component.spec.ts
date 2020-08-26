import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ServantListComponent } from './servant-list.component';

describe('ServantListComponent', () => {
  let component: ServantListComponent;
  let fixture: ComponentFixture<ServantListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ServantListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ServantListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
