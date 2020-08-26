import { Component, OnInit } from '@angular/core';
import { Servant } from '../model/servant';
import { ServantService } from '../service/servant.service';

@Component({
	selector: 'app-servant-list',
	templateUrl: './servant-list.component.html',
	styleUrls: ['./servant-list.component.css']
})
export class ServantListComponent implements OnInit {

	servants: Servant[];

	constructor(private servantService: ServantService) { }

	ngOnInit(): void {
		this.servantService.findAll().subscribe(data => {
			this.servants = data;
		});
	}

}
