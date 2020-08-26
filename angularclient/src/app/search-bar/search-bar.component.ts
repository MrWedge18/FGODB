import { Component, OnInit } from '@angular/core';
import { ViewEncapsulation } from '@angular/core';
import { Router } from '@angular/router';

import * as $ from 'jquery';
import 'select2';

@Component({
	selector: 'app-search-bar',
	templateUrl: './search-bar.component.html',
	styleUrls: ['./search-bar.component.css']
})
export class SearchBarComponent implements OnInit {

	classes: string[];

	constructor(private router: Router) { }

	ngOnInit(): void {

	}

	process(data): any {
		let results: Object[] = [];
		Object.keys(data).forEach(groupName => {

			let group: Object = {
				"text": groupName,
				"children": []
			}

			data[groupName].forEach(option => {
				group["children"].push({
					"id": groupName + "=" + option,
					"text": option
				})
			})

			results.push(group);
		});

		return { "results": results };
	}

	ngAfterContentInit(): void {
		$('.search').select2({
			dropdownParent: $(".search-body"),
			closeOnSelect: false,
			ajax: {
				url: 'http://localhost:8080/dropdown',
				dataType: 'json',
				processResults: this.process
			}
		});
	}

	onSubmit(): void {
		let data: Object[] = $('#search').select2('data');
		console.log(data)
		let query: String[] = [];
		data.forEach(d => query.push(d['id']));
		console.log(query);
		this.router.navigate(['search/', { q: query }]);
	}

}
