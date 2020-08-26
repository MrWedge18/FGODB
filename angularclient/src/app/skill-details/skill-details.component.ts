import { Component, OnInit, Input } from '@angular/core';
import { Skill } from '../model/skill';

@Component({
	selector: 'app-skill-details',
	templateUrl: './skill-details.component.html',
	styleUrls: ['./skill-details.component.css']
})
export class SkillDetailsComponent implements OnInit {

	@Input() skill: Skill;

	constructor() { }

	ngOnInit(): void {
	}

}
