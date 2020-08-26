import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Servant } from '../model/servant';
import { Observable } from 'rxjs';

@Injectable({
	providedIn: 'root'
})
export class ServantService {

	private servantUrl: string;
	private searchUrl: string;

	constructor(private http: HttpClient) { 
		this.servantUrl = 'http://localhost:8080/servants'
		this.searchUrl = 'http://localhost:8080/search';
	}

	public findAll(): Observable<Servant[]> {
		return this.http.get<Servant[]>(this.servantUrl);
	}

	public getServant(id: Number): Observable<Servant> {
		return this.http.get<Servant>(this.servantUrl + `/${id}`);
	}

	public searchServants(q: String): Observable<Servant[]> {
		return this.http.get<Servant[]>(this.searchUrl + `?q=${q}`);
	}
}
