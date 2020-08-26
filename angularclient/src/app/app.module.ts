import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ServantListComponent } from './servant-list/servant-list.component';
import { ServantDetailsComponent } from './servant-details/servant-details.component';
import { SearchBarComponent } from './search-bar/search-bar.component';
import { SearchResultsComponent } from './search-results/search-results.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { SkillDetailsComponent } from './skill-details/skill-details.component';
import { SkillsWrapperComponent } from './skills-wrapper/skills-wrapper.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { MatTabsModule } from '@angular/material/tabs';
import { MatExpansionModule } from '@angular/material/expansion';
import { PassiveSkillDetailsComponent } from './passive-skill-details/passive-skill-details.component';
import { NpDetailsComponent } from './np-details/np-details.component';
import { PrintEffectComponent } from './print-effect/print-effect.component';

@NgModule({
  declarations: [
    AppComponent,
    ServantListComponent,
    ServantDetailsComponent,
    SearchBarComponent,
    SearchResultsComponent,
    PageNotFoundComponent,
    SkillDetailsComponent,
    SkillsWrapperComponent,
    PassiveSkillDetailsComponent,
    NpDetailsComponent,
    PrintEffectComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatTabsModule,
    MatExpansionModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
