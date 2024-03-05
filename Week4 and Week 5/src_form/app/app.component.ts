import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { PlayerService } from './player.service';
import { Player } from './model/player.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webapp';
  submitted=false;
  player :Player={
    playerId:  0,
    playerName: '',
    country: '',
    description: '',
    jerseyNumber:0,
    matchesPlayed:0,
    playerRole: '',
    teamName: ''
  };
constructor(private playerService: PlayerService){
  
}
isValidPlayerRole(role: string): boolean {
  const validRoles = ['Batsman', 'Bowler', 'Keeper', 'All Rounder'];
  return validRoles.includes(role);
}
  onSubmit(playerForm: NgForm) {
    if (playerForm.invalid) {
     alert("Form details are invalid");
      return;
    }
    console.log(playerForm);
    this.playerService.updatePlayer(this.player).subscribe(
      response => {
        console.log('Update successful:', response);
        alert("Form submission successful");
      },
      error => {
        console.error('Update failed:', error);
        alert("Form submission failed. Please try again.");
      }
    );
  }
  }

