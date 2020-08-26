import { Component, OnInit, Input } from '@angular/core';
import { PassiveSkill } from '../model/passive-skill';

@Component({
	selector: 'app-passive-skill-details',
	templateUrl: './passive-skill-details.component.html',
	styleUrls: ['./passive-skill-details.component.css']
})
export class PassiveSkillDetailsComponent implements OnInit {

	@Input() skill: PassiveSkill;

	constructor() { }

	ngOnInit(): void {
	}

}
