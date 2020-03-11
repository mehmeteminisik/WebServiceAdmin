import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { WebServiceAdminSharedModule } from 'app/shared/shared.module';
import { HOME_ROUTE } from './home.route';
import { HomeComponent } from './home.component';

@NgModule({
  imports: [WebServiceAdminSharedModule, RouterModule.forChild([HOME_ROUTE])],
  declarations: [HomeComponent]
})
export class WebServiceAdminHomeModule {}
