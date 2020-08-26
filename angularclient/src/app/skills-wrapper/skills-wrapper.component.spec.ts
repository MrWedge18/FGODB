import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SkillsWrapperComponent } from './skills-wrapper.component';

describe('SkillsWrapperComponent', () => {
  let component: SkillsWrapperComponent;
  let fixture: ComponentFixture<SkillsWrapperComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SkillsWrapperComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SkillsWrapperComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
