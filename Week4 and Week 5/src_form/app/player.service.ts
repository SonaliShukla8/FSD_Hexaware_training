import { Injectable } from '@angular/core';
import { Player } from './model/player.model';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {
 
  baseUrl:string="http://localhost:8080/api/player";

  constructor(private http:HttpClient){

  }
  updatePlayer(player: Player) {
    return this.http.put(this.baseUrl+'/updateThePlayer',player)
  }
 
  
}
