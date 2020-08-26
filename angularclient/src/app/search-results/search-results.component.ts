import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap } from '@angular/router';
import { Location } from '@angular/common';

import { Servant } from '../model/servant';
import { ServantService } from '../service/servant.service';

@Component({
	selector: 'app-search-results',
	templateUrl: './search-results.component.html',
	styleUrls: ['./search-results.component.css']
})
export class SearchResultsComponent implements OnInit {

	query: any;
	servants: Servant[];

	constructor(
		private route: ActivatedRoute,
		private location: Location,
		private servantService: ServantService
	) { }

	ngOnInit(): void {
		this.query = this.route.snapshot.paramMap.get('q');
		console.log("response=" + this.query);
		this.servantService.searchServants(this.query).subscribe(data => 
			this.servants = data);
	}

}
