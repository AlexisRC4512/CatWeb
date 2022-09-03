
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CatsComponent } from './cats/cats.component';
import { SearchResultComponent } from './search-result/search-result.component';
import { SeeMoreComponent } from './see-more/see-more.component';

const routes: Routes = [
  {path:'SeeMore',component:SeeMoreComponent},
  {path:'',component:CatsComponent},
  {path:"result",component:SearchResultComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
