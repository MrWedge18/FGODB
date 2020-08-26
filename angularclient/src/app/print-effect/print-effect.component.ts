import { Component, OnInit, Input } from '@angular/core';

import { SkillEffect } from '../model/skill-effect';

@Component({
	selector: 'app-print-effect',
	templateUrl: './print-effect.component.html',
	styleUrls: ['./print-effect.component.css']
})
export class PrintEffectComponent implements OnInit {

	@Input() effect: SkillEffect;

	constructor() { }

	ngOnInit(): void {
	}

}
