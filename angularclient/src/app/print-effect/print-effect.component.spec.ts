import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PrintEffectComponent } from './print-effect.component';

describe('PrintEffectComponent', () => {
  let component: PrintEffectComponent;
  let fixture: ComponentFixture<PrintEffectComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PrintEffectComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PrintEffectComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
