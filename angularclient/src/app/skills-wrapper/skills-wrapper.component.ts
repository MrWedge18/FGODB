import { Component, OnInit, Input } from '@angular/core';

import { Skill } from '../model/skill';
import { NoblePhantasm } from '../model/noble-phantasm';

@Component({
	selector: 'app-skills-wrapper',
	templateUrl: './skills-wrapper.component.html',
	styleUrls: ['./skills-wrapper.component.css']
})
export class SkillsWrapperComponent implements OnInit {

	@Input() skills: Skill[];
	@Input() noblePhantasms: NoblePhantasm[];

	constructor() { }

	ngOnInit(): void {
	}

}
