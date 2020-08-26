import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ServantListComponent } from './servant-list/servant-list.component';
import { ServantDetailsComponent } from './servant-details/servant-details.component';
import { SearchBarComponent } from './search-bar/search-bar.component';
import { SearchResultsComponent } from './search-results/search-results.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

const routes: Routes = [
	{ path: '', component: SearchBarComponent},
	{ path: 'servants', component: ServantListComponent},
	{ path: 'servant/:id', component: ServantDetailsComponent },
	{ path: 'search', component: SearchResultsComponent },
	{ path: '**', component: PageNotFoundComponent }
];

@NgModule({
	imports: [RouterModule.forRoot(routes)],
	exports: [RouterModule]
})
export class AppRoutingModule { }
