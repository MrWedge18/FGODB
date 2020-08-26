import { Component, OnInit, Input } from '@angular/core';

import { NoblePhantasm } from '../model/noble-phantasm';

@Component({
	selector: 'app-np-details',
	templateUrl: './np-details.component.html',
	styleUrls: ['./np-details.component.css']
})
export class NpDetailsComponent implements OnInit {

	@Input() noblePhantasm: NoblePhantasm;

	constructor() { }

	ngOnInit(): void {
	}

}
