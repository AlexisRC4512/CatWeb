import { Cats } from './../interfaces/cats.Interfaces';
import { Component, Input, OnInit } from '@angular/core';
import { ServiceRutesService } from '../services/service-rutes.service';

@Component({
  selector: 'app-search-result',
  templateUrl: './search-result.component.html',
  styleUrls: ['./search-result.component.css']
})
export class SearchResultComponent implements OnInit {

    cat!:Cats;
  constructor(private serviceCat:ServiceRutesService) { }

  ngOnInit(): void {
    this.serviceCat.enviar.subscribe(data=>{

      console.log(data);
      this.cat=data[0];
    })
  }

}
