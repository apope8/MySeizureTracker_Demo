import { Injectable } from '@angular/core';
import {Http, Response, Headers, RequestOptions} from '@angular/http';
import { Observable} from 'rxjs-compat/Observable';
import 'rxjs-compat/add/operator/map';
import 'rxjs-compat/add/operator/catch';
import 'rxjs-compat/add/observable/throw';
import{Seizures} from '../seizures';



@Injectable({
  providedIn: 'root'
})
export class SeizureService {

  private baseUrl: string='http://localhost:8080';       //declare base url 
  private headers = new Headers({'Content-Type':'application/json'});     //declare what type of content you will be using
  private options = new RequestOptions({headers:this.headers});       //declare what type of parameters you will be requesting
  private seizure = new Seizures();

  constructor(private _http:Http) { }                    //inject HTTP

  getSeizures(){
    return this._http.get(this.baseUrl+'/seizures', this.options).map((response:Response)=>response.json())
    .catch(this.errorHandler);
  }

  getSeizureById(id:Number){
    return this._http.get(this.baseUrl+'/seizures'+id, this.options).map((response:Response)=>response.json())
    .catch(this.errorHandler);
  }

  deleteSeizure(id:Number){
    console.log('called');
    return this._http.delete(this.baseUrl+'/seizures/'+id,this.options).map((response:Response)=>response.json())
      .catch(this.errorHandler);
  }

  newSeizure(seizure:Seizures){
    return this._http.post(this.baseUrl+'/seizures', JSON.stringify(seizure), this.options).map((response:Response)=>response.json())
    .catch(this.errorHandler);
  }

  updateSeizure(seizure:Seizures){
    return this._http.put(this.baseUrl+'/seizures/', JSON.stringify(seizure), this.options).map((response:Response)=>response.json())
    .catch(this.errorHandler);
  }



  errorHandler(error:Response){
    return Observable.throw(error || 'Server Error');
  }

  setter(seizure:Seizures){
    this.seizure=seizure;
  }

  getter(){
    console.log(this.seizure);
    return this.seizure;
    
  }


}
