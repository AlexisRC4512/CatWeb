import { Cats } from './../interfaces/cats.Interfaces';
import { EventEmitter, Injectable, Output } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class ServiceRutesService {
  @Output()enviar:EventEmitter<any>=new EventEmitter();
  constructor(private http: HttpClient) { }

  getAll():Observable<Cats[]>{
    return this.http.get<Cats[]>('http://localhost:8080/Cat/ListarGatos')
  }
    getCat(race:string){
    return this.http.get(`http://localhost:8080/Cat/BuscarRaza/${race}`)
  }
}
