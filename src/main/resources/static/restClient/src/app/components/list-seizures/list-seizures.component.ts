import { Component, OnInit } from '@angular/core';
import {SeizureService} from '../../shared_service/seizure.service';
import {Seizures} from '../../seizures';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-seizures',
  templateUrl: './list-seizures.component.html',
  styleUrls: ['./list-seizures.component.css']
})
export class ListSeizuresComponent implements OnInit {

  public seiz:Seizures[];
  constructor(private _seizureService:SeizureService, private _router:Router){}


  ngOnInit() {
    this._seizureService.getSeizures().subscribe((seiz) =>{
      console.log(seiz);
      this.seiz=seiz;
    }, (error) =>{
      console.log(error);
    })
  }

  deleteSeizure(seizureRec){
    console.log('seizureRec ',seizureRec);
    this._seizureService.deleteSeizure(seizureRec.id).subscribe((data)=>{
      console.log('seiz ',this.seiz);
      console.log('this.seiz.indexOf(seizureRec) ',this.seiz.indexOf(seizureRec));
        this.seiz.splice(this.seiz.indexOf(seizureRec),1);
    },(error)=>{
      console.log(error);
    });
  }

  updateSeizure(seizureRec){
    this._seizureService.setter(seizureRec);
    this._router.navigate(['/op']);
  }

  newSeizure(){
    let seizureRec = new Seizures();
    this._seizureService.setter(seizureRec);
    this._router.navigate(['/op']);
  }

}
