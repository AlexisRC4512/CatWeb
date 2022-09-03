import { tap } from 'rxjs';
import { Cats } from './../interfaces/cats.Interfaces';
import { Component, OnInit } from '@angular/core';
import { ServiceRutesService } from '../services/service-rutes.service';

@Component({
  selector: 'app-see-more',
  templateUrl: './see-more.component.html',
  styleUrls: ['./see-more.component.css']
})
export class SeeMoreComponent implements OnInit {
  cats!: Cats[];
  constructor(private catService:ServiceRutesService) { }

  ngOnInit(): void {
    this.catService.getAll().pipe(
      tap((cat:Cats[])=>this.cats=cat)
    ).subscribe();
  }

}
