import { Component, OnInit } from '@angular/core';
import { Seizures } from '../../seizures';
import { Router } from '@angular/router';
import { SeizureService} from '../../shared_service/seizure.service'

@Component({
  selector: 'app-seizure-form',
  templateUrl: './seizure-form.component.html',
  styleUrls: ['./seizure-form.component.css']
})
export class SeizureFormComponent implements OnInit {

  private seizure:Seizures;

  constructor(private _seizureService:SeizureService, private _router:Router) { }

  ngOnInit() {
    this.seizure=this._seizureService.getter();
    console.log(this.seizure);
  }

  submitForm(){
    if(this.seizure.id == undefined){
      this._seizureService.newSeizure(this.seizure).subscribe((seizure)=>{
        console.log(seizure);
        this._router.navigate(['/']);
      }, (error)=>{
        console.log(error);
      });
    }else{
      this._seizureService.newSeizure(this.seizure).subscribe((seizure)=>{
        console.log(seizure);
        this._router.navigate(['/']);
      }, (error)=>{
        console.log(error);
      });
    }
  }

}
