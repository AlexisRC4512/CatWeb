import { Cats } from './../interfaces/cats.Interfaces';
import { ServiceRutesService } from './../services/service-rutes.service';
import { Component, OnInit } from '@angular/core';
import { tap } from 'rxjs';

@Component({
  selector: 'app-cats',
  templateUrl: './cats.component.html',
  styleUrls: ['./cats.component.css']
})
export class CatsComponent implements OnInit {
  cats!: Cats[];
  constructor(private catServices :ServiceRutesService) { }

  ngOnInit(): void {
    this.catServices.getAll().pipe(
      tap((cat:Cats[])=>this.cats=cat.slice(0,4))
    ).subscribe();
  }

}
