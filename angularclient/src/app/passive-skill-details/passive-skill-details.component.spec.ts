import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PassiveSkillDetailsComponent } from './passive-skill-details.component';

describe('PassiveSkillDetailsComponent', () => {
  let component: PassiveSkillDetailsComponent;
  let fixture: ComponentFixture<PassiveSkillDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PassiveSkillDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PassiveSkillDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
