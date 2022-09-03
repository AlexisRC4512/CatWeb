import { Component, Input, OnInit } from '@angular/core';
import { Cats } from '../interfaces/cats.Interfaces';
import { ServiceRutesService } from '../services/service-rutes.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

 newRace!:string;
  constructor(private serviceCat:ServiceRutesService) { }
  cat!:Cats
  ngOnInit(): void {
  }
  getCat(val:string):void{
    console.log(val);

      this.newRace=val


   this.serviceCat.getCat(this.newRace).subscribe(data=>{
      console.log(data);
      this.serviceCat.enviar.emit(data);
    });
  }
}
