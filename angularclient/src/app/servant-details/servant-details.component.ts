import { Component, OnInit } from '@angular/core';
import { Servant } from '../model/servant';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';
import { ServantService } from '../service/servant.service';

@Component({
	selector: 'app-servant-details',
	templateUrl: './servant-details.component.html',
	styleUrls: ['./servant-details.component.css']
})
export class ServantDetailsComponent implements OnInit {

	servant: Servant;

	constructor(
		private route: ActivatedRoute,
		private servantService: ServantService,
		private location: Location) { }

	ngOnInit(): void {
		this.getServant();
	}

	getServant(): void {
		const id = +this.route.snapshot.paramMap.get('id');
		this.servantService.getServant(id)
			.subscribe(
				servant => this.servant = servant,
				error => console.log("error"));
	}
}
